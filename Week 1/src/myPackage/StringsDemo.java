package myPackage;
import java.util.Iterator;

public class StringsDemo {

	public static void main(String[] args) {
		String message = "The weather is very nice today.";
		System.out.println(message);
		
		System.out.println("Char count: "+message.length());
		System.out.println("Fifth index: "+message.charAt(5));
		System.out.println(message.concat(" Hey"));
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
	
		char[] myChars = new char[11]; 
		message.getChars(0, 11, myChars , 0);
		System.out.println(myChars);
		System.out.println(myChars.length);
		System.out.println(message.indexOf("we"));
		System.out.println(message.lastIndexOf("e"));
		
		System.out.println(message.replace(" ", "-"));
		System.out.println(message.substring(0,7));
		
		for (String word : message.split(" ")) {
			System.out.println(word);
		}
		
		System.out.println(message.toLowerCase());
		System.out.println(message.toUpperCase());
		System.out.println(message.trim());
	}

}
