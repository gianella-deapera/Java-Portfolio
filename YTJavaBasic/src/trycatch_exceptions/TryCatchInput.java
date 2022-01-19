package trycatch_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");

		try {
			int n = scan.nextInt();
			System.out.println(n);
	
			//mas maganda kung specific un exception
		} catch (InputMismatchException e) {
			System.out.println("Sorry, not a number.");
		
		}finally {
			System.out.println("THE END.");
			scan.close();
		}//this closes the input
		
	}

}
