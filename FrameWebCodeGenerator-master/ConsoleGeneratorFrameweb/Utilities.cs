using System;
using System.Configuration;
using System.IO;
using System.Linq;

namespace GeradorFrameweb
{
	public static class Utilities
	{
		// For OSX and LINUX
		public static string FixPath(string _value)
		{
            if (_value == null) return null;

			if (Path.DirectorySeparatorChar == '/')
			{
				_value = _value.Replace("\\", "/");
			}
			return _value;
		}

		public static string ReadConfig(string key)
		{
			var _value = ConfigurationManager.AppSettings[key];
			_value = FixPath(_value);

			return _value;
		}

        public static void Log(string log)
        {
            Console.WriteLine(DateTime.Now + " - " + log);
        }

        public static string FirstCharToUpper(string input)
        {
            if (string.IsNullOrEmpty(input))
                return string.Empty;
            return input.First().ToString().ToUpper() + input.Substring(1);
        }

	}
}
