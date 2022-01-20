package polymorphism3;

public class Main {

	// polymorphism = 	greek word for poly-"many", morph-"form"
	//					The ability of an object to identify as more than one type
	
	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car, bike, boat};

		//car.go();
		//bike.go();
		//boat.go();	this 3 can be in a for loop below
		
		for (Vehicle v : racers) {
			v.go();
		}
	}

}
