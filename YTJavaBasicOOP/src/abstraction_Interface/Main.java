package abstraction_Interface;

public class Main {

	public static void main(String[] args) {
		
		/*di ito inheritance or polymorphism kaya mas maganda ito kesa sa
		 *Animal d = new Dog();
		 *Animal b = new Bird(); */
		
		Dog d = new Dog();
		Bird b = new Bird();
		Frog f = new Frog();

		b.makesound();
		d.makesound();
	}

}
