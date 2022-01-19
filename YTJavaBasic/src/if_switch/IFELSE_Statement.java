package if_switch;
import java.util.Scanner;

public class IFELSE_Statement {

	public static void main(String[] args) {

		//THIS IS WITH USER INPUT
		//or float pass = 3.0;
		float grade;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter grade: ");
		grade = scan.nextFloat();
		
		// if (grade > pass);
		if (grade > 3.0) {
		System.out.print("You Failed.");
		
		}else {
			System.out.print("You Passed.");
		
		}

	}

}
