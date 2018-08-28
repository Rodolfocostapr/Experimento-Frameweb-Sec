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

namespace FrameWebCodeGenerator
{
    public partial class EditBox : Form
    {
        private string path;
             
        public EditBox(string _path)
        {
            path = _path;
            InitializeComponent();

            if (!System.IO.File.Exists(path))
            {
                MessageBox.Show("File " + path + " not found.");
                Close();
            }
            else
            {
                rtxHTML.Text = File.ReadAllText(path);
            }            
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            File.WriteAllText(path, rtxHTML.Text);
            Close();
        }
    }
}
