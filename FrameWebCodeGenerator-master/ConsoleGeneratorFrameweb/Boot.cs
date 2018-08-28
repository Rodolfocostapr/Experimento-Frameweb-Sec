using System;
using System.IO;
using System.Threading;

namespace GeradorFrameweb
{
    public class Boot
    {



        public static void StartCheck(ref Config config)
        {
            config = new Config();
            config.dir_template = Utilities.ReadConfig("dir_template");
            config.projeto = config.dir_template + "project" + Path.DirectorySeparatorChar + Utilities.ReadConfig("project");
            config.lang = Utilities.ReadConfig("lang");
            config.dir_output_web = Utilities.ReadConfig("dir_output_web");
            config.dir_output_class = Utilities.ReadConfig("dir_output_class");
            config.ext_class = Utilities.ReadConfig("ext_class");
            config.dir_template_sec_config = Utilities.ReadConfig("dir_template_sec_config");
            config.dir_output_sec = Utilities.ReadConfig("dir_output_sec");
            config.dir_output = "build" + Path.DirectorySeparatorChar;

            try
            {
                if (Directory.Exists(config.dir_output))
                    Directory.Delete(config.dir_output, true);
            }
            catch (Exception)
            {
                Utilities.Log("Falha ao tentar remover o diretório destino, verifique se há alguém arquivo em uso.");
                return;
            }

            Utilities.Log("Remove build dir");
            Thread.Sleep(2000);
            Directory.CreateDirectory(config.dir_output);

            //Now Create all of the directories
            foreach (string dirPath in Directory.GetDirectories(config.projeto, "*",
                SearchOption.AllDirectories))
                Directory.CreateDirectory(dirPath.Replace(config.projeto, config.dir_output));

            //Copy all the files & Replaces any files with the same name
            foreach (string newPath in Directory.GetFiles(config.projeto, "*.*",
                SearchOption.AllDirectories))
                File.Copy(newPath, newPath.Replace(config.projeto, config.dir_output), true);
        }
    }
}
