package polymorphism2;

public class StrongEnemy extends Enemy {

	StrongEnemy(){
		name = "STRONG";
		hp = 50;
	}
	
	void dialog() {
		System.out.println(name + " : I am strong.");
	}
}
