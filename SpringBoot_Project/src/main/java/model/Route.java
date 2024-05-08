package model;

public class Route {
	private int routeId;
	private String routeName;
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeName=" + routeName + "]";
	}
	
	

}
