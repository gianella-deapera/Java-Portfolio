package objMethods;

public class Main {

	public static void main(String[] args) {
		
		/*CALLING OBJECTS - IN MAIN CLASS
		 * Classname cn = new classname(constructor);
		 * cn.methodname(arguments);
		 * */

		Character c = new Character("Chorong","Apink",23,45,6);
		c.introduce();
		c.saydialog();

	}

}
