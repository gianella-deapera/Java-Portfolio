package polymorphism2;

public class WeakEnemy extends Enemy {

	WeakEnemy(){
		name = "WEAK";
		hp = 10;
	}
	
	void dialog() {
		System.out.println(name + " : I am weak.");
		System.out.println();
	}
}
