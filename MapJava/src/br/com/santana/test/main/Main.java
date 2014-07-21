package br.com.santana.test.main;

import java.util.ArrayList;
import java.util.List;

import br.com.santana.model.PointAddress;
import br.com.santana.model.RouteData;
import br.com.santana.model.RouteTypeEnum;
import br.com.santana.route.RouteComponent;

public class Main {

	public static void main(String[] args) {
		
		PointAddress address = new PointAddress();
		address.setStreet("Avenida Paulista");
		address.setNumber("1000");
		address.setState("SP");
		address.setCity("São Paulo");
		 
		PointAddress address2 = new PointAddress();
		address2.setStreet("Rua Floriano Peixoto");
		address2.setNumber("1000");
		address2.setState("SP");
		address2.setCity("Lins");
		
		List<PointAddress> points = new ArrayList<PointAddress>();
		points.add(address);
		points.add(address2);
		
		RouteComponent component = new RouteComponent();
		RouteData data = component.route(points, RouteTypeEnum.DEFAULT);
		
		System.out.println(data.getTotalCost());
		System.out.println(data.getTotalDistance());
		System.out.println(data.getTotalFuel());
		System.out.println(data.getTotalTime());
	}

}
