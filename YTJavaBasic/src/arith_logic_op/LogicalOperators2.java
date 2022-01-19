package arith_logic_op;

public class LogicalOperators2 {

	public static void main(String[] args) {
		// Another example
		
		int age = 90;
		boolean isVerified = false;
		
		if (age >= 18 || isVerified) 
			System.out.print("You passed and is qualified.");
		
		else if (age >= 18 && !isVerified) 
			System.out.print("You passed but not qualified.");
		
		else System.out.print("You failed.");
		
	}

}
