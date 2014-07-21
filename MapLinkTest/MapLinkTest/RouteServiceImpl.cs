using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using MapLinkTest.RouteService;

namespace MapLinkTest
{

    /*
     * Class that encapsule all methods related to the routerazation process
     */ 
    class RouteServiceImpl
    {

        RouteSoapClient routeClient = new RouteSoapClient();

        /**
         * Method that receive a list of stops and build the route between these stops.
         */ 
        public RouteInfo GetRoute(RouteStop[] stops, RouteTypeEnum routeType)
        {

            RouteOptions options = new RouteOptions();
            options.language = "pt";
            options.vehicle = new Vehicle();
            options.vehicle.averageConsumption = 10;
            options.vehicle.fuelPrice = 2;
            options.routeDetails = new RouteDetails();
            options.routeDetails.descriptionType = 0;

            if (routeType.Equals(RouteTypeEnum.DEFAULT))
            {
                options.routeDetails.routeType = 0;
            }
            else
            {
                options.routeDetails.routeType = 23;
            }

            RouteInfo routeInfo = routeClient.getRoute(stops, options, AddressServiceImpl.token);
            return routeInfo;
        }

    }
}
