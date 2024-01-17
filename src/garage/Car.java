package garage;

public class Car extends Vehicle {

	private String bootCapacity;

	public Car() {
		super();
	}

	public Car(int noOfWheels, String colour, String travellingLocation, String bootCapacity) {
		super(noOfWheels, colour, travellingLocation);
		setBootCapacity(bootCapacity);
	}

	public String getBootCapacity() {
		return bootCapacity;
	}

	public void setBootCapacity(String bootCapacity) {
		this.bootCapacity = bootCapacity;
	}

	public void CarPrint() {
		System.out.println("Boot Capacity: " + bootCapacity);
	}
}
