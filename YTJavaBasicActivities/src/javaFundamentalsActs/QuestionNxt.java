package javaFundamentalsActs;
import java.util.Scanner;
public class QuestionNxt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int lives = 3;
		String answer1;
		String answer2;
		int answer3;
		String answer4;
		
		while (lives > 0) {
		
		System.out.println("1. What girl group in Korea has the most wins in Music Shows?");
		System.out.print("Answer: ");
		answer1 = scan.nextLine();
		System.out.println();
		
		System.out.println("2. How many members is in Apink?");
		System.out.print("Answer: ");
		answer2 = scan.nextLine();
		System.out.println();
		
		System.out.println("3. When did Apink debuted?");
		System.out.print("Answer: ");
		answer3 = scan.nextInt();
		//after numbers na sagot lagyan nitong scan.nextLine(); para ma clearout and continue the input
		scan.nextLine();
		System.out.println();
		
		System.out.println("4. Who is the third born?");
		System.out.print("Answer: ");
		answer4 = scan.nextLine();
		System.out.println();
		
		
		if (answer1.equalsIgnoreCase("Apink"))
		break;
		else lives--;
		
		if (answer2.equalsIgnoreCase("Six"))
		break;
		else lives--;
		
		if (answer3 == 2011)
		break;
		else lives--;
		
		if (answer4.equalsIgnoreCase("Eunji"))
		break;
		else lives--;
		
	}

		if (lives == 3)
			System.out.println("CONGRATS! PERFECT =) YOU WIN!");
			
		else if (lives > 0)
			System.out.println("CONGRATS! YOU HAVE LIVES LEFT! YOU WIN!");
		
		else
			System.out.println("SORRY =( YOU LOSE! OUT OF LIVES!");
			System.out.println("TRY AGAIN!");
	}

}
