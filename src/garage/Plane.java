package garage;

public class Plane extends Vehicle {
	private String homeAirport;

	public Plane() {
		super();
	}

	public Plane(int noOfWheels, String colour, String travellingLocation, String homeAirport) {
		super(noOfWheels, colour, travellingLocation);
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
