package arrayLists2;

import java.util.Comparator;

public class DoubleComparator implements Comparator<StringStudent>{

	@Override
	public int compare(StringStudent d1, StringStudent d2) {
		return (int) ((d1.getGrade()*1000) - (d2.getGrade()*1000));
	//put negative(-) here in outside() of d1, to become greatest to least
	}
}
 