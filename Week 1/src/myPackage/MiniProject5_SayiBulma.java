package myPackage;

public class MiniProject5_SayiBulma {

	public static void main(String[] args) {
		
		int[] numbers = new int[] {1,2,5,7,9,0};
		final int aranacak = 0;
		boolean varmi = false;
		
		for(int number : numbers) {
			if(number == aranacak){
				varmi = true;
				break;
			}
		}
		
		if(varmi) {
			System.out.println("Sayı bulundu.");
		}else {
			System.out.println("Sayı mevcut değil.");
		}
		
		
		
		
		
	}
}
