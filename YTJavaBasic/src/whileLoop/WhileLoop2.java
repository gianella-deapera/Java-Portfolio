package whileLoop;

import java.util.Scanner;

public class WhileLoop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = "";
		
		while(name.isEmpty()) {
			System.out.print("Enter Name: ");
			name = scan.nextLine();
		}
		System.out.println("Hello, welcome " + name);

	}

}
