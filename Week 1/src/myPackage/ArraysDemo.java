package myPackage;

public class ArraysDemo {

	public static void main(String[] args) {
		String student1 = "Mustafa";
		String student2 = "Engin";
		String student3 = "Altan";
		
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		
		String[] students = new String[3];
		students[0] = student1;
		students[1] = student2;
		students[2] = student3;
		
		System.out.println("***For Loop***");
		for(String s : students) {
			System.out.println(s);
		}
		
		
	}

}
