package javaFundamentalsActs;

public class ReverseArray {

	public static void main(String[] args) {
		
		//from an interview
		int x[] = new int[]{1,3,5,7,9,6};
		
		System.out.println("Original");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		
		System.out.println();
		System.out.println("Reversed");
		for (int i = x.length-1; i>0; i--) {
			System.out.print(x[i] + " ");
		}
	}
	

}
