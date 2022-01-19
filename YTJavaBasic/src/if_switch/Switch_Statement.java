package if_switch;

public class Switch_Statement {

	public static void main(String[] args) {
		// only works with char,int,string and enums

		char grade = 'E';
		
		switch (grade) {
		
		case 'A':
			System.out.println("Outstanding");
			//pwede png maglagay uli dito sa baba ng sysout
			break;
		case 'B':
			System.out.println("Excellent");
			break;
		case 'C':
			System.out.println("Satisfactory");
			break;
		default:
			System.out.println("Invalid");
			
		}
		
	}

}
