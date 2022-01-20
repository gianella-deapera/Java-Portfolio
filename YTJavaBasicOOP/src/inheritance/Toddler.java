package inheritance;

public class Toddler extends Person{

	/* SUPER = 	keyword refers to the superclass (parent) of an object
				very similar to the "this" keyword
			= refers to the parent class which is "person" in here
			then un this.favgame refers to this class toddler
	
	pag may super pwede ka mag add ng attribute sa toddler lang like below*/
	String favgame;
	
	Toddler (String name, String sex, int age, String favgame){
		super(name,sex,age);
		this.favgame = favgame;
	}
	
	void play() {
		System.out.println("HI! I'm "+ name +". I like playing pc games.");
	}
	
	@Override
	void checkstatus() {
		super.checkstatus();
			System.out.println("Fav Game: " + favgame);
		}
	
	@Override
	void rest() {
		System.out.println(name + " is resting in the healing pod.");
	}
}
