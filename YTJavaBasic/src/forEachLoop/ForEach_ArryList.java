package forEachLoop;

import java.util.ArrayList;

public class ForEach_ArryList {

	public static void main(String[] args) {
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Cow");
		animals.add("Horse");
		
		for (String i : animals) {
			System.out.println(i);
		}

	}

}
