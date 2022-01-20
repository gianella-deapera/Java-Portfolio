package arrayLists;

public class Student {

	String name, course;
	
	Student(String name, String course){
		this.name = name;
		this.course = course;
	}
	
	void introduce() {
		System.out.println("I'm " + name + " from " + course + " department.");
	}

}

