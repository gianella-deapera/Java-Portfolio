package javaFundamentalsActs;

import java.util.Scanner;

public class MathCls_Hypotenuse {

	public static void main(String[] args) {
		
		//finding the hypotenuse

		double x;
		double y;
		double ans;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter side x : ");
		x = scan.nextDouble();
		
		System.out.print("Enter side y : ");
		y = scan.nextDouble();
	
		ans = Math.sqrt((x*x) + (y*y));
		
		System.out.println("The hypotenuse is " + ans);
		
		scan.close();
	}

}
