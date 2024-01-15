package arrays;

public class App {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 34;
		numbers[1] = 331;
		numbers[2] = 239;
		numbers[3] = 190;
		numbers[4] = 262;
		numbers[5] = 8;
		numbers[6] = 998;
		numbers[7] = 7013;
		numbers[8] = 3;
		numbers[9] = 3;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		System.out.println(numbers[5]);
		System.out.println(numbers[6]);
		System.out.println(numbers[7]);
		System.out.println(numbers[8]);
		System.out.println(numbers[9]);

		int[] secondary = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			secondary[i] = i * 10;
		}
		System.out.println(secondary[0]);
		System.out.println(secondary[1]);
		System.out.println(secondary[2]);
		System.out.println(secondary[3]);
		System.out.println(secondary[4]);
		System.out.println(secondary[5]);
		System.out.println(secondary[6]);
		System.out.println(secondary[7]);
		System.out.println(secondary[8]);
		System.out.println(secondary[9]);
		for (int q = 0; q < secondary.length; q++) {
			System.out.println(secondary[q]);
		}

		System.out.println(sumNums(39));

	}

	public static int sumNums(int a) {

		int tens = a / 10;
		int units = a % 10;

		return tens + units;

	}

}
