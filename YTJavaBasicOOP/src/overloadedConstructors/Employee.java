package overloadedConstructors;

public class Employee {

	String firstname, lastname;
	private String position, address, sex;
	private int age;
	
	//this all have different parameters
	
	Employee(){
		firstname = "N/A";
		lastname = "N/A";
		position = "N/A";
		address = "N/A";
		sex = "N/A";
		age = 0;
	}
	
	Employee(String firstname, String lastname, 
			String position, String address, 
			String sex, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.address = address;
		this.sex = sex;
		this.age = age;

	}
	Employee(String firstname, String lastname, int age){
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		sex = "N/A";
		position = "N/A";
		address = "N/A";
	}
}

