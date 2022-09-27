package myPackage;


public class MiniProject1_AsalSayi {

	public static void main(String[] args) {
		
		//KENDİ ALGORİTMAM
		//Asal sayıların bölen adedi 2'dir. Bundan yola çıkarak algoritmamı kurdum.
		
		int sayi = 2;
		int bolunmeSayisi = 0;
		
		for(int i = 1 ; i<=sayi ; i++) {
			if(sayi%i == 0) {
				bolunmeSayisi++;
			}
		}
		
		if(bolunmeSayisi == 2) {
			System.out.println("Sayı ASAL.");
		}else {
			System.out.println("Sayı ASAL DEĞİL!");
		}

	}

}
