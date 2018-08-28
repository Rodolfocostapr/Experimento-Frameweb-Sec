using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml;

namespace FrameWebCodeGenerator
{
    public partial class TagEdit : Form
    {
        const string DIR = "profiles/";
        List<string> files = new List<string>();
        List<Profile> profiles;
        public TagEdit()
        {
            InitializeComponent();
            
            foreach (string file in Directory.EnumerateFiles(DIR, "*.frameweb"))
            {
                files.Add(file.Replace(DIR, string.Empty));
            }

            cmbFile.DataSource = files;

        }

        private void cmbFile_SelectedIndexChanged(object sender, EventArgs e)
        {
            profiles = new List<Profile>();
            XmlDocument xmlDocument = new XmlDocument();
            string file = DIR + cmbFile.SelectedItem;
            xmlDocument.Load(new StreamReader(file));

            var file_arr = file.Replace("\\", "/").Split('/');
            string key_0 = file_arr[file_arr.Length - 1];           

            XmlNodeList elements = xmlDocument.DocumentElement.SelectNodes("packagedElement");
            foreach (XmlElement sub0 in elements)
            {
                var comp0 = CreateProfile(sub0);
                string key_1 = comp0.name;

               
                foreach (XmlElement sub1 in sub0.SelectNodes("packagedElement"))
                {
                    var comp1 = CreateProfile(sub1);
                    string key_2 = comp1.name;

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
                                if(!string.IsNullOrWhiteSpace(comp2.codeGenerationTemplate))
                                profiles.Add(new Profile() { name = key_3.ToUpper(), codeGenerationTemplate = comp2.codeGenerationTemplate });
                                
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
                        var key = string.Format("{0}#//{1}/{2}", key_0, key_1, key_2);

                        try
                        {
                            if (!string.IsNullOrWhiteSpace(comp1.codeGenerationTemplate))
                                profiles.Add(new Profile() { name = key_2, codeGenerationTemplate = comp1.codeGenerationTemplate });                            
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

            loadDGV();
        }

        private void loadDGV()
        {
            dgvTags.DataSource = null;
            dgvTags.AutoGenerateColumns = true;
            dgvTags.DataSource = profiles;
        }

        static Profile CreateProfile(XmlElement element)
        {
            var profile = new Profile();
            profile.name = element.Name;
            ValueAttribute(element.Attributes, ref profile);
            return profile;
        }

        static void ValueAttribute(XmlAttributeCollection items, ref Profile child)
        {
            foreach (XmlAttribute item in items)
            {
                switch (item.Name)
                {
                    case "name":
                        child.name = item.Value;
                        break;
                    case "codeGenerationTemplate":
                        child.codeGenerationTemplate = Utilities.FixPath(item.Value);
                        break;
                }
            }

        }

        private void btnFind_Click(object sender, EventArgs e)
        {
            if(string.IsNullOrWhiteSpace(txtFilter.Text))
            {
                cmbFile_SelectedIndexChanged(null, null);
            }
            else
            {
                profiles = profiles.Where(x => x.name.ToUpper().Contains(txtFilter.Text.ToUpper()) || x.codeGenerationTemplate.ToUpper().Contains(txtFilter.Text.ToUpper())).ToList();
                loadDGV();
            }
        }

        private void dgvTags_CellDoubleClick(object sender, DataGridViewCellEventArgs e)
        {
            EditBox editBox = new EditBox(profiles[e.RowIndex].codeGenerationTemplate);
            editBox.ShowDialog();
        }

        private void txtFilter_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                btnFind_Click(null, null);
            }
        }
    }

    public class Profile
    {
        public string codeGenerationTemplate { get; set; }
        public string name { get; set; }
    }
}
