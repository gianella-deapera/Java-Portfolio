package forEachLoop;
import java.util.Scanner;
public class ConditionsInForEachLoopWithInput {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String names[] = {"Chorong", "Bomi", "Eunji", "Naeun", "Namjoo", "Hayoung"};
		
		System.out.print("Search Names: ");
		String search = scan.nextLine();
		
		for (String name :names ) {

			if (name.equalsIgnoreCase(search)) {
				System.out.println(name + " has been found.");
				break;
			}else {
				System.out.println(name);
			}
	}

	}

}
