package arrayLists2;

import java.util.ArrayList;
import java.util.Collections;

public class IntSort {

	public static void main(String[] args) {

		//main of intcomparator
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(-7);
		numbers.add(4);
		numbers.add(9);
		numbers.add(33);
		numbers.add(21);
		numbers.add(49);
		numbers.add(0);
		
		System.out.println("Not Sorted!");
		
		for (Integer num:numbers)
		{
			System.out.println("Number: " + num);
		}
	
		System.out.println();
		System.out.println("Sorted!");
		
		Collections.sort(numbers, new IntComparator());	//sorting happens here
		for (Integer num1:numbers)
		{
			System.out.println("Number: " + num1);
		}
	
	}

}
