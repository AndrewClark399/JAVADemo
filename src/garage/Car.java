package garage;

public class Car extends Vehicle {

	private String bootCapacity;

	public Car() {
		super();
	}

	public Car(String dataName, int noOfWheels, String colour, String travellingLocation, String bootCapacity) {
		super(dataName, noOfWheels, colour, travellingLocation);
		setBootCapacity(bootCapacity);
	}

	public String getBootCapacity() {
		return bootCapacity;
	}

	public void setBootCapacity(String bootCapacity) {
		this.bootCapacity = bootCapacity;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("Boot Capacity: " + bootCapacity);
	}
}
