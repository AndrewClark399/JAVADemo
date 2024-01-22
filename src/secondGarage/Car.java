package secondGarage;

import java.util.Objects;

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

	// auto generated from source takes count of super from vehicle
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bootCapacity);
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
		Car other = (Car) obj;
		return Objects.equals(bootCapacity, other.bootCapacity);
	}

	@Override
	public String toString() {
		return "Id: " + getId() + ", Name: " + getDataName() + ", No. of Wheels: " + getNoOfWheels() + ", Colour: "
				+ getColour() + ", Travelling Location: " + getTravellingLocation() + ", Boot Capacity: " + bootCapacity
				+ ", Bill Total: £" + calcBill();
	}

	// using the abstract method from vehicle
	@Override
	public int calcBill() {
		return (getNoOfWheels() * 100);
	}

	// uses print method from vehicle but adds specific car variable
//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Boot Capacity: " + bootCapacity);
//	}
}
