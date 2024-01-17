package garage;

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
	public void print() {
		super.print();
		System.out.println("Racing Number: " + racingNumber);
	}
}
