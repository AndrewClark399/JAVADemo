package secondGarage;

import java.util.ArrayList;
import java.util.Collections;

public class App {
	public static void main(String[] args) {
		System.out.println("");

		Vehicle airbusA380 = new Plane();
		airbusA380.setDataName("Airbus A380");
		airbusA380.setNoOfWheels(8);
		airbusA380.setColour("White");
		airbusA380.setTravellingLocation("Air");
		// System.out.println(airbusA380);

		Vehicle reliant = new Car();
		reliant.setDataName("Reliant Robin");
		reliant.setNoOfWheels(3);
		reliant.setColour("Pink");
		reliant.setTravellingLocation("Road");
		// System.out.println(reliant);

		Vehicle mg = new Car();
		mg.setDataName("mg bgt");
		mg.setNoOfWheels(4);
		mg.setColour("British Racing Green");
		mg.setTravellingLocation("Road");
		// System.out.println(mg);

		Vehicle skoda = new Car();
		skoda.setDataName("skoda Octavia");
		skoda.setNoOfWheels(4);
		skoda.setColour("Brown");
		skoda.setTravellingLocation("Road");
		// System.out.println(skoda);

		Vehicle devil = new Bike();
		devil.setDataName("Devil");
		devil.setNoOfWheels(2);
		devil.setColour("Black");
		devil.setTravellingLocation("Dirt");
		// System.out.println(devil);

		Vehicle boeing787 = new Plane();
		boeing787.setDataName("Boeing 787");
		boeing787.setNoOfWheels(10);
		boeing787.setColour("Yellow");
		boeing787.setTravellingLocation("Air");
		// System.out.println(boeing787);

		ArrayList<Vehicle> Vehicles = new ArrayList<>();
		Vehicles.add(reliant);
		Vehicles.add(mg);
		Vehicles.add(boeing787);
		Vehicles.add(devil);
		Vehicles.add(skoda);
		Vehicles.add(airbusA380);

		for (Vehicle vehicle : Vehicles) {
			System.out.println(vehicle.toString());

			// This is to print out the Class type for each object.
			System.out.println("class: " + vehicle.getClass().getSimpleName());
		}

		Garage homeGarage = new Garage("Home Garage");
		// homeGarage.addVehicle(new Plane("Boeing 737", 8, "White/Black", "Air",
		// "London-Heathrow"));
		// homeGarage.addVehicle(new Bike("Yamaha R1", 2, "Blue/Yellow", "Track", 1));
		// homeGarage.addVehicle(new Car("Toyota", 4, "Red", "Road", "4 meter
		// squared"));
		// homeGarage.addVehicle(new Car());
		homeGarage.removeVehicle(new Car());

		System.out.println(homeGarage.toString());

		homeGarage.fix();

		Collections.sort(Vehicles);

		System.out.println(Vehicles.toString());

	}

}
