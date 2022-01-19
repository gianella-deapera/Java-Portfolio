package whileLoop;
import java.util.Scanner;
public class ConditionsInWhileLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String names[] = {"Chorong", "Bomi", "Eunji", "Naeun", "Namjoo", "Hayoung"};
		
		System.out.print("Search Names: ");
		String search = scan.nextLine();
		
		int i = 0;

		while (i < names.length) {
			if (names[i].equalsIgnoreCase(search)){
			
			System.out.println(names[i] +" has been found.");
			break;
			}else {
				System.out.println(names[i]);
			
		}	
		i++;
		
		}
	}
}
