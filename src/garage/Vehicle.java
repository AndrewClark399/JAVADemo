package garage;

public class Vehicle {

	private int noOfWheels;
	private String colour;
	private String travellingLocation;

	public Vehicle() {
		super();
	}

	public Vehicle(int noOfWheels, String colour, String travellingLocation) {
		super();
		setNoOfWheels(noOfWheels);
		setColour(colour);
		setTravellingLocation(travellingLocation);

	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getTravellingLocation() {
		return travellingLocation;
	}

	public void setTravellingLocation(String travellingLocation) {
		this.travellingLocation = travellingLocation;
	}

	public void print() {

		System.out.println("No. Of Wheels: " + noOfWheels);
		System.out.println("Colour: " + colour);
		System.out.println("Travelling Location: " + travellingLocation);
	}
}
