package methods;

public class MethodOrFunction {

	//dapat mas madami un local kesa global
	//Global variable=kahit saan ma aaccess
	static String section = "A";
	
	public static void main(String[] args) {
		
		//2.CALLING methods
		//methodName(); sa loob ng main method un public string args
		sayHello();
		Section();
		sayHello();
		
	}
	
	//1.CREATING methods
	//modifier returntype methodName(){tapos sa baba un partner na curly brace}
	
	static void sayHello(){
		System.out.println("HELLO WORLD!");

	}
	
	static void Section() {
		System.out.println(section);
	}
		
}
