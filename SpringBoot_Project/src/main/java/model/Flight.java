package model;

import java.util.List;

// spring will instantiate the object of flight and route and store it insdie the routes.

public class Flight {
	private int flightNumber;
	private String flightName;
	private String sourceLocation;
	private String destLocation;
	private List<Route> routes;
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestLocation() {
		return destLocation;
	}
	public void setDestLocation(String destLocation) {
		this.destLocation = destLocation;
	}
	public List<Route> getRoutes() {
		return routes;
	}
	public void setRoutes(List<Route> routes) {
		this.routes = routes;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", sourceLocation="
				+ sourceLocation + ", destLocation=" + destLocation + "]";
	}
	
	
}
