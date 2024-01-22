package secondGarage;

import java.util.Objects;

public class Bike extends Vehicle {
	private int racingNumber;

	public Bike() {
		super();
	}

	public Bike(String dataName, int noOfWheels, String colour, String travellingLocation, int racingNumber) {
		super(dataName, noOfWheels, colour, travellingLocation);
		setRacingNumber(racingNumber);
	}

	public int getRacingNumber() {
		return racingNumber;
	}

	public void setRacingNumber(int racingNumber) {
		this.racingNumber = racingNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(racingNumber);
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
		Bike other = (Bike) obj;
		return racingNumber == other.racingNumber;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + ", Name: " + getDataName() + ", No. of Wheels: " + getNoOfWheels() + ", Colour: "
				+ getColour() + ", Travelling Location: " + getTravellingLocation() + ", Racing Number: " + racingNumber
				+ ", Bill Total: £" + calcBill();
	}

	// using the abstract method from vehicle
	@Override
	public int calcBill() {
		return (getNoOfWheels() * 50);
	}

//	@Override
//	public void print() {
//		super.print();
//		System.out.println("Racing Number: " + racingNumber);
//	}
}
