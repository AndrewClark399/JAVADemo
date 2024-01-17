package garage;

public class Vehicle {

	private String dataName;
	private int noOfWheels;
	private String colour;
	private String travellingLocation;

	public Vehicle() {
		super();
	}

	public Vehicle(String dataName, int noOfWheels, String colour, String travellingLocation) {
		super();
		setDataName(dataName);
		setNoOfWheels(noOfWheels);
		setColour(colour);
		setTravellingLocation(travellingLocation);

	}

	public String getDataName() {
		return dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
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

		System.out.println("Name: " + dataName);
		System.out.println("No. Of Wheels: " + noOfWheels);
		System.out.println("Colour: " + colour);
		System.out.println("Travelling Location: " + travellingLocation);
	}
}
