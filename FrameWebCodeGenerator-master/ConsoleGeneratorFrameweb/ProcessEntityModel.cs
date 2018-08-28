using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;

namespace GeradorFrameweb
{
    public class ProcessEntityModel : Process
    {


        public ProcessEntityModel(Config _config) : base(_config)
        {
        }


        public override void Execute(Componete componente)
        {

            /// DomainPackage
            var domainClass = componente.Componentes.SelectMany(x => x.Componentes).Where(y => y.xsi_type == "frameweb:DomainClass" ||
                                                                                                y.xsi_type == "frameweb:AuthUser" ||
                                                                                                y.xsi_type == "frameweb:AuthRole" ||
                                                                                                y.xsi_type == "frameweb:AuthPermission").ToList();
            //DICTIONARY FOR THE SECURITY FILE
            var tags_class_sec = new Dictionary<string, string>();
            //domainClass = domainClass.Where(x => x.name == "Person").ToList();

            foreach (var _class in domainClass)
            {
                Componete generalization = null;
                var tags_class = new Dictionary<string, string>();

                tags_class.Add("FW_CLASS_NAME", _class.name);

                if (_class.Componentes != null)
                {
                    generalization = _class.Componentes.Where(x => x.tag == "generalization").FirstOrDefault();

                    if (_class.Componentes.Any(x => x.xsi_type == "frameweb:DomainMethod" && x.isAbstract))
                        tags_class.Add("FW_CLASS_VISIBILITY", "public abstract");
                    else
                        tags_class.Add("FW_CLASS_VISIBILITY", "public");

                    if (generalization != null)
                    {
                        var _generalization = generalization.generalizationSet.Split('/');
                        var _str_generalization = _generalization[_generalization.Length - 1];
                        if (_str_generalization.Contains('.'))
                        {
                            _str_generalization = _str_generalization.Split('.')[0];
                        }
                        tags_class.Add("FW_EXTENDS", "extends " + _str_generalization);
                    }
                    else
                    {
                        tags_class.Add("FW_EXTENDS", string.Empty);
                    }


                    var _class_propeties = _class.Componentes.Where(x => x.xsi_type == "frameweb:DomainAttribute" ||
                                                                         x.xsi_type == "frameweb:AuthUserName" ||
                                                                         x.xsi_type == "frameweb:AuthPassword" ||
                                                                         x.xsi_type == "frameweb:AuthRoleName" ||
                                                                         x.xsi_type == "frameweb:AuthPermName").ToList();

                    string properties = string.Empty;
                    foreach (var propertie in _class_propeties)
                    {
                        var text_parameter = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + propertie.getXsiTypeFile());
                        text_parameter = text_parameter.Replace("FW_PARAMETER_TYPE", propertie.GetTypeDomainAttribute());
                        text_parameter = text_parameter.Replace("FW_PARAMETER_FIRST_UPPER", Utilities.FirstCharToUpper(propertie.name));
                        text_parameter = text_parameter.Replace("FW_PARAMETER", propertie.name);
                        text_parameter = text_parameter.Replace("FW_VISIBILITY", propertie.visibility);

                        properties += text_parameter;
                    }

                    tags_class.Add("FW_CLASS_PARAMETERS", properties);

                    var class_methods = _class.Componentes.Where(x => x.xsi_type == "frameweb:DomainMethod").ToList();

                    string methods = string.Empty;
                    foreach (var method in class_methods)
                    {
                        string text_method;
                        if (method.isAbstract)
                        {
                            text_method = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + "Abstract" + method.getXsiTypeFile());
                            text_method = text_method.Replace("FW_METHOD_VISIBILITY", "public abstract");
                        }
                        else
                        {
                            text_method = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + method.getXsiTypeFile());
                            text_method = text_method.Replace("FW_METHOD_VISIBILITY", "public");
                        }


                        text_method = text_method.Replace("FW_METHOD_RETURN_TYPE", method.GetMethodTypeDomainAttribute());
                        text_method = text_method.Replace("FW_METHOD_NAME", method.name);

                        methods += text_method;
                    }

                    tags_class.Add("FW_CLASS_METHOD", methods);

                }

                var text = File.ReadAllText(config.dir_template + config.lang + Path.DirectorySeparatorChar + _class.getXsiTypeFile());
                foreach (var item in tags_class)
                {
                    text = text.Replace(item.Key, item.Value);
                }

                try
                {
                    Directory.CreateDirectory(Path.Combine(config.dir_output, config.dir_output_class));
                }
                catch
                {
                }
                File.WriteAllText(Path.Combine(config.dir_output, config.dir_output_class, _class.name + config.ext_class), text);

                //GET TAGS FOR THE SECURITY FILE
                switch (_class.xsi_type)
                {
                    case "frameweb:AuthUser":
                        tags_class_sec.Add("FW_AUTH_USER", _class.name);
                        tags_class_sec.Add("FW_USER_ID", _class.Componentes.Where(x => x.xsi_type == "frameweb:IdAttribute").FirstOrDefault().name);
                        tags_class_sec.Add("FW_AUTHAT_USER_USERNAME", _class.Componentes.Where(x => x.xsi_type == "frameweb:AuthUserName").FirstOrDefault().name);
                        tags_class_sec.Add("FW_AUTHAT_USER_PASSWORD", _class.Componentes.Where(x => x.xsi_type == "frameweb:AuthPassword").FirstOrDefault().name);
                        break;
                    case "frameweb:AuthRole":
                        tags_class_sec.Add("FW_AUTH_ROLE", _class.name);
                        tags_class_sec.Add("FW_AUTHAT_ROLE_ROLENAME", _class.Componentes.Where(x => x.xsi_type == "frameweb:AuthRoleName").FirstOrDefault().name);
                        break;
                    case "frameweb:AuthPermission":
                        tags_class_sec.Add("FW_AUTH_PERM", _class.name);
                        tags_class_sec.Add("FW_AUTHAT_PERM_NAME", _class.Componentes.Where(x => x.xsi_type == "frameweb:AuthPermName").FirstOrDefault().name);
                        break;
                }

            }

            var text_sec = "";

            try
            {
                text_sec = File.ReadAllText(Path.Combine(config.dir_output, "src\\sec-config.txt"));
            }
            catch
            {
                text_sec = File.ReadAllText(config.dir_template_sec_config);
            }

            foreach (var item in tags_class_sec)
            {
                text_sec = text_sec.Replace(item.Key, item.Value);
            }

            try
            {
               // Directory.CreateDirectory(Path.Combine(config.dir_output,"src\\sec-config.txt"));
            }
            catch
            {
            }
            File.WriteAllText(Path.Combine(config.dir_output, "src\\sec-config.txt"), text_sec);
        }

    }
}
