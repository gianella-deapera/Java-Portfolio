package methods;

public class MethodWithArgumentsOrParameter {

	public static void main(String[] args) {
		
		//this is like passing value, using string x
		
		String x = " HI! WELCOME";
		
		print("HELLO APINK!" + x);
		print("Hi There!");
		
		add(5,3);
		
		greet("Chorong",27);
	}
	
	//METHODS WITH ARGUMENTS
	// modifiers returntype methodName(Arguments){baba};
									//datatype nameofargument
	static void print(String word) {
	System.out.println(word);
	}
	
	static void add(int num1,int num2) {
		System.out.println(num1 + num2);
	}
	
	static void greet(String name, int age) {
		System.out.println("Hi! I'm " + name);
		System.out.println("I'm " + age + " years old.");
	}

}
