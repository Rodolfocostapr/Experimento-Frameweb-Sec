using System;
using System.Collections.Generic;
using System.IO;
using System.Xml;

namespace GeradorFrameweb
{
    internal class Load
    {
        
        //internal static List<Profile> Profile(string dir)
        //{
        //    List<Profile> profiles = new List<Profile>();

        //    foreach (string file in Directory.EnumerateFiles(dir, "*.frameweb"))
        //    {
        //        XmlDocument xmlDocument = new XmlDocument();
        //        xmlDocument.Load(new StreamReader(file));

        //        Profile profile = CreateProfile(xmlDocument.DocumentElement);
        //        profile.file = file;

        //        foreach (XmlElement sub0 in xmlDocument.DocumentElement.SelectNodes("packagedElement"))
        //        {
        //            var comp0 = CreateProfile(sub0);

        //            profile.Profiles.Add(comp0);
        //            foreach (XmlElement sub1 in sub0.SelectNodes("packagedElement"))
        //            {
        //                var comp1 = CreateProfile(sub1);
        //                comp0.Profiles.Add(comp1);

        //                foreach (XmlElement sub2 in sub1.SelectNodes("nestedClassifier"))
        //                {
        //                    var comp2 = CreateProfile(sub2);
        //                    comp1.Profiles.Add(comp2);
        //                }
        //            }
        //        }

        //        profiles.Add(profile);
        //    }

        //    return profiles;
        //}

        internal static Dictionary<string, string> Profile(string dir)
        {
            Console.WriteLine("Loading profiles");
            Dictionary<string, string> codeGenerationTemplateDB = new Dictionary<string, string>();            

            foreach (string file in Directory.EnumerateFiles(dir, "*.frameweb"))
            {
                XmlDocument xmlDocument = new XmlDocument();
                xmlDocument.Load(new StreamReader(file));

                var file_arr = file.Replace("\\","/").Split('/');
                string key_0 = file_arr[file_arr.Length -1];

                Profile profile = CreateProfile(xmlDocument.DocumentElement);
                profile.file = file;
                Console.WriteLine(string.Format("File: {0}", file));

                XmlNodeList elements = xmlDocument.DocumentElement.SelectNodes("packagedElement");
                foreach (XmlElement sub0 in elements)
                {                    
                    var comp0 = CreateProfile(sub0);
                    string key_1 = comp0.name;

                    profile.Profiles.Add(comp0);
                    foreach (XmlElement sub1 in sub0.SelectNodes("packagedElement"))
                    {                        
                        var comp1 = CreateProfile(sub1);
                        string key_2 = comp1.name;
                        comp0.Profiles.Add(comp1);

                        var subNodes = sub1.SelectNodes("nestedClassifier");
                        if (subNodes != null && subNodes.Count > 0)
                        {
                            foreach (XmlElement sub2 in subNodes)
                            {
                                var comp2 = CreateProfile(sub2);

                                string key_3 = comp2.name;
                                var key = string.Format("{0}#//{1}/{2}/{3}", key_0, key_1, key_2, key_3);                                

                                try
                                {
                                    codeGenerationTemplateDB.Add(key.ToUpper(), comp2.codeGenerationTemplate);
                                }
                                catch (Exception)
                                {
                                    Console.WriteLine("An item with the same key has already been added: ");
                                    Console.WriteLine("key =>" + key);
                                    Console.WriteLine("Press any key to abort");
                                    Console.ReadKey();
                                }                                
                            }
                        }
                        else
                        {
                            var key = string.Format("{0}#//{1}/{2}", key_0,key_1, key_2);
                            
                            try
                            {
                                codeGenerationTemplateDB.Add(key.ToUpper(), comp1.codeGenerationTemplate);
                            }
                            catch (Exception)
                            {
                                Console.WriteLine("An item with the same key has already been added: ");
                                Console.WriteLine("key =>" + key);
                                Console.WriteLine("Press any key to abort");
                                Console.ReadKey();
                            }
                            Console.WriteLine(string.Format("Element: {0}", key));

                        }
                    }
                }
            }

            return codeGenerationTemplateDB;
        }

        static Profile CreateProfile(XmlElement element)
        {
            var profile = new Profile();
            profile.name = element.Name;
            profile.Profiles = new List<Profile>();
            ValueAttribute(element.Attributes, ref profile);
            return profile;
        }

        static void ValueAttribute(XmlAttributeCollection items, ref Profile child)
        {
            foreach (XmlAttribute item in items)
            {
                switch (item.Name)
                {
                    case "xsi:type":
                        child.xsi_type = item.Value;
                        break;
                    case "name":
                        child.name = item.Value;
                        break;
                    case "kind":
                        child.kind = item.Value;
                        break;
                    case "prefix":
                        child.prefix = item.Value;
                        break;
                    case "uri":
                        child.uri = item.Value;
                        break;
                    case "codeGenerationTemplate":
                        child.codeGenerationTemplate = Utilities.FixPath(item.Value);
                        break;
                }
            }

        }
    }
}