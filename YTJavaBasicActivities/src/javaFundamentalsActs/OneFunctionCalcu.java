package javaFundamentalsActs;
import java.util.Scanner;

public class OneFunctionCalcu {

	public static void main(String[] args) {
		
		//combination to ng userinput at arithmeticOp
		
		int x;
		int y;
		//int answer;
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter First Number: ");
		x = scan.nextInt();
		
		System.out.print("Enter Second Number: ");
		y = scan.nextInt();
		
		//answer = x+y;
		
		System.out.println();
		System.out.print("The answer to " +x  +" + " +y  +" is " +(x+y));
											// answer un nasa taas na (x+y)
	}

}
