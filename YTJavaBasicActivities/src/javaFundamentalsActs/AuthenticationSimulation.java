package javaFundamentalsActs;
import java.util.Scanner;
public class AuthenticationSimulation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String names[] = {"Chorong", "Bomi", "Eunji", "Naeun", "Namjoo", "Hayoung"};
		System.out.print("Username : ");
		String name = scan.nextLine();
		
		String passwords [] = {"rong91", "bom93","pup93", "nang94", "joo95", "maknae96"};
		System.out.print("Password : ");
		String pass = scan.nextLine();
		
		boolean isExist = false;
		
		for(int i = 0; i<names.length; i++) {

			if (name.equals(names[i]) && pass.equals(passwords[i])) {
				isExist = true;
			break;
	
	}
		}
	
		if (isExist) System.out.println("Welcome, User " + name + "!");
		else System.out.println("SORRY, ACCOUNT NOT FOUND.");
	}
	
}
	