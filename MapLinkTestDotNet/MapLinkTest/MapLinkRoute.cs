using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using MapLinkTest.AddressService;

namespace MapLinkTest
{

    /**
     * Route Component Interface that define the methods that the component implimentation will have to implement. 
     */
    interface MapLinkRoute
    {

        /**
         * Main method of the component, the component will receive a list of addresses and will calculate the route between these
         * addresses. The first thing to do is discover the lat/long of the points and then calculate the distance, cost and other
         * datas of the route between these points.
         * 
         * The method returns a RouteResult object that contains the data about the route.
         * 
         */
        RouteResult GetRouteData(List<PointAddress> addresses, RouteTypeEnum routeType);

    }
}
