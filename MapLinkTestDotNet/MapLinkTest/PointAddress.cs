using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MapLinkTest
{

    /*
     * Class that represents the data passed as parameter to the component.
     */ 
    class PointAddress
    {

        private string street;
        private string number;
        private string state;
        private string city;

        public string Street
        {
            get { return street; }
            set { street = value; }
        }
        
        public string Number
        {
            get { return number; }
            set { number = value; }
        }
        
        public string State
        {
            get { return state; }
            set { state = value; }
        }

        public string City
        {
            get { return city; }
            set { city = value; }
        }
    }
}
