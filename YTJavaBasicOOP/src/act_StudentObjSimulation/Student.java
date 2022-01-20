package act_StudentObjSimulation;

public class Student {

	String firstname, lastname, course, year, section;
	float prelim, midterm, finals;
	
		Student	(String firstname, String lastname, 
				 String year,String course, String section, 
				 float prelim, float midterm, float finals){
		this.firstname = firstname;
		this.lastname = lastname;
		this.year = year;
		this.course = course;
		this.section = section;
		this.prelim = prelim;
		this.midterm = midterm;
		this.finals = finals;
	}
	
	void introduceself() {
		System.out.println("Student Name : " + firstname + " " +lastname);
		System.out.println("Course       : " + course);
		System.out.println("Year         : " + year);
		System.out.println("Section      : " + section);
		System.out.println();
	}
	void evaluategrade() {
		float Average = (prelim + midterm + finals)/3;
		System.out.println("STUDENT NAME  : " + firstname + " " +lastname);
		System.out.println("GRADE AVERAGE : " + Average);
	
		String remark = "";
		
		if 		(Average > 100) remark = "INVALID GRADE";	
		else if (Average >= 98)  remark = "WITH HIGHEST HONORS";	
		else if (Average >= 95)  remark = "WITH HIGH HONORS";
		else if (Average >= 90)  remark = "WITH HONORS";
		else if (Average >= 75)  remark = "PASSED";
		else 					remark = "FAILED";
		System.out.println("REMARKS       : " + remark);		
	}
}
