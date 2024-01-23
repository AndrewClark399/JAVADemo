package library;

public class Person {

	private static int count;

	private final int id;
	private String name;
	private int age;
	private String address;
	private String tel;

	public Person() {
		super();
		this.id = ++count;
	}

	public Person(String name, int age, String address, String tel) {
		super();
		this.id = ++count;
		setName(name);
		setAge(age);
		setAddress(address);
		setTel(tel);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Id:" + getId() + ", Name: " + name + ", Age: " + age + ", Address: " + address + ", Tel: " + tel;
	}

}
