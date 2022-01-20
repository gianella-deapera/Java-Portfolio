package inheritance;

public class Kid extends Toddler {

	int level;
	
	Kid (String name, String sex, int age, String favgame, int level){
		super(name,sex,age,favgame);
		this.level = level;
	}
	void level() {
		System.out.println("Game Level: " + level);
	}
}
