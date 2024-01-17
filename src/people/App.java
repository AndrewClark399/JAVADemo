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

		PeopleCharacteristics ss = new PeopleCharacteristics("Sam", 42, "Portsmouth", "United Kingdom");

		PeopleCharacteristics sp = new PeopleCharacteristics("Sarah", 51);

		PeopleCharacteristics[] people = { ac, pp, ss, sp };

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
		ss.print();
		sp.print();
	}

}
