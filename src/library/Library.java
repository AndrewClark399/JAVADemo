package library;

import java.util.ArrayList;

public class Library {

	private String name;
	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();

	public Library(String name) {
		super();
		setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name:" + name + "\n" + "Inventory: " + items + "\n" + "Customers: " + customers;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);

	}

	public boolean removeItem(int id) {
		for (Item i : this.items) {
			if (id == i.getId()) {

				return this.items.remove(i);
			}
		}
		return false;
	}

	public void checkInItem(Item item) {
		item.setAvailable(true);
	}

	public void checkOutItem(Item item) {
		item.setAvailable(false);

	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void removeCustomer(Customer customer) {
		customers.remove(customer);

	}

	public Customer update(int id, String name) {
		for (Customer customer : customers) {
			if (id == customer.getId()) {
				this.setName(name);
				return;
			}
		}

	}

}
