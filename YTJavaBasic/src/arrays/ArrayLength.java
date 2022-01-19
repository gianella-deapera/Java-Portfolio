package arrays;

public class ArrayLength {

	public static void main(String[] args) {
		
		String names[] = {"Chorong", "Bomi", "Eunji", "Naeun", "Namjoo", "Hayoung"};
		
						//kung names.length lng walang int and while it only tells the number of arrays
		//System.out.println(names.length); this line gives the no. of arrays

		int i = 0;
		
		while (i < names.length) {
			System.out.println(names[i]);
			i++;
		}	
		
	}

}
