package recursive;

public class Sample1 {

	public static void main(String[] args) {

		// Recursion = the process in which a method calls itself continuously
					// A method that calls itself is called a recursive method
					// useful for factorials, transversing trees, and simplifying a complex task
		
		HWorld(3);

	}

	static void HWorld(int i) {
		if (i>0) {
		
		System.out.println("Hello World! # " +i);
		i--;
		HWorld(i);
		}
	}
}
