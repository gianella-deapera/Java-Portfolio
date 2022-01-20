package act_objCreation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = scan.nextLine();
		
		System.out.print("Lane Number: ");
		int lane = scan.nextInt();
		
		System.out.print("Batch: ");
		char batch = scan.next().charAt(0);
		scan.nextLine();
		
		System.out.print("Difficulty: ");
		String difficulty = scan.nextLine();
		
		Race act = new Race (name,lane,batch,difficulty);
		

	}

}
