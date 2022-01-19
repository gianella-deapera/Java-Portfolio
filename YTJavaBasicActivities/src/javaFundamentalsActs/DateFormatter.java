package javaFundamentalsActs;
import java.util.Scanner;
public class DateFormatter {

	public static void main(String[] args) {

		//mas magandang gamitin ang switch kesa sa mga if else kung equality ang e-che-check
		
		Scanner scan = new Scanner(System.in);
		
		int Month;
		int Date;
		int Year;
		String monthwords = "";
		
		System.out.print("Month : ");
		Month = scan.nextInt();
		
		System.out.print("Date  : ");
		Date = scan.nextInt();
		
		System.out.print("Year  : ");
		Year = scan.nextInt();
		
		switch (Month) {
		
		case 1:
			monthwords = "January";
			break;
		case 2:
			monthwords = "February";
			break;
		case 3:
			monthwords = "March";
			break;	
		case 4:
			monthwords = "April";
			break;
		case 5:
			monthwords = "May";
			break;
		case 6:
			monthwords = "June";
			break;
		case 7:
			monthwords = "July";
			break;	
		case 8:
			monthwords = "August";
			break;
		case 9:
			monthwords = "September";
			break;
		case 10:
			monthwords = "October";
			break;
		case 11:
			monthwords = "November";
			break;	
		case 12:
			monthwords = "December";
			break;	
		default:
	
		}
		
		System.out.println();
		
		if (monthwords == "") {
			System.out.println("INVALID MONTH");
		}else {	
		
		if (Date > 31 || Date <= 0) System.out.print("INVALID DATE");
		else System.out.print(monthwords +" "+Date +", "+Year);	
		}
	}
} 
