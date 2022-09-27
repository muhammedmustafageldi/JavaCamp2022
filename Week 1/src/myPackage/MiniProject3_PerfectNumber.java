package myPackage;

public class MiniProject3_PerfectNumber {

	public static void main(String[] args) {
		
		int number = 28;
		int bolenToplami = 0;
		
		
		for(int i = 1; i<number ; i++) {
			if(number %i == 0) {
				bolenToplami += i;
			}
		}
		
		if(bolenToplami == number) {
			System.out.println("Sayı Mükemmeldir");
		}else {
			System.out.println("Sayı Mükemmel Değildir!!!");
		}
		
	}

}
