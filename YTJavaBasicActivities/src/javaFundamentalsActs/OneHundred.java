package javaFundamentalsActs;

public class OneHundred {

	public static void main(String[] args) {

		for (int number = 1; number <= 100; number++) {
			
			//multiple of 3 and 5
			//% (modulus) returns the remainder
			if ((number%3 == 0) && (number%5 == 0)){
				System.out.println("APPLEORANGES");
			
			}else if (number%3 == 0) {
				System.out.println("APPLES");
			
			}else if (number%5 == 0) {
				System.out.println("ORANGES");
			
			}else{ System.out.println(number);
			
			}
		}

	}

}
