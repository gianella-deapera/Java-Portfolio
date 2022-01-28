package recursive;

import java.util.Scanner;

public class Sample1_Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Number of times to say HELLO WORLD: ");		
		int number = scan.nextInt();
		
		HWorld(number);

	}

	static void HWorld(int i) {
		if (i>0) {
		
		System.out.println("Hello World! # " +i);
		i--;
		HWorld(i);
		}
	}
}