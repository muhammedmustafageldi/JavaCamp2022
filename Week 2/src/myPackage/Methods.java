package myPackage;

public class Methods {

	private static boolean varmi;

	public static void main(String[] args) {

		findNumber();

	}

	private static void findNumber() {

		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		final int aranacak = 0;
		varmi = false;

		for (int number : numbers) {
			if (number == aranacak) {
				varmi = true;
				break;
			}
		}

		printMessage(aranacak);

	}

	private static void printMessage(int aranacak) {
		if (varmi) {
			System.out.println("Sayı bulundu: " + aranacak);
		} else {
			System.out.println("Sayı mevcut değil: " + aranacak);
		}
	}

}
