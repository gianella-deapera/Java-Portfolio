package enumerators;
//ENUMS ARE FOR CONSTANTS
public class Main {

	public static void main(String[] args) {
		//USING ENUM
		AILevel level = AILevel.HARD;
		
		/*kung one line lang kahit wala na un curly braces
		LIKE DITO KAHIT WALA NA KASI TIG IISANG SYSOUT LNG NAMAN
		
		*FOR CONDITIONAL STATEMENTS*/
		if (level == AILevel.EASY) {
			System.out.println("For Kids");
		}else if (level == AILevel.MEDIUM) {
			System.out.println("For Teenagers");
		}else if (level == AILevel.HARD) {
			System.out.println("For Mature Ones");
		}
	
	//FOR SWITCH STATEMENTS
		switch (level) {
		case EASY:
		System.out.println("For Kids");
			break;
		
		case MEDIUM:
		System.out.println("For Teenagers");
			break;
		
		case HARD:
		System.out.println("For Mature Ones");
			break;
		}
		
	}

}
