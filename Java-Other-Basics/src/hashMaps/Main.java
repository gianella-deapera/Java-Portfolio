package hashMaps;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// HashMap implements the Map interface (need import)
		// HashMap is similar to ArrayList, but with key-value pairs
		// stores objects, need to use Wrapper Class
		// ex: (name,email),(username,userID),(country,capital)
		
		HashMap<String, String> countries = new HashMap<String, String>();

		//add key and value
		countries.put("USA", "Washington DC");
		countries.put("Philippines", "Manila");
		countries.put("Japan", "Tokyo");
		countries.put("South Korea", "Seoul");
		
		//System.out.println(countries);
		
		//countries.remove("USA"); //removes usa
		
		//System.out.println(countries.get("South Korea")); //gets the capital of korea
		
		//countries.clear(); //removes all
		
		//System.out.println(countries.size()); //gets the size of hashmap
		
		//countries.replace("USA", "Detroit"); //changes partner of usa
		
		//System.out.println(countries.containsKey("England")); //like boolean - false because no england
		
		//System.out.println(countries.containsValue("Seoul")); //like the containskey above 
		
		 for (String i : countries.keySet()) {
			System.out.print(i + "\t" + "= ");
			System.out.println(countries.get(i));
		}
		
		
	}

}
