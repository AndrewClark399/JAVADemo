package people;

public class App {

	public static void main(String[] args) {

		PeopleCharacteristics ac = new PeopleCharacteristics();
		ac.setName("Andrew");
		ac.setAge(30);
		ac.setCity("Hull");
		ac.setCountry("United Kingdom");

		PeopleCharacteristics pp = new PeopleCharacteristics();
		pp.setName("Peter");
		pp.setAge(24);
		pp.setCity("New York");
		pp.setCountry("United States");

		PeopleCharacteristics[] people = { ac, pp };

		// for each cat of cats
		for (PeopleCharacteristics person : people) {
			person.print();
			person.getAge();
		}
		ac.setAge(ac.getAge() + 1);
		ac.print();
		pp.print();
		ac.setAge(ac.getAge() + 1);
		ac.print();
		pp.print();
	}

}
