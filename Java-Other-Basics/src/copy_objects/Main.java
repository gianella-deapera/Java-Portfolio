package copy_objects;

public class Main {

	public static void main(String[] args) {
		//diff addresses but same value
		//assigned values in car1 and applied them to car2 when we constructed this objects below
		//Car car2 = new Car(car1);
		
		Car car1 = new Car("Chevrolet","Camaro",2021);
		//Car car2 = new Car("Ford","Mustang",2022);
		
		//copy method
		//car2.copy(car1);
		Car car2 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());		

	}

}
