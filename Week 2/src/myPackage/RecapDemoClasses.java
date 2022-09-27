package myPackage;

public class RecapDemoClasses {

	public static void main(String[] args) {

		CalculatorClass calculator = new CalculatorClass();

		int sumResult = calculator.sum(3, 5);
		System.out.println("Sum Result: "+sumResult);

		int minusResult = calculator.minus(15, 8);
		System.out.println("Minus Result: "+minusResult);

		int multiplyResult = calculator.multiply(7, 8);
		System.out.println("Multiply Result: "+multiplyResult);

		int divideResult = calculator.divide(30, 10);
		System.out.println("Divide Result: "+divideResult);

	}

}
