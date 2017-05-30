using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AgenciaViajes
{
    static class user
    {
        private static string _user = "";
        private static string _pass = "";

        public static string User
        {
            get { return _user; }
            set { _user = value; }
        }
        public static string Pass
        {
            get { return _pass; }
            set { _pass = value; }
        }
    }
}

