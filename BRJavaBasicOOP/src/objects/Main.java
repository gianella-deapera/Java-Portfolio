package objects;

public class Main {

	public static void main(String[] args) {
		
		Cars myCars1 = new Cars();
		Cars myCars2 = new Cars();
		
		
		System.out.println(myCars1.color);
		System.out.println(myCars1.model);
		System.out.println();
		System.out.println(myCars2.year);
		System.out.println(myCars2.model);
		System.out.println();
		
		//calling methods
		myCars1.brake();
		myCars1.drive();
	}

}
