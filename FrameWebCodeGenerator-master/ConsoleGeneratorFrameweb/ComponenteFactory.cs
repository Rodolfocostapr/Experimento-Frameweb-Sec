using System;
using System.Collections.Generic;
using System.Xml;

namespace GeradorFrameweb
{
    public class ComponenteFactory
    {
        public static Componete Create(XmlElement elemento)
        {
            var comp = new Componete();
            comp.tag = elemento.Name;
            comp.Componentes = new List<Componete>();
            AttributeValue(elemento.Attributes, ref comp);
            return comp;
        }

        static void AttributeValue(XmlAttributeCollection itens, ref Componete filho)
        {
            foreach (XmlAttribute item in itens)
            {
                switch (item.Name)
                {
                    case "xsi:type":
                        filho.xsi_type = item.Value;
                        break;
                    case "name":
                        filho.name = item.Value;
                        break;
                    case "type":
                        filho.type = item.Value;
                        break;
                    case "association":
                        filho.association = item.Value;
                        break;
                    case "memberEnd":
                        filho.memberEnd = item.Value;
                        break;
                    case "href":
                        filho.href = item.Value;
                        break;
                    case "client":
                        filho.client = item.Value;
                        break;
                    case "supplier":
                        filho.supplier = item.Value;
                        break;
                    case "resultMethod":
                        filho.resultMethod = item.Value;
                        break;
                    case "methodType":
                        filho.methodType = item.Value;
                        break;
                    case "parameterType":
                        filho.parameterType = item.Value;
                        break;
                    case "visibility":
                        filho.visibility = item.Value;
                        break;
                    case "isAbstract":
                        filho.isAbstract = item.Value.ToString().ToLower().Equals("true");
                        break;
                    case "generalizationSet":
                        filho.generalizationSet = item.Value;
                        break;
                    case "infix":
                        filho.infix = item.Value;
                        break;
                    case "permissionName":
                        filho.permissionName = item.Value;
                        break;
                }
            }

        }
    }
}
