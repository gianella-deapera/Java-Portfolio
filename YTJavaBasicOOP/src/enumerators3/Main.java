package enumerators3;

enum Planet{
	MERCURY(1), 
	VENUS(2), 
	EARTH(3), 
	MARS(4), 
	JUPITER(5), 
	SATURN(6), 
	URANUS(7), 
	NEPTUNE(8), 
	PLUTO(9);
	
	int numbers;
	
	Planet(int numbers){
		this.numbers = numbers;
	}
}

public class Main {

	public static void main(String[] args) {
		//enum = enumerated (ordered listing of items in a collection)
		//grouping of constants that behave similarly to objects

		Planet myPlanet = Planet.NEPTUNE; //CHANGE VALUE HERE
		
		canLive(myPlanet);
		
	}
	
	
	static void canLive(Planet myPlanet) {
		
		switch (myPlanet) {
		case EARTH:
			System.out.println("You can live here.");
			System.out.println("This is planet #" +myPlanet.numbers);
			break;

		default:
			System.out.println("You can't live here yet. Sorry :(");
			System.out.println("This is planet #" +myPlanet.numbers);
			break;
		}
		
	}

}
