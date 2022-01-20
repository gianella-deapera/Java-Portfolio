package arrayLists2;

import java.util.Comparator;

public class StringComparator2 implements Comparator<String>{
	
	//uses binary search 2
	
	@Override
	public int compare(String s1, String s2) {
		return s1.compareToIgnoreCase(s2);
	}

}
