package twoDimenArrayList;

import java.util.ArrayList;

public class Food {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> grocerList = new ArrayList();
		
		ArrayList<String> bakeList = new ArrayList();
		bakeList.add("pasta");
		bakeList.add("garlic bread");
		bakeList.add("ham");

		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomato");
		produceList.add("pepper");
		produceList.add("salt");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("cola");
		drinksList.add("sprite");
	
		grocerList.add(bakeList);
		grocerList.add(produceList);
		grocerList.add(drinksList);
		
		System.out.println("SPECIFIC ARRAYLIST         : " +grocerList.get(2));
		System.out.println("SPECIFIC ARRAYLIST & INDEX : " +grocerList.get(0).get(1));
		System.out.println("ALL : " +grocerList);
	}

}
