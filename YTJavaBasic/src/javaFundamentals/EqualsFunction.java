package javaFundamentals;
import java.util.Scanner;
public class EqualsFunction {

	public static void main(String[] args) {
		
		//this is comparing string or letters

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Greetings: ");
		String greet = scan.nextLine();
		
				//.equalsIgnoreCase to avoid case sensitivity
		
		if (greet.equals("Hello")) {
		System.out.print("Hi!");
			
		}
		else System.out.println("NOT VALID");
	
	}
		
	}