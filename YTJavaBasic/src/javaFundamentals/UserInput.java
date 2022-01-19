package javaFundamentals;
import java.util.Scanner;
//scanner is for input

public class UserInput {

	public static void main(String[] args) {
		
		int x;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		x = scan.nextInt();
		
		//nextLine is for string only
		//nextInt,nextBoolean,nextFloat and so on
		
		System.out.print("I know you're number " +x);

	}

}
