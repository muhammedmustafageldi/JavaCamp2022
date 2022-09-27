package myPackage;

public class SwitchDemo {

	public static void main(String[] args) {
		
		char grade = 'Z';
		
		switch (grade) {
		
		case 'A': 
			System.out.println("Great : Successed");
			break;
		case 'B': 
			System.out.println("Very Good : Successed");
			break;
		case 'C': 
			System.out.println("Good : Successed");		
			break;
		case 'D': 
			System.out.println("Not Bad : Successed");		
			break;
		case 'F': 
			System.out.println("Unfortunately : Unsuccessful");		
			break;
		
		default : 
			System.out.println("Invalid Input!");
	}
	}
}
