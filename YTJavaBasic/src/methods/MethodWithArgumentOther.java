package methods;

public class MethodWithArgumentOther {

	public static void main(String[] args) {
		
		greet("Chorong",27);
		print("APINK LEADER");
	}
	//un mga method pwede pa ring tawagin sa loob ng method
	
	static void greet(String name, int age) {
		print("Hi! I'm " + name + ".");
		print("I'm " + age + " years old.");
	}
	
	static void print(String word) {
		System.out.println(word);
		}

}
