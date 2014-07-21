using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MapLinkTest
{

    /*
     * Class that represents the data expected from the component.
     */
    class RouteResult
    {

        private string totalTime;
        private double totalDistance;
        private double totalFuel;
        private double totalCost;

        public string TotalTime
        {
            get { return totalTime; }
            set { totalTime = value; }
        }

        public double TotalDistance
        {
            get { return totalDistance; }
            set { totalDistance = value; }
        }

        public double TotalCost
        {
            get { return totalCost; }
            set { totalCost = value; }
        }

        public double TotalFuel
        {
            get { return totalFuel; }
            set { totalFuel = value; }
        }

    }
}
