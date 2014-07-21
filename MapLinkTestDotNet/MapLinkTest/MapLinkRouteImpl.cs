using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using MapLinkTest.AddressService;
using MapLinkTest.RouteService;

namespace MapLinkTest
{
    /*
     * Enum to choose the type of the route.
     */ 
    enum RouteTypeEnum
    {
        DEFAULT, AVOIDING_TRAFFIC
    }

    class MapLinkRouteImpl : MapLinkRoute
    {

        AddressServiceImpl addressService = new AddressServiceImpl();
        RouteServiceImpl routeService = new RouteServiceImpl();
        
        public RouteResult GetRouteData(List<PointAddress> addresses, RouteTypeEnum routeType)
        {

            validateAddresses(addresses);
            
            List<AddressService.Point> points = addressService.FindAddress(addresses);
            RouteStop [] stops = new RouteStop[points.Count];
            for (int i = 0; i < stops.Length; i++) 
            {
                
                AddressService.Point locationPoint = points.ElementAt(i);

                RouteStop stop = new RouteStop();
                stop.point = new RouteService.Point();
                stop.point.x = locationPoint.x;
                stop.point.y = locationPoint.y;

                stops[i] = stop;

            }

            RouteInfo info = routeService.GetRoute(stops, RouteTypeEnum.DEFAULT);

            RouteResult result = new RouteResult();
            result.TotalCost = info.routeTotals.totalCost + info.routeTotals.totalfuelCost;
            result.TotalDistance = info.routeTotals.totalDistance;
            result.TotalFuel = info.routeTotals.totalFuelUsed;
            result.TotalTime = info.routeTotals.totalTime;

            return result;

        }

        private void validateAddresses(List<PointAddress> addresses)
        {

            if (addresses.Count < 2)
            {
                throw new InvalidAddressesException("Number of addresses must be higher than 2!");
            }

            foreach (PointAddress a in addresses)
            {
                if (a.City == null || a.City.Equals(""))
                {
                    throw new InvalidAddressesException("City is required for all points!");
                }
                if (a.Number == null || a.Number.Equals(""))
                {
                    throw new InvalidAddressesException("Number is required for all points!");
                }
                if (a.State == null || a.State.Equals(""))
                {
                    throw new InvalidAddressesException("State is required for all points!");
                }
                if (a.Street == null || a.Street.Equals(""))
                {
                    throw new InvalidAddressesException("Street is required for all points!");
                }
            }

        }

    }
}
