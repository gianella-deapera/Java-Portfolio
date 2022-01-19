package methods;
import java.util.Scanner;
public class MethodWithReturnInput {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Word(s) to UpperCase : ");
		String word = anyWord(scan.nextLine());
		System.out.println(word);
	}
	
	static String anyWord(String word) {
	return word.toUpperCase();

	}

}
