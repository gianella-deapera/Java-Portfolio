package polymorphism2;

public class Enemy {

	String name;
	int hp;
	
	void dialog() {
		System.out.println("Please change this.");
	}
	void showstatus() {
		System.out.println("Name : " + name);
		System.out.println("HP   : " + hp);
		
	}
}
