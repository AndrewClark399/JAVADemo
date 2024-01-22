package secondGarage;

import java.util.Objects;

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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(homeAirport);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Plane other = (Plane) obj;
		return Objects.equals(homeAirport, other.homeAirport);
	}

	@Override
	public String toString() {
		return "Id: " + getId() + ", Name: " + getDataName() + ", No. of Wheels: " + getNoOfWheels() + ", Colour: "
				+ getColour() + ", Travelling Location: " + getTravellingLocation() + ", Home Airport: " + homeAirport
				+ ", Bill Total: £" + calcBill();
	}

	// using the abstract method from vehicle
	@Override
	public int calcBill() {
		return (getNoOfWheels() * 110);
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Home Airport: " + homeAirport);
//	}
}
