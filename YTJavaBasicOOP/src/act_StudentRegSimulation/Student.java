package act_StudentRegSimulation;

public class Student {

	private String firstname, lastname, course;
	private int year;
	private char section;
	
	Student (String firstname, String lastname, String course, int year, char section){
		this.firstname = firstname;
		this.lastname  = lastname;
		this.course = course;
		this.year = year;
		this.section = section;
	}
	void introduceself() {
		System.out.println("Full Name     : " + firstname + " "+ lastname);
		System.out.println("Course/Yr/Sec : " + course + " - " + year + section);
		System.out.println();
	}
}
