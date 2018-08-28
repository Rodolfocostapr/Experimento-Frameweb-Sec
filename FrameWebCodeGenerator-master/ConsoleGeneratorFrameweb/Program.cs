using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Linq;
using System.Xml;

namespace GeradorFrameweb
{
    public class Program
    {
        public static Dictionary<string, string> PROFILE_BD;
        public static Config config;

        public static void Main(string[] args)
        {
            Boot.StartCheck(ref config);

            PROFILE_BD = Load.Profile(Utilities.ReadConfig("dir_profiles"));

            string fileFrameweb;
            if (args != null && args.Count() > 0)
            {
                fileFrameweb = args[0];
            }
            else
            {
                fileFrameweb = "local.frameweb";
            }

            ReadFileAndProcess(fileFrameweb);
        }

        static void ReadFileAndProcess(string file)
        {
            XmlDocument xmlDocument;

            xmlDocument = new XmlDocument();
            xmlDocument.Load(new StreamReader(file));

            string[] nivel_1 = new string[] { "resultDependencyConstraint", "packagedElement" };
            string[] nivel_2 = new string[] { "ownedAttribute", "ownedEnd", "pageTagLib", "ownedOperation", "generalization" };
            string[] nivel_3 = new string[] { "type", "methodType", "ownedParameter" };

            foreach (XmlElement ele in xmlDocument.DocumentElement.SelectNodes("compose"))
            {
                Componete componente = ComponenteFactory.Create(ele);

                foreach (XmlElement sub0 in ele.SelectNodes("packagedElement"))
                {
                    var comp0 = ComponenteFactory.Create(sub0);

                    foreach (var niv in nivel_1)
                    {
                        foreach (XmlElement sub1 in sub0.SelectNodes(niv))
                        {
                            var comp1 = ComponenteFactory.Create(sub1);
                            comp0.Componentes.Add(comp1);

                            foreach (var niv2 in nivel_2)
                            {
                                foreach (XmlElement sub2 in sub1.SelectNodes(niv2))
                                {
                                    var comp2 = ComponenteFactory.Create(sub2);
                                    comp1.Componentes.Add(comp2);

                                    foreach (var niv3 in nivel_3)
                                    {
                                        foreach (XmlElement sub3 in sub2.SelectNodes(niv3))
                                        {
                                            var comp3 = ComponenteFactory.Create(sub3);
                                            comp2.Componentes.Add(comp3);
                                        }
                                    }
                                }
                            }
                        }
                    }

                    componente.Componentes.Add(comp0);
                }

                componente.Process(config);
            }
        }
    }
}
