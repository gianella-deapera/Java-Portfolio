package arrayLists2;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {
		
		//uses intcomparator
		ArrayList<Integer> numbers = new ArrayList<>();
		
		int find;
		int key = 0;
		
		numbers.add(34);
		numbers.add(67);
		numbers.add(2);
		numbers.add(5);
		numbers.add(0);
		numbers.add(87);

		//binary search needs to be a sorted data
		Collections.sort(numbers, new IntComparator());
		
		find = Collections.binarySearch(numbers, key, new IntComparator());
	
	System.out.printf("Number %d was %s found.", key, find<0? "not" : "");
	
	}

}
