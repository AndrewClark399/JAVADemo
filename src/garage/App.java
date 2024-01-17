package garage;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		System.out.println("");

		Vehicle toyota = new Vehicle("Toyota", 4, "Red", "Road");

		Vehicle mountainBike = new Vehicle("Mountain Bike", 2, "Blue", "Dirt");

		Vehicle airbusA380 = new Vehicle(); // 8, "White", "Air"
		airbusA380.setDataName("Airbus A380");
		airbusA380.setNoOfWheels(8);
		airbusA380.setColour("White");
		airbusA380.setTravellingLocation("Air");

		Vehicle vauxhall = new Car("Vauxhall", 4, "Black", "Road", "4 meter squared");

		Vehicle mondeo = new Car("Mondeo", 4, "silver", "Road", "5 meter squared");

		Vehicle lexus = new Car("Lexus", 4, "Midnight Blue", "Road", "3 meter squared");

		Vehicle ktm = new Bike("KTM", 2, "Orange", "Dirt", 39);

		Vehicle devil = new Bike();// 2, "Black", "Track", 224
		devil.setDataName("Devil");
		devil.setNoOfWheels(2);
		devil.setColour("Black");
		devil.setTravellingLocation("Dirt");

		Vehicle boeing747 = new Plane("Boeing 747", 12, "White", "Air", "Madrid");

		Vehicle boeing787 = new Plane();
		boeing787.setDataName("Boeing 787");
		boeing787.setNoOfWheels(10);
		boeing787.setColour("Yellow");
		boeing787.setTravellingLocation("Air");

		Vehicle[] Built2009 = { toyota, mountainBike, airbusA380, mondeo, vauxhall, devil, ktm, boeing747, boeing787,
				lexus };

		for (Vehicle vehicle : Built2009) {
			vehicle.print();
		}

		// ArrayLists Exercise Below

		ArrayList<Vehicle> Vehicles = new ArrayList<>();
		Vehicles.add(boeing787);
		Vehicles.add(devil);
		Vehicles.add(mondeo);
		Vehicles.add(ktm);
		Vehicles.add(toyota);
		System.out.println(Vehicles);

		for (Vehicle vehicle : Vehicles) {
			vehicle.print();
		}

		Garage homeGarage = new Garage("Home Garage");
		homeGarage.addVehicle(new Plane("Boeing 737", 8, "White/Black", "Air", "London-Heathrow"));
		homeGarage.addVehicle(new Bike("Yamaha R1", 2, "Blue/Yellow", "Track", 1));
		homeGarage.addVehicle(new Vehicle("Toyota", 4, "Red", "Road"));
		homeGarage.addVehicle(new Car());
		homeGarage.removeVehicle(2);

		homeGarage.print();

//		Vehicle[] Built2009 = { toyota, mountainBike, airbusA380, mondeo, vauxhall, devil, ktm, boeing747, boeing787 };
//
//		for (Vehicle vehicle : Built2009) {
//			vehicle.print();
//		}

//		toyota.print();
//

//		mountainBike.print();
//

//		airbusA380.print();
//

//		vauxhall.print();
//

//		mondeo.print();
//

//		ktm.print();
//

//		devil.print();
//

//		boeing747.print();
//

//		boeing787.print();

	}

}
