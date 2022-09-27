package myPackage;

public class Methods2 {

	public static void main(String[] args) {
		String message = "The weather is very nice today.";
		String newMessage = message.substring(0,message.length());
		System.out.println(newMessage);
		
		int result = sum(4, 8);
		System.out.println("The result of the first method: "+result);
		
		int result2 = sum(1,2,3,4,6,7,9,4);
		System.out.println("The result of the second method: "+result2);
	}

	public static void add() {
		System.out.println("Added.");
	}

	public static void delete() {
		System.out.println("Deleted.");
	}

	public static void update() {
		System.out.println("Updated.");
	}
	
	//parameterized and return int method
	public static int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	//Overloading method and Veriable arguments.
	public static int sum(int... numbers) {
		int result = 0;
		for(int number : numbers) {
			result += number;
		}
		return result;
	}
	

}
