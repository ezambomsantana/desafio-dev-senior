using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using MapLinkTest.AddressService;

namespace MapLinkTest
{

    /*
     * Class that encapsulates all methods relateds to the geolocalization proccess 
     */ 
    class AddressServiceImpl 
    {

        AddressFinderSoapClient client = new AddressFinderSoapClient();

        public static string token = "c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK=";

        /*
         * Service that will call the web service of map link to find the lat/long of the addresses. Receives as parameter a list of
         * addresses and returns a list of points.
         * 
         */ 
        public List<Point> FindAddress(List<PointAddress> addresses)
        {

            AddressOptions addressOptions = new AddressOptions();
            addressOptions.usePhonetic = true;
            addressOptions.searchType = 2;
            addressOptions.resultRange = new ResultRange { pageIndex = 1, recordsPerPage = 1 };
            
            List<Point> points = new List<Point>();
            foreach (PointAddress a in addresses)
            {
                Address address = new Address();
                address.city = new City();
                address.city.name = a.City;
                address.city.state = a.State;
                address.street = a.Street;
                address.houseNumber = a.Number;

                AddressInfo info = client.findAddress(address, addressOptions, token);
                points.Add(info.addressLocation[0].point);
            }

            return points;
        }

    }
}
