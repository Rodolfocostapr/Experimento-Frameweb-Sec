using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Diagnostics;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace FrameWebCodeGenerator
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btnSelectFile_Click(object sender, EventArgs e)
        {
            if (ofdFrameweb.ShowDialog() == DialogResult.OK)
            {
                lblFileName.Text = ofdFrameweb.FileName;
            }
        }

        private void btnGenerate_Click(object sender, EventArgs e)
        {
            if (string.IsNullOrWhiteSpace(lblFileName.Text))
                MessageBox.Show("Select the file first");
            else
                Process.Start(@"GeradorFrameweb.exe", "\"" + ofdFrameweb.FileName + "\"");
            //GeradorFrameweb.Program.Main(new string[] { lblFileName.Text });
        }

        private void editToolStripMenuItem_Click(object sender, EventArgs e)
        {
            TagEdit tagEdit = new TagEdit();
            tagEdit.ShowDialog();
        }
    }
}
