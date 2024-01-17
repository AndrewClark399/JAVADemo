package garage;

public class Bike extends Vehicle {
	private int racingNumber;

	public Bike() {
		super();
	}

	public Bike(int noOfWheels, String colour, String travellingLocation, int racingNumber) {
		super(noOfWheels, colour, travellingLocation);
		setRacingNumber(racingNumber);
	}

	public int getRacingNumber() {
		return racingNumber;
	}

	public void setRacingNumber(int racingNumber) {
		this.racingNumber = racingNumber;
	}

	public void BikePrint() {
		System.out.println("Racing Number: " + racingNumber);
	}
}
