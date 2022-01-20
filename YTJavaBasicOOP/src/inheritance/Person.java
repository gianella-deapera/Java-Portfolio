package inheritance;

public class Person {

	String name, sex;
	int age;
	
	//super
	Person (String name, String sex, int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	//up to here is super
	
	
	void checkstatus() {
		System.out.println("Name : " + name);
		System.out.println("Sex  : " + sex);
		System.out.println("Age  : " + age);
	}
	
	void rest() {
		System.out.println(name + " is resting.");
	}
	
}
