package arrayLists2;

import java.util.Comparator;

//for string student
public class StringComparator implements Comparator<StringStudent>{

	@Override
	public int compare(StringStudent s1, StringStudent s2) {
		return s1.getName().compareToIgnoreCase(s2.getName());
	}
}
