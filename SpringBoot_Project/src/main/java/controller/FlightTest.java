package controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Flight;
import model.Route;

public class FlightTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("FirstApp.xml");
	Flight flight =(Flight) context.getBean("flightObj1");
	System.out.println(flight.getFlightNumber()+" "+flight.getFlightName()+" "+flight.getDestLocation()
							+" "+flight.getSourceLocation());
	
	List<Route> list = flight.getRoutes();
	for(Route r: list) {
		System.out.println(r.getRouteId()+" "+r.getRouteName());
	}
	}

}
