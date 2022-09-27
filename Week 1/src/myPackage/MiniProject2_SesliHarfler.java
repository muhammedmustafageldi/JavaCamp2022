package myPackage;

public class MiniProject2_SesliHarfler {

	public static void main(String[] args) {

		char harf = 'N';
		
		switch(harf) {
		
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli bir harf.");
			break;
	
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("İnce sesli bir harf.");
			break;
			
			default:
				System.out.println("Lütfen sesli bir harf giriniz.");
				break;
		}
	
	}

}
