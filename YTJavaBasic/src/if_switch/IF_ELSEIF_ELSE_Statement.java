package if_switch;
import java.util.Scanner;
public class IF_ELSEIF_ELSE_Statement {

	public static void main(String[] args) {
		
		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Age: ");
		age = scan.nextInt();
		
		//kung one liner lng code mo pwede tanggalin na un {}
		//like this
		//if (age >= 18) System.out.print("You're in College.");
		//else if (age >=12) System.out.print("You're in Highschool.");	
		//else System.out.print("You're a Kid. What the...");
		
		if (age >= 18) {
			System.out.print("You're in College.");
			
		}else if (age >=12) {
			System.out.print("You're in Highschool.");	
			
		}else if (age >=6) {
			System.out.print("You're in Elementary.");
			
			}else {
				System.out.print("You're a Kid. What the...");
			
			}

	}

}
	
