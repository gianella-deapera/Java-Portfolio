package arrayOfObjects;

public class Employee {

	String firstname, lastname;
	String position;
	
	Employee(String firstname, String lastname, String position){
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
	}
	void introduceself() {
		System.out.println("Hi! I'm " + firstname + " " + lastname + ".");
		System.out.println("The " + position + " of the company.");
		System.out.println();
	}
}
