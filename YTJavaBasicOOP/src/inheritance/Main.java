package inheritance;

public class Main {

	public static void main(String[] args) {
		//super
		Person p = new Person("Eunji Jung", "Female", 28);
		Toddler t = new Toddler("Hayoung Oh", "Female", 21, "Overwatch");
		Kid k = new Kid("Bomi Yoon", "Female", 24, "PUBG", 30);
		//up to here is super
		
		//kahit wala na nito kung may super
		/*p.name = "Naeun Son";
		p.sex = "Female";
		p.age = 25;
		
		t.name = "Namjoo Kim";
		t.age = 23;
		t.sex = "Female";
		//hanggang dito*/
		
		//p.checkstatus();
		//t.checkstatus();
		//t.play();
		k.checkstatus();
		k.level();
		p.rest();
	}

}
