using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using MapLinkTest.AddressService;


namespace MapLinkTest
{

    /*
     * Class to test the component developed to calculate the route between some addresses. This class has just a method Main to
     * start the application and call the route component a few times.
     * 
     * There is three examples. 1 - Working. 2 - Just one point to route. 3 - Points with incomplete data.
     * 
     */
    class Program
    {
        static void Main(string[] args)
        {

            AddressServiceImpl service = new AddressServiceImpl();

            // Test 1 - Create some points to test the component
            List<PointAddress> addresses = new List<PointAddress>();
            PointAddress a1 = new PointAddress();
            a1.Street = "Avenida Reboucas";
            a1.City = "São Paulo";
            a1.State = "SP";
            a1.Number = "178";

            PointAddress a2 = new PointAddress();
            a2.Street = "Avenida Paulista";
            a2.City = "São Paulo";
            a2.State = "SP";
            a2.Number = "1000";

            PointAddress a3 = new PointAddress();
            a3.Street = "Rua Alice Hassegawa";
            a3.City = "Lins";
            a3.State = "SP";
            a3.Number = "171";

            addresses.Add(a1);
            addresses.Add(a2);
            addresses.Add(a3);

            MapLinkRoute route = new MapLinkRouteImpl();
            try
            {
                RouteResult result = route.GetRouteData(addresses, RouteTypeEnum.DEFAULT);
                Console.WriteLine("Tempo: " + result.TotalTime);
                Console.WriteLine("Combustivel: " + result.TotalFuel);
                Console.WriteLine("Distancia " + result.TotalDistance);
                Console.WriteLine("Custo total: " + result.TotalCost);
            }
            catch (InvalidAddressesException e)
            {
                Console.WriteLine(e.Message);
            }

            // Test 2 - Just one point to route
            addresses = new List<PointAddress>();
            a1 = new PointAddress();
            a1.Street = "Avenida Reboucas";
            a1.City = "São Paulo";
            a1.State = "SP";
            a1.Number = "178";

            addresses.Add(a1);

            try
            {
                RouteResult result = route.GetRouteData(addresses, RouteTypeEnum.DEFAULT);
                Console.WriteLine("Tempo: " + result.TotalTime);
                Console.WriteLine("Combustivel: " + result.TotalFuel);
                Console.WriteLine("Distancia " + result.TotalDistance);
                Console.WriteLine("Custo total: " + result.TotalCost);
            }
            catch (InvalidAddressesException e)
            {
                Console.WriteLine(e.Message);
            }

            // Test 3 - Point with incomplete data
            addresses = new List<PointAddress>();
            a1 = new PointAddress();
            a1.Street = "Avenida Reboucas";
            a1.Number = "178";

            a2 = new PointAddress();
            a2.Street = "Avenida Paulista";
            a2.Number = "1000";

            addresses.Add(a1);
            addresses.Add(a2);

            try
            {
                RouteResult result = route.GetRouteData(addresses, RouteTypeEnum.DEFAULT);
                Console.WriteLine("Tempo: " + result.TotalTime);
                Console.WriteLine("Combustivel: " + result.TotalFuel);
                Console.WriteLine("Distancia " + result.TotalDistance);
                Console.WriteLine("Custo total: " + result.TotalCost);
            }
            catch (InvalidAddressesException e)
            {
                Console.WriteLine(e.Message);
            }


            Console.ReadKey();

        }
    }
}
