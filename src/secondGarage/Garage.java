package secondGarage;

import java.util.ArrayList;

public class Garage {

	private String name;
	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public Garage(String name) {
		super();
		setName(name);
	}

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);

	}

	public void removeVehicleById(int id) {
		for (Vehicle vehicle : vehicles) {

			if (id == vehicle.getId()) {
				vehicles.remove(vehicle);
				return;
			}
		}

	}

	@Override
	public String toString()

	{
		return name;
	}

//	public void print() {
//		for (Vehicle vehicle : vehicles) {
//			vehicle.print();
//		}
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fix() {
		int sum = 0;
		for (Vehicle vehicle : vehicles) {

			// prints each vehicle value for calcBill
			// System.out.println(vehicle.calcBill());

			sum += vehicle.calcBill();
		}
		System.out.println("Total cost: £" + sum);
	}

}
