package polymorphism2;

public class Main {

	public static void main(String[] args) {
		
		Enemy w = new WeakEnemy();
		Enemy s = new StrongEnemy();
		
		w.showstatus();
		w.dialog();
		
		s.showstatus();
		s.dialog();
	
	}

}
