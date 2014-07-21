package br.com.santana.route;

import br.com.maplink2.webservices.ArrayOfRouteStop;
import br.com.maplink2.webservices.Route;
import br.com.maplink2.webservices.RouteDetails;
import br.com.maplink2.webservices.RouteOptions;
import br.com.maplink2.webservices.RouteSoap;
import br.com.maplink2.webservices.RouteTotals;
import br.com.maplink2.webservices.Vehicle;
import br.com.santana.model.RouteData;
import br.com.santana.model.RouteTypeEnum;

public class RouteService {
	
	public RouteData route(ArrayOfRouteStop stops, RouteTypeEnum routeType) {
		
		RouteDetails routeDetails = new RouteDetails();
		routeDetails.setDescriptionType(0);
		routeDetails.setOptimizeRoute(true);
		
		if (RouteTypeEnum.DEFAULT.equals(routeType)) {
			routeDetails.setRouteType(0);
		} else {
			routeDetails.setRouteType(23);
		}
		 
		Vehicle vehicle = new Vehicle();
		vehicle.setTankCapacity(20);
		vehicle.setAverageConsumption(9);
		vehicle.setFuelPrice(3);
		vehicle.setAverageSpeed(60);
		vehicle.setTollFeeCat(2);
		 		
		RouteOptions routeOptions = new RouteOptions();
		routeOptions.setLanguage("pt");
		routeOptions.setRouteDetails(routeDetails);
		routeOptions.setVehicle(vehicle);
		
		Route routeLocator = new Route();
		RouteSoap route = routeLocator.getRouteSoap12();
		RouteTotals total = route.getRouteTotals(stops, routeOptions, RouteComponent.TOKEN);
		 
		RouteData routeData = new RouteData();
		routeData.setTotalCost(total.getTotalCost() + total.getTotalfuelCost());
		routeData.setTotalDistance(total.getTotalDistance());
		routeData.setTotalTime(total.getTotalTime());
		routeData.setTotalFuel(total.getTotalfuelCost());
		
		return routeData;
		
		
	}

}
