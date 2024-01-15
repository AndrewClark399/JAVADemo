package operators;

public class App {
	public static void main(String[] args) {
		System.out.println(add (4,4));
		System.out.println(subtract(4,4));
		System.out.println(multiply(4,4));
		System.out.println(divide(4,4));
		System.out.println(divide(4,4)+(multiply(4,4)));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static double divide(double a, double b) {
		return a / b;
	}

}
