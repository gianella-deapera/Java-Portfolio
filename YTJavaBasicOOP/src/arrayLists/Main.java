package arrayLists;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		/*WRAPPER CLASS = ito ang gamit pag magdeclare ng primitive 
		Integer s;
		Float c;
		Character d;
		Double k;
		Boolean l;
		Byte n;*/

		//non primitive = ito lng ang pwede sa arraylist
		String name;
		Student ab;
		
		/*1. DECLARE ARRAY LIST
		 * ArrayList<DataType> identifier = new ArrayList<DataType>();
		 * this is for strings*/
		ArrayList<String> names = new ArrayList<String>();
		
		//2. Write arraylists
		names.add("Chorong");
		names.add("Eunji");
		names.add("Bomi");
		
		
		//8. Iterating array
		//this display all the names
		//for loop or 
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));	
		}
		
		//for each loop kahit alin dito sa 2
		for (String n: names) {
			System.out.println(n);
		}
		
		
		//5. delete value of specific index
		//identifier.remove(index);
		names.remove(0);
		
		//3. reading value
		System.out.println(names.get(1));//eunji's original value
		
		//4. updating value
		names.set(1, "Namjoo");//overwrites eunji
		System.out.println(names.get(1));
		
		/*6. clear all index
		 * idenfier.clear();
		   names.clear();
		 * sysout (names.get(0)) will error dahil wala ng laman dahil sa #5. remove
		 * */
		
		/*7. this gives the number of size
		 2 lng result dito dahil may remove sa taas
		
		kahit wala muna un sysout --- identifier.size();*/
		System.out.println(names.size());
		
		
		//------------------------------------------------------------------------------
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(new Student("Hayoung", "CPE"));
		students.add(new Student("Naeun", "IT"));
		students.add(new Student("Jieun", "BsED"));
		students.add(new Student("Yena", "BSPsyc"));
		
		
		//reading
		students.get(1).introduce();
		
		//update
		//identifier.set (index,value);
		students.set(2, new Student("Sejeong", "BSEE"));//overwrite nito si hayoung
		
		//remove
		students.remove(0);
		students.get(0).introduce();
		
		//iterate
		//for each loop or
		for (Student s:students) {
			s.introduce();
		}
		
		//for loop
		for (int l = 0; l < students.size(); l++) {
			students.get(l).introduce();
		}
		
//-----------------------------------------------------------------------------------		
		//this is for int
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(4);
		
	}

}
