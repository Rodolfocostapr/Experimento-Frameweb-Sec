using System;
using System.Configuration;
using System.IO;

namespace FrameWebCodeGenerator
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
	}
}
