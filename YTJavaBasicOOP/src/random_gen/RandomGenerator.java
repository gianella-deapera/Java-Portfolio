package random_gen;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		
		Random generator = new Random();
		
		//gives random numbers from 0-10
		int x = generator.nextInt(10)+1;
		System.out.println("INT     : " + x);
		
		//gives random numbers from 0-1
		double y = generator.nextDouble();
		System.out.println("DOUBLE  : " + y);
		
		//gives random true/false
		boolean z = generator.nextBoolean();
		System.out.println("BOOLEAN : " + z);
	}

}
