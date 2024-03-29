package people;

public class PeopleCharacteristics {

	private String name;
	private int age;
	private String city;
	private String country;

	public PeopleCharacteristics(String name, int age, String city, String country) {
		setName(name);
		setAge(age);
		setCity(city);
		setCountry(country);
	}

	public PeopleCharacteristics(String name, int age) {
		setName(name);
		setAge(age);

	}

	public PeopleCharacteristics() {
	}

	public void print() {
		System.out.println(
				"Hello, my name is " + name + "," + "I am " + age + "," + "from " + city + "," + "in " + country);

	}

	public void setAge(int age) {
		if (age >= 0 && age < 120) {
			this.age = age;
		} else {
			System.out.println("Please provide an age between 0 and 120");
		}
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {

		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		if (country == "United Kingdom") {
			this.country = ("The " + country);
		} else {
			country = country;
		}
		this.country = country;
	}

}
