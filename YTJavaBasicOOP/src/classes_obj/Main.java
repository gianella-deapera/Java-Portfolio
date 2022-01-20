package classes_obj;

public class Main {

	public static void main(String[] args) {
		
		/*CLASS INSTANTIATION IN MAIN CLASS
		 
		 * 1. Accessing attributes
		 * Classname identifier = new Classname();
		  
		 * 2. Writing Attributes
		 * identifier.attribute = value;
		  
		 * 3. Reading Attributes
		 * System.out.println(identifier.attribute);
		 */
		
		Person p = new Person();
		p.firstname = "Chorong";
		p.lastname = "Park";
		p.sex = 'F';
		p.age = 22;
		System.out.println(p.age);

		Person p1 = new Person();
		p1.firstname = "Eunji";
		p1.lastname = "Jung";
		p1.sex = 'F';
		p1.age = 20;
		System.out.println(p1.firstname);

		
	}

}
