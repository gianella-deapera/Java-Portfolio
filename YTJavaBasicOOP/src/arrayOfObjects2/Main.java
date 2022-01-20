package arrayOfObjects2;

public class Main {

	public static void main(String[] args) {

		Food food1 = new Food("Pie");
		Food food2 = new Food("Donut");
		Food food3 = new Food("Candy");
	
		Food [] ref = {food1, food2, food3};
	
		System.out.println(ref[0].name);
		System.out.println(ref[1].name);
		System.out.println(ref[2].name);
	}

}
