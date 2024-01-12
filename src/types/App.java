package types;

public class App {

	
	public static void main(String[] args) {
		byte byt = 30;
		short shot = 320;
		int i = 3061234;
		long lg = 12345678911L;
		char initial = 'I';
		String name = "Andrew";
		float fl = 23.11F;
		double db = 23.12;
		System.out.println(byt);
		System.out.println(shot);
		System.out.println(i);
		System.out.println(lg);
		System.out.println(initial);
		System.out.println(name);
		System.out.println(fl);
		System.out.println(db);
		
		String firstName = "Andrew";
		String surName = "Clark";
		System.out.println(firstName);
		System.out.println(surName);
		char space = ' ';
		String space2 = " ";
		System.out.println(firstName.concat(space2).concat(surName));

		String fullName = firstName+space+surName;
		System.out.println(fullName);
		
		byte byt2 = 0;
		short shot2 = 0;
		int i2 = 5;
		long lg2 = 0;
		char initial2 = 'q';
		String name2 = "null";
		float fl2 = 0;
		double db2 = 0;
		System.out.println(byt2);
		System.out.println(shot2);
		System.out.println(i2);
		System.out.println(lg2);
		System.out.println(initial2);
		System.out.println(name2);
		System.out.println(fl2);
		System.out.println(db2);
	}
}
