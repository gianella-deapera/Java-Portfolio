package arrays;

public class Arrays {

	public static void main(String[] args) {
		//Declaring Arrays
		
		//with value
		//datatype identifier []={"val1", "val2" and so on};
		//without value
				//datatype identifier [] = new datatype[size];
		//(sample) String name []=new String[5];
		
		
		//THIS IS WITH VALUE ARRAYS
		//index numbering starts with 0
		String apinknames[] = {"Chorong","Bomi","Eunji",
							"Naeun","Namjoo","Hayoung"};
		
		//Accessing array-Reading array element
					//identifier[index]
		System.out.println(apinknames[0]);
		
		int numbers [] = {1,2,3,4,5,6};
		System.out.print(numbers[3] + numbers[5]);
		
		
		//Re assigning array element-kung may gusto kng palitan na value sa array
		//identifier[index] = value--ito ang papaltan
		
		//numbers[3] = 8;
		//System.out.print(numbers[3]);
	
		
		//THIS IS WITHOUT VALUES
		String staffnames [] =  new String [10];
		
		int gradenumber [] = new int [10];
		
	}

}
