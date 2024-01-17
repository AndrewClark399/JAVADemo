package garage;

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

	public void removeVehicle(int i) {
		vehicles.remove(i);

	}

	public void print() {
		for (Vehicle vehicle : vehicles) {
			vehicle.print();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
