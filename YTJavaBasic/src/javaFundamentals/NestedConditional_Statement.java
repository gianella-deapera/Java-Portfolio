package javaFundamentals;
import java.util.Scanner;
public class NestedConditional_Statement {

	//dito ay sama samang if ifelse else if and so on
	
	public static void main(String[] args) {
		
		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		age = scan.nextInt();
		boolean isVerified = true;
		
		if (age >= 18) {
			System.out.println("You Passed.");
			if (isVerified) {
				System.out.print("QUALIFIED");
				}else {
					System.out.print("NOT QUALIFIED");
					
				}
				
			}
		}
		
	}