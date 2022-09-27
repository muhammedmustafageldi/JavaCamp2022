package myPackage;

public class MethodOverloading {

	public static void main(String[] args) {
		int result = sum(5, 7);
		System.out.println("Result of first method: " + result);

		int result2 = sum(4, 7, 9);
		System.out.println("Result of second method: " + result2);
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static int sum(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

}
