package arith_logic_op;
import java.util.Scanner;
public class LogicalOperators {

	public static void main(String[] args) {
		// AND (&&) both is satisfied
		// OR  (||) any of the 2 is satisfied
		// NOT (!) inverts the current statement and only one statement for this
		
		Scanner scan = new Scanner(System.in);
		
		boolean hasPencil = false;
		boolean hasBallpen = true;
		
		//!hasPencil
		if (hasPencil && hasBallpen) System.out.print("Very good you have the items.");
		else System.out.print("Its okay, don't worry.");
	}

}
