package recursive;

import java.util.Scanner;

public class Step {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How far do you wanna walk (meters)? ");
		int distance = scan.nextInt();
		
		takeStep(0,distance);
	}

	static void takeStep(int i,int distance) {
		if (i<distance) {
			i++;
			System.out.println("Taking a step : " +i +" meter/s");
			takeStep(i, distance);
		
		}else {
			System.out.println("Finished Walking. END.");
		}
	}
	
}
