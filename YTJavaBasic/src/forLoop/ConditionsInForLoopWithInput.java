package forLoop;
import java.util.Scanner;
public class ConditionsInForLoopWithInput {

	public static void main(String[] args) {
		
		//FOR LOOP IS MORE EFFIECIENT THAN WHILE LOOP
		
		Scanner scan = new Scanner (System.in);
		
		String names[] = {"Chorong", "Bomi", "Eunji", "Naeun", "Namjoo", "Hayoung"};

		System.out.print("Search Names: ");
		String search = scan.nextLine();
		
		for(int i = 0; i<names.length; i++) {

			if (names[i].equalsIgnoreCase(search)) {
				System.out.println(names[i] + " has been found.");
			break;
		}else {
			System.out.println(names[i]);
		}
	}	

	}

}
