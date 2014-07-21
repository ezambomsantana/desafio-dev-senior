package br.com.santana.route;

import java.util.ArrayList;
import java.util.List;

import br.com.maplink2.webservices.Address;
import br.com.maplink2.webservices.AddressFinder;
import br.com.maplink2.webservices.AddressFinderSoap;
import br.com.maplink2.webservices.Point;

public class AddressService {
	
	public List<Point> getPoints(List<Address> addresses) {
		AddressFinder service1 = new AddressFinder();
        AddressFinderSoap port1 = service1.getAddressFinderSoap12();
        
        List<Point> points = new ArrayList<Point>();
        
        for (int i = 0; i < addresses.size(); i++) {
        	
        	Address a = addresses.get(i);
        	
        	Point point = port1.getXY(a, RouteComponent.TOKEN);
        	points.add(point);
				
        }
        
        return points;
	}

}
