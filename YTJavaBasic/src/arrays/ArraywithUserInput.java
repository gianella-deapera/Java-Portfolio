package arrays;
import java.util.Scanner;
public class ArraywithUserInput {

	public static void main(String[] args) {
		
		//THIS IS W/O VALUE ARRAY
		
		Scanner scan = new Scanner(System.in);
		
		String staffnames [] =  new String [15];
		int gradenumber [] = new int [10];
		
		System.out.print("Enter Name: ");
		staffnames[0] = scan.nextLine();
		
		System.out.print("Enter Number: ");
		gradenumber[0] = scan.nextInt();
		
		System.out.print("The name is " +staffnames[0] + " and the number is " +gradenumber[0]);
	}

}
