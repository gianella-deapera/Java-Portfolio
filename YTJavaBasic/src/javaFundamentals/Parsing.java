package javaFundamentals;

public class Parsing {

	public static void main(String[] args) {
		
		//converts string to int, double, or something
		//float is N/A
		String number = "1";
		
		int x = Integer.parseInt(number);
		double y = Double.parseDouble(number);
		
		System.out.println(x);
		System.out.println(y);

	}

}
