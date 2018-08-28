using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GeradorFrameweb
{
    public class Profile
    {
        public string codeGenerationTemplate { get; set; }
        public string file { get; set; }
        public string name { get; set; }
        public string kind { get; set; }
        public string xsi_type { get; set; }
        public string uri { get; set; }
        public string prefix { get; set; }
        public List<Profile> Profiles { get; set; }
    }
}
