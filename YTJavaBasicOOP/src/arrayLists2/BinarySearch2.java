package arrayLists2;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch2 {

	public static void main(String[] args) {
		
		//uses stringcomparator2
		ArrayList<String> words = new ArrayList<>();
		
		int find;
		String key = "mystery";
		
		words.add("Girls'");
		words.add("High");
		words.add("School");
		words.add("Mystery");
		words.add("Class");
		words.add("Rocks");

		Collections.sort(words, new StringComparator2());
		
		find = Collections.binarySearch(words, key, new StringComparator2());
	
	System.out.printf("The word %s was %s found.", key, find<0? "not" : "");
	
	}

}
