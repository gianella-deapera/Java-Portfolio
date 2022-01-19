package forLoop;

public class ConditionsInForLoop {

	public static void main(String[] args) {
		
		String names[] = {"Chorong", "Bomi", "Eunji", "Naeun", "Namjoo", "Hayoung"};

		for(int i = 0; i<5; i++) {

			if (names[i].equalsIgnoreCase("Bomi")) {
				System.out.println(names[i] + " has been found.");
			break;
		}else {
			System.out.println(names[i]);
		}
	}
			
	}

}
