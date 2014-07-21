package br.com.santana.route;

import java.util.ArrayList;
import java.util.List;

import br.com.maplink2.webservices.Address;
import br.com.maplink2.webservices.ArrayOfRouteStop;
import br.com.maplink2.webservices.City;
import br.com.maplink2.webservices.Point;
import br.com.maplink2.webservices.RouteStop;
import br.com.santana.model.PointAddress;
import br.com.santana.model.RouteData;
import br.com.santana.model.RouteTypeEnum;

public class RouteComponent {
	

	public static final String TOKEN = "c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK=";
	
	private RouteService routeService = new RouteService();
	private AddressService addressService = new AddressService();
	
	public RouteData route(List<PointAddress> pointAddresses, RouteTypeEnum routeType) {
		
		List<Address> addresses = new ArrayList<Address>();
		for (PointAddress pa : pointAddresses) {
			Address address = new Address();
			
			City city = new City();
			city.setName(pa.getCity());
			city.setState(pa.getState());
			
			address.setCity(city);
			address.setHouseNumber(pa.getNumber());
			address.setStreet(pa.getStreet());
			
			addresses.add(address);
		}
		
		List<Point> points = addressService.getPoints(addresses);
		ArrayOfRouteStop stops = new ArrayOfRouteStop();
		
		for (Point p : points) {
			RouteStop stop = new RouteStop();
			stop.setPoint(p);
			stops.getRouteStop().add(stop);
		}
		
		return routeService.route(stops, routeType);
		
	}
	

}
