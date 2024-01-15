package people;

public class App {

	public static void main(String[] args) {

		PeopleCharacteristics ac = new PeopleCharacteristics();
		ac.name = "Andrew";
		ac.age = 30;
		ac.city = "Hull";
		ac.country = "United Kingdom";

		PeopleCharacteristics pp = new PeopleCharacteristics();
		pp.name = "Peter";
		pp.age = 24;
		pp.city = "New York";
		pp.country = "United States";

		ac.print();
		pp.print();
	}

}
