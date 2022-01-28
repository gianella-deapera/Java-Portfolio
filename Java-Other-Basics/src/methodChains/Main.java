package methodChains;

public class Main {

	public static void main(String[] args) {
		// method chaining =  a common syntax for invoking multiple method calls in OOP
		//      condense code into less lines
		
		String name = "     apink";
		
		//LONG METHOD
		
		//name = name.concat(" coding   "); //concatenate
		//name = name.toUpperCase();
		//name = name.trim(); //remove spaces before and after the strings
		
		// this is METHOD CHAINING - SHORT METHOD
		
		name = name.concat(" coding  ").toUpperCase().trim();
		
		System.out.println(name);

	}

}
