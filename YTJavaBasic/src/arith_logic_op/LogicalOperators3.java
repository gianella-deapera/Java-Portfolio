package arith_logic_op;

import java.util.Scanner;

public class LogicalOperators3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("You're playing a game. Press q/Q to quit.");
		System.out.print("Response : ");
		String response = scan.nextLine();
		
		//if (!response.equals("q") && !response.equals("Q"))
		if (response.equals("q") || response.equals("Q"))
			System.out.println("You quit the game.");
		
		else System.out.println("You continue the game.");
		
	}

}
