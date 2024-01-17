package garage;

public class Plane extends Vehicle {
	private String homeAirport;

	public Plane() {
		super();
	}

	public Plane(String dataName, int noOfWheels, String colour, String travellingLocation, String homeAirport) {
		super(dataName, noOfWheels, colour, travellingLocation);
		setHomeAirport(homeAirport);
	}

	public String getHomeAirport() {
		return homeAirport;
	}

	public void setHomeAirport(String homeAirport) {
		this.homeAirport = homeAirport;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Home Airport: " + homeAirport);
	}
}
