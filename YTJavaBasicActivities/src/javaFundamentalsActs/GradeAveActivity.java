package javaFundamentalsActs;
import java.util.Scanner;
public class GradeAveActivity {

	public static void main(String[] args) {
		
		float Science;
		float Math;
		float English;
		float Filipino;
		float Average;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ENTER STUDENT'S GRADES TO COMPUTE AVERAGE");
		
		System.out.print("Science Grade  : ");
		Science = scan.nextFloat();
		
		System.out.print("Math Grade     : ");
		Math = scan.nextFloat();
		
		System.out.print("English Grade  : ");
		English = scan.nextFloat();
		
		System.out.print("Filipino Grade : ");
		Filipino = scan.nextFloat();
		
		Average = (Science+Math+English+Filipino)/4;
		
		System.out.println();
		System.out.println("Average        : " + Average);
		
		if (Average > 100) {
			System.out.print("INVALID GRADE");
			
		}else if (Average >=98) {
			System.out.print("WITH HIGHEST HONORS");	
			
		}else if (Average >=95) {
			System.out.print("WITH HIGH HONORS");
			
		}else if (Average >=90) {
			System.out.print("WITH HONORS");
			
		}else if (Average >=75) {
			System.out.print("PASSED");
			
			}else {
				System.out.print("STUDENT FAILED =(");
			
			}
		
	}

}