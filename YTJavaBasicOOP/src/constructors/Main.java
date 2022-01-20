package constructors;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*2. USING CONSTRUCTORS
		 *	ClassName identifier = new classname(parameters);*/
		
		//WITH INPUT
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Product: ");
		String name = scan.nextLine();
		
		System.out.print("Enter Price: ");
		float price = scan.nextFloat();
		
		Product p3 = new Product(name,price);
		
		//WITHOUT INPUT
		Product p1 = new Product("Milk",56.5f);
		Product p2 = new Product("Ice",89.8f);
		
		//call the method
		p2.foods();
		p1.takeout();
	}

}
