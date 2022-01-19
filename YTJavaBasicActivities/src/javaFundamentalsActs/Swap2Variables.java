package javaFundamentalsActs;

public class Swap2Variables {

	public static void main(String[] args) {

		String x = "Water";
		String y = "Juice";
		String temp;
		
		//SWAPPING HERE
		temp = x;
		x=y;
		y=temp;
		
		/*Puro water lng output nito
		y=x;
	 	x=y;
		 */
		
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		
	}

}
