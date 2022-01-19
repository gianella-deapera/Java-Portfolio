package methods;

public class OverloadedMethods {

	public static void main(String[] args) {

		System.out.println("Add      : " + add(4, 6));
		System.out.println("Minus    : " + addminus(1, 67, 6));
		System.out.println("Multiply : " + multiply(4.5, 8));
		System.out.println("Divide   : " + divide(56.3, 87.9));
	
	}
	static int add(int num1, int num2) {
		return num1 + num2;
		
	}
	static int addminus(int num1, int num2, int num3) {
		return num1 + num2 - num3;
		
	}
	static double multiply(double num1, int num2){
		return num1 * num2;
	
	}
	static double divide(double num1, double num2) {
		return num1/num2;
	}
		
}
