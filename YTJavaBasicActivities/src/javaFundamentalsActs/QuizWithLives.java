package javaFundamentalsActs;
import java.util.Scanner;
public class QuizWithLives {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int lives = 3;
		String answer;
		
		while (lives > 0) {
		
		System.out.println("What girl group in Korea is awesome? ");
		System.out.print("Answer: ");
		answer = scan.nextLine();
		System.out.println();
		
		if (answer.equalsIgnoreCase("Apink"))
		break;
		else lives--;
		
	}
		if (lives > 0)
			System.out.println("CONGRATS! YOU'RE CORRECT AND A WINNER!");
		
		else
			System.out.println("SORRY =( YOU LOSE! WRONG ANSWER! \nIt's APINK.  =)");
		
	}
}
