package myPackage;

public class LoopDemo {

	public static void main(String[] args) {
		//For Loop
		for(int i = 2; i<10 ; i+=2) {
			System.out.println(i);
		}
		System.out.println("FOR LOOP IS FINISH");

		//While Loop
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("WHILE LOOP IS FINISH");
		
		//Do While Loop
		int j = 1;
		do{
			System.out.println(j);
			j+=2;
		}while(j<10);
		
		System.out.println("DO WHILE LOOP IS FINISH");
		
	}

}
