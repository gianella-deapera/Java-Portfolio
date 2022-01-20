package constructors;

public class Product {

	String name;
	float price;
	
	/*1. CREATING  CONSTRUCTORS
	
	 * className(with laman or not) TULAD TO NUNG NASA baba{
	 * this.......
	 * this....
	 * 
	 * sysout
	 * 
	 * }}
	 * */
	
	Product(String name, float price){
		this.name = name;
		this.price = price;
		
	System.out.println("Product: " + name);
	System.out.println("Price: " + price);
	System.out.println();
	
	}
	
	//this are methods
	void foods() {
		System.out.println("I want to eat/drink, " + this.name);
	}
	void takeout() {
		System.out.println("I want a takeout at the price of " + this.price);
	}

}
