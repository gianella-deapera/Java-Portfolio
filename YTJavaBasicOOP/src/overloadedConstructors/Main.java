package overloadedConstructors;

public class Main {

	public static void main(String[] args) {
	
		Employee e1 = new Employee("Hayoung", "Oh", "Editor", "Korea", "Female", 26);
		Employee e2 = new Employee("Yena", "Choi", 23);
		Employee e3 = new Employee();
		
		System.out.println("Here are the employees:");
		System.out.println(e1.firstname +" " + e1.lastname);
		System.out.println(e2.firstname);
		System.out.println(e2.lastname);
		System.out.println(e3.firstname);
	
	}

}
