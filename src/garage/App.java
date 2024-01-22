package garage;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		System.out.println("");

		// Vehicle toyota = new Car("Toyota", 4, "Red", "Road", "4 meter squared");

		// Vehicle mountainBike = new Car("Mountain Bike", 2, "Blue", "Dirt", "4 meter
		// squared");

		Vehicle airbusA380 = new Plane(); // 8, "White", "Air"
		airbusA380.setDataName("Airbus A380");
		airbusA380.setNoOfWheels(8);
		airbusA380.setColour("White");
		airbusA380.setTravellingLocation("Air");

		// Vehicle vauxhall = new Car("Vauxhall", 4, "Black", "Road", "4 meter
		// squared");

		// Vehicle mondeo = new Car("Mondeo", 4, "silver", "Road", "5 meter squared");

		// Vehicle lexus = new Car("Lexus", 4, "Midnight Blue", "Road", "3 meter
		// squared");

		// Vehicle ktm = new Bike("KTM", 2, "Orange", "Dirt", 39);

		Vehicle devil = new Bike();// 2, "Black", "Track", 224
		devil.setDataName("Devil");
		devil.setNoOfWheels(2);
		devil.setColour("Black");
		devil.setTravellingLocation("Dirt");

		// Vehicle boeing747 = new Plane("Boeing 747", 12, "White", "Air", "Madrid");

		Vehicle boeing787 = new Plane();
		boeing787.setDataName("Boeing 787");
		boeing787.setNoOfWheels(10);
		boeing787.setColour("Yellow");
		boeing787.setTravellingLocation("Air");

		// Vehicle[] Built2009 = { toyota, mountainBike, airbusA380, mondeo, vauxhall,
		// devil, ktm, boeing747, boeing787,
		// lexus };

		// for (Vehicle vehicle : Built2009) {
		// System.out.println(vehicle.toString());
		// }

		// ArrayLists Exercise Below

		ArrayList<Vehicle> Vehicles = new ArrayList<>();
		Vehicles.add(boeing787);
		Vehicles.add(devil);
		// Vehicles.add(mondeo);
		// Vehicles.add(ktm);
		// Vehicles.add(toyota);
		System.out.println(Vehicles);

		for (Vehicle vehicle : Vehicles) {
			System.out.println(vehicle.toString());

			// This is to print out the Class type for each object.
			System.out.println("class: " + vehicle.getClass().getSimpleName());
		}

		// Garage homeGarage = new Garage("Home Garage");
		// homeGarage.addVehicle(new Plane("Boeing 737", 8, "White/Black", "Air",
		// "London-Heathrow"));
		// homeGarage.addVehicle(new Bike("Yamaha R1", 2, "Blue/Yellow", "Track", 1));
		// homeGarage.addVehicle(new Car("Toyota", 4, "Red", "Road", "4 meter
		// squared"));
		// homeGarage.addVehicle(new Car());
		// homeGarage.removeVehicle(new Car());

		// System.out.println(homeGarage.toString());

// using .equals to compare objects - prints as a boolean response
		// Car Vectra = new Car("Vauxhall", 4, "Black", "Road", "4 meter squared");
		// Car Astra = new Car("Vauxhall", 4, "Black", "Road", "4 meter squared");

		// System.out.println(Vectra.toString());
		// System.out.println(Astra.toString());
		// System.out.println(Vectra.equals(Astra));

		// homeGarage.fix();

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
