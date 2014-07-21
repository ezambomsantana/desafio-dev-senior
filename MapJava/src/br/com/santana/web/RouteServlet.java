package br.com.santana.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.maplink2.webservices.Address;
import br.com.maplink2.webservices.AddressFinder;
import br.com.maplink2.webservices.AddressFinderSoap;
import br.com.maplink2.webservices.ArrayOfRouteStop;
import br.com.maplink2.webservices.City;
import br.com.maplink2.webservices.Point;
import br.com.maplink2.webservices.Route;
import br.com.maplink2.webservices.RouteDetails;
import br.com.maplink2.webservices.RouteOptions;
import br.com.maplink2.webservices.RouteSoap;
import br.com.maplink2.webservices.RouteStop;
import br.com.maplink2.webservices.RouteTotals;
import br.com.maplink2.webservices.Vehicle;


@WebServlet("/RouteServlet")
public class RouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RouteServlet() {
        super();
   }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String TOKEN = "c13iyCvmcC9mzwkLd0LCbmYC5mUF5m2jNGNtNGt6NmK6NJK=";
		
		String originCity = request.getParameter("originCity");
		String originState = request.getParameter("originState");
		String originStreet = request.getParameter("originStreet");
		String originNumber = request.getParameter("originNumber");
		
		String destinationCity = request.getParameter("destinationCity");
		String destinationState = request.getParameter("destinationState");
		String destinationStreet = request.getParameter("destinationStreet");
		String destinationNumber = request.getParameter("destinationNumber");
		 
		Address origin = setAddress(originCity, originState, originStreet, originNumber);
		Address destination = setAddress(destinationCity, destinationState, destinationStreet, destinationNumber);
		 
		AddressFinder service1 = new AddressFinder();
        AddressFinderSoap port1 = service1.getAddressFinderSoap12();
        
		Point pointOrigin = port1.getXY(origin, TOKEN);
		Point pointDestination = port1.getXY(destination, TOKEN);

		RouteStop originRoute = new RouteStop();
		originRoute.setDescription("Begin");
		originRoute.setPoint(pointOrigin);		 
		
		RouteStop destinationRoute = new RouteStop();
		destinationRoute.setDescription("End");
		destinationRoute.setPoint(pointDestination);
		 
		ArrayOfRouteStop list = new ArrayOfRouteStop();
		list.getRouteStop().add(originRoute);
		list.getRouteStop().add(destinationRoute);
		
	 
		RouteDetails routeDetails = new RouteDetails();
		routeDetails.setDescriptionType(0);
		routeDetails.setRouteType(1);
		routeDetails.setOptimizeRoute(true);
		 
		Vehicle vehicle = new Vehicle();
		vehicle.setTankCapacity(20);
		vehicle.setAverageConsumption(9);
		vehicle.setFuelPrice(3);
		vehicle.setAverageSpeed(60);
		vehicle.setTollFeeCat(2);
		 
		RouteOptions routeOptions = new RouteOptions();
		routeOptions.setLanguage("portugues");
		routeOptions.setRouteDetails(routeDetails);
		routeOptions.setVehicle(vehicle);
		 
		Route routeLocator = new Route();
		RouteSoap route = routeLocator.getRouteSoap12();
		RouteTotals getRouteTotalsResponse = route.getRouteTotals(list, routeOptions, TOKEN);
		 
		StringBuilder getRouteTotalsResult = new StringBuilder();
		 
		getRouteTotalsResult.append("RouteTotals - TotalDistance: ").append(getRouteTotalsResponse.getTotalDistance());
		getRouteTotalsResult.append(", TotalTime: ").append(getRouteTotalsResponse.getTotalTime());
		getRouteTotalsResult.append(", TotalFuelUsed: ").append(getRouteTotalsResponse.getTotalFuelUsed());
		getRouteTotalsResult.append(", TotalTollFeeCost: ").append(getRouteTotalsResponse.getTotaltollFeeCost());
		getRouteTotalsResult.append(", TotalFuelCost: ").append(getRouteTotalsResponse.getTotalfuelCost());
		getRouteTotalsResult.append(", TotalCost: ").append(getRouteTotalsResponse.getTotalCost());
		getRouteTotalsResult.append(", TaxiFarel1: ").append(getRouteTotalsResponse.getTaxiFare1());
		getRouteTotalsResult.append(", TaxiFarel2: ").append(getRouteTotalsResponse.getTaxiFare2());
		 
		System.out.println(getRouteTotalsResult);
		
		request.setAttribute("totalDistance", getRouteTotalsResponse.getTotalDistance());
		request.setAttribute("totalTime", getRouteTotalsResponse.getTotalTime());
		request.setAttribute("totalToll", getRouteTotalsResponse.getTotaltollFeeCost());
		request.setAttribute("totalFuel", getRouteTotalsResponse.getTotalfuelCost());

		RequestDispatcher rd = getServletContext().getRequestDispatcher("/result.jsp");
		rd.forward(request, response);
	}
	
	public Address setAddress(String city, String state, String street, String number) {
		City cityAddress = new City();
		cityAddress.setName(city);
		cityAddress.setState(state);
		 
		Address address = new Address();
		address.setStreet(street);
		address.setHouseNumber(number);
		address.setCity(cityAddress);
		
		return address;
	}
	

}
