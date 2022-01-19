package trycatch_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch_All {

	public static void main(String[] args) {
		// exception = 	an event that occurs during the execution of a program that,
		//				disrupts the normal flow of instructions
		Scanner scan = new Scanner(System.in);
		
		try {
		
			System.out.print("Enter a whole number to divide: ");
			int x = scan.nextInt();
		
			System.out.print("Enter a whole number to divide: ");
			int y = scan.nextInt();
	
			int z = x/y;
		
			System.out.println("ANSWER : " +z);
		}
	
		catch (ArithmeticException e) {
			System.out.println("You can't divide by 0.");
		}
	
		catch (InputMismatchException e) {
			System.out.println("Please enter a number only.");
		}
	
		catch (Exception e) {
			System.out.println("Something went wrong.");
		}
		
		finally {
			System.out.println("END.");	
			scan.close();
		}
	}

}
