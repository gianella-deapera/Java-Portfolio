package javaFundamentals;

public class MathClass {

	public static void main(String[] args) {
		/*Search commonly used methods of the java.lang.Math class for more operations
		 * Math.max(x,y);
		 * Math.min(x,y);
		 * Math.sqrt(x);
		 * Math.pow(x,y);	base x and exponent ^y
		 * Math.abs(-x);
		 * Math.round(x);
		 *
		 * CONSTANTS SHOULD BE CAPITAL
		 * Math.PI;
		 * Math.E;
		 * */

		System.out.println("Maximum       : " + (double)Math.max(34, 90));
		System.out.println("Minimum       : " + Math.min(2, 6));
		System.out.println("Square Root   : " + Math.sqrt(5));
		System.out.println("Base/Exponent : " + Math.pow(3, 7));
		System.out.println("Absolute Value : " + Math.abs(-5));
		System.out.println("Round-off      : " + (double)Math.round(76.58));
		System.out.println("Round-Ceil     : " + Math.ceil(87.32));
		System.out.println("Round-Floor    : " + Math.floor(45.82));
		
		System.out.println();
		System.out.println("CONSTANTS");
		System.out.println("PI             : " + Math.PI);
		System.out.println("Euler's Number : " + Math.E);
	}

}
