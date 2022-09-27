package myPackage;
import java.util.ArrayList;

public class RecapDemo2 {

	public static void main(String[] args) {
		double[] myList = {3.2,1.7,7.3};
		double total = 0;
		double max = myList[0];
	
		
		for(double i : myList) {
			if(max<i) {
				max = i;
			}
			total += i;
			System.out.println(i);
		}
		
		System.out.println("Total : "+total);
		System.out.println("Max number: "+max);
		
		//MY OWN PRATIC -------------->>>>>>>>>>>>>>
		int number1 = 35;
		int number2 = 20;
		int number3 = 23;
		
		ArrayList<Integer> myList2 = new ArrayList<>();
		myList2.add(number1);
		myList2.add(number2);
		myList2.add(number3);
		
		int maxInt = myList2.get(0);

		for(int number : myList2) {
			if(maxInt < number) {
				maxInt = number;
			}
		}
		
		System.out.println(maxInt);
	
	}

}
