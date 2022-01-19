package javaFundamentalsActs;

public class ArrayOfIntegersSummation {

	public static void main(String[] args) {
		
		int numbers [] = {15,25,330,5,5,5};
		int sum = 0;
		
		for (int number:numbers) {
			sum = sum + number;
			
		}
	System.out.println("Sum: " + sum);
	}

}
