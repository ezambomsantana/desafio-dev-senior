using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MapLinkTest
{
    class InvalidAddressesException : System.Exception
    {

        public InvalidAddressesException(string message) : base(message) { }

    }
}
