package act_StudentRegSimulation;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);

		System.out.print("Number of Students to be Registered: ");
		int size = scan.nextInt();
		scan.nextLine();
		
		Student students[] = new Student[size];
		
		 String firstname, lastname, course;
		 int year;
		 char section;
		
		for (int i = 0; i < students.length; i++) {
			System.out.println();
			System.out.println("Student# " + (i+1));
		
		System.out.print("First Name : ");
		firstname = scan.nextLine();
		
		System.out.print("Last Name  : ");
		lastname = scan.nextLine();
		
		System.out.print("Course     : ");
		course = scan.nextLine();
		
		System.out.print("Year       : ");
		year = scan.nextInt();
		scan.nextLine();
		
		System.out.print("Section    : ");
		section = scan.nextLine().charAt(0);
		System.out.println();
		
		students [i] = new Student(firstname, lastname, course, year, section); 
		}

		for (Student s: students) {
			s.introduceself();
		}
	}

}
