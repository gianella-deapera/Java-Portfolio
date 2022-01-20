package arrayLists2;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer>{

		@Override
		public int compare(Integer a, Integer b) {
			return a-b;		//returns least to greatest
		//	return b-a;		//returns greatest to least
		}

	}


