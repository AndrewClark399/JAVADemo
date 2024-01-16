package garage;

public class Plane extends Vehicle {
	private String homeAirport;

	public Plane() {

	}

	public Plane(int noOfWheels, String colour, String travellingLocation, String homeAirport) {
		setNoOfWheels(noOfWheels);
		setColour(colour);
		setTravellingLocation(travellingLocation);
		setHomeAirport(homeAirport);
	}

	public String getHomeAirport() {
		return homeAirport;
	}

	public void setHomeAirport(String homeAirport) {
		this.homeAirport = homeAirport;
	}

	public void PlanePrint() {
		System.out.println("Home Airport: " + homeAirport);
	}
}
