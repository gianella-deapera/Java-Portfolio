package arrayLists2;

import java.util.ArrayList;
import java.util.Collections;

public class DoubleSort {

public static void main(String[] args) {

			//this also uses the StringStudent
			//main of double
			ArrayList<StringStudent> students = new ArrayList<>();

			students.add(new StringStudent("Yena Choi", 20, 80.2));
			students.add(new StringStudent("Hyewon Kang", 24, 87.9));
			students.add(new StringStudent("Yuri Jo", 19, 86.4));
			students.add(new StringStudent("Chaewon Kim", 22, 90.5));
			
			System.out.println("Not Sorted!");
			
			for (StringStudent st: students)
			{
				System.out.println("Name : " + st.getName() + " " + "Grade: " + st.getGrade());
			}

			System.out.println();
			System.out.println("Sorted by Grades!");
			Collections.sort(students, new DoubleComparator());
			
			for(StringStudent gt: students) {
				System.out.println("Name : " + gt.getName() +" " + "Grade: " + gt.getGrade());
			}
	}

}
