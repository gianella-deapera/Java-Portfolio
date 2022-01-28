package generics;

public class Generics_Method {

	public static void main(String[] args) {
		/* GENERICS = enable types (classes & interfaces) to be parameters when defining:
		 * 			class, interfaces and methods
		 * 			A benefit is the eliminate the need to create multiple versions
		 * 			of methods or classes for various data types.
		 * 			Use 1 version for all reference data types.
		 */

		//this are generic methods
		
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"LET'S", "GO!", "FIGHTING!"};

		/* display all in the arrays
		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		*/
		
		//gives all 1st index in each array
		System.out.println(getFirst(intArray));
		System.out.println(getFirst(doubleArray));
		System.out.println(getFirst(charArray));
		System.out.println(getFirst(stringArray));
		
	}

	//this prints all the items inside the array
	public static <Thing> void displayArray (Thing[] array) {
		
		for (Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static <Thing> Thing getFirst(Thing[] array) {
		return array[0];
	}
	
	
}
