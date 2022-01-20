package abstraction_Class;

public abstract class Animal {

	String name;
	abstract void makesound();
	
	void showname() {
		System.out.println("Name : " + name);
	}
	void setname(String name) {
		this.name = name;
	}
}
