package trycatch_exceptions;

public class TryCatch2 {

	public static void main(String[] args) {
		
		try {
			
			int i [] = {5};
			System.out.println(i[0]);
			
		} catch (NullPointerException e) {
			System.out.println("The array is null.");
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index is out of bounds.");
		
		}catch (Exception e) {
			System.out.println("Something went wrong!");
		
		//FINALLY always run. Whatever happens WITH ERROR OR NOT.
		}finally {
			System.out.println("END.");
		}
	}

}
