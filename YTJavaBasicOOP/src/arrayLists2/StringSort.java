package arrayLists2;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {

	//main of string
	public static void main(String[] args) {

		ArrayList<StringStudent> students = new ArrayList<>();

		students.add(new StringStudent("Yena Choi", 20, 80.2));
		students.add(new StringStudent("Hyewon Kang", 24, 87.9));
		students.add(new StringStudent("Yuri Jo", 19, 86.4));
		students.add(new StringStudent("Chaewon Kim", 22, 90.5));
		
		System.out.println("Not Sorted!");
		
		for (StringStudent st: students)
		{
			System.out.println("Name : " + st.getName());	//this gets the name only
			//System.out.println("Age : " + st.getAge());		//this gets the age only
		}
	
		System.out.println();
		System.out.println("Sorted!");
		Collections.sort(students, new StringComparator());
		
		for(StringStudent rt: students) {
			System.out.println("Name: " + rt.getName());
		}
	}

}
