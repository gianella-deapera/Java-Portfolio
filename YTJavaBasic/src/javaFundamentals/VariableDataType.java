package javaFundamentals;

public class VariableDataType {

	public static void main(String[] args) {
		//declare variable
		//syntax: datatype identifier = value; or datatype identifier;
		// (sample) char section = 'B';
		
		//datatypes: 'char'-1 letter only, "String", boolean-T/F, int, float-w/ decimal
		
		//Printing Var Values
		//String name = "Gia";
		//System.out.print(name);
		
		char section = 'B';
		String name = "Gia";
		boolean likeapink = true;
		int num = 6;
		float grade = 2.5f;
		
		System.out.println(section);
		
		//reassign var: identifier = value
		// (sample) name = 'Eunji';
		
		name = "Gianella";
		likeapink = false;
		num = 5;
		
		System.out.print(name);
		
	}

}
