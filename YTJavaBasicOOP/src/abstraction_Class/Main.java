package abstraction_Class;

public class Main {

	public static void main(String[] args) {
		
		// abstract =  	abstract classes cannot be instantiated, but they can have a subclass
		//				abstract methods are declared without an implementation
		
		Animal d = new Dog();
		Animal c = new Cat();

		d.makesound();
		c.makesound();
		
		d.setname("Doggy");
		c.setname("Catie");
		
		d.showname();
		c.showname();
	}

}
