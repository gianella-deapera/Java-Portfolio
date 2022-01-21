package customExceptions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//exceptions  =  an event, after execution that disrupts the normal flow of the program
		//Custom Exceptions = user defined exceptions
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = scan.nextInt();
		
		try {
			checkAge(age);
		} catch (Exception e) {
			System.out.println("A problem occurred: " + e);
		}

	}

	static void checkAge(int age) throws AgeException{
		if (age < 18) {
			throw new AgeException("\n" + "You must be 18+ to sign up.");
		}else {
			System.out.println("You successfully signed up!");
		}
	}
}
