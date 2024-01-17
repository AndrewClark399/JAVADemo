package garage;

public class App {
	public static void main(String[] args) {
		System.out.println("");

		Vehicle toyota = new Vehicle(4, "Red", "Road");

		Vehicle mountainBike = new Vehicle(2, "Blue", "Dirt");

		Vehicle airbusA380 = new Vehicle(); // 8, "White", "Air"
		airbusA380.setNoOfWheels(8);
		airbusA380.setColour("White");
		airbusA380.setTravellingLocation("Air");

		Car vauxhall = new Car(4, "Black", "Road", "4 meter squared");

		Car mondeo = new Car(4, "silver", "Road", "5 meter squared");

		Bike ktm = new Bike(2, "Orange", "Dirt", 39);

		Bike devil = new Bike();// 2, "Black", "Track", 224
		devil.setNoOfWheels(2);
		devil.setColour("Black");
		devil.setTravellingLocation("Dirt");

		Plane boeing747 = new Plane(12, "White", "Air", "Madrid");

		Plane boeing787 = new Plane();
		boeing787.setNoOfWheels(10);
		boeing787.setColour("Yellow");
		boeing787.setTravellingLocation("Air");

		System.out.println("Toyota:");
		toyota.print();

		System.out.println("Mountain Bike:");
		mountainBike.print();

		System.out.println("Airbus A380:");
		airbusA380.print();

		System.out.println("Vauxhall:");
		vauxhall.print();
		vauxhall.CarPrint();

		System.out.println("Mondeo:");
		mondeo.print();
		mondeo.CarPrint();

		System.out.println("KTM:");
		ktm.print();
		ktm.BikePrint();

		System.out.println("Devil:");
		devil.print();
		devil.BikePrint();

		System.out.println("Boeing 747:");
		boeing747.print();
		boeing747.PlanePrint();

		System.out.println("Boeing 787:");
		boeing787.print();
		boeing787.PlanePrint();

	}

}
