package trycatch_exceptions;

public class TryCatch1 {

	public static void main(String[] args) {

		try {
			
			int a[] = {2,3,4};
			System.out.println(a[1]);

		} catch (Exception e) {
			System.out.println("No value. The exception happened.");
		}
		
		
	}

}
