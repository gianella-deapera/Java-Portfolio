package dynamic_polymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("A. DOG or B. CAT");
		System.out.print("Your answer is : ");
		Character ans = scan.next().charAt(0);
		scan.close();
		/* KUNG SA NUMBER
		 * System.out.print("(1=dog) or (2=cat): ");
  			int choice = scanner.nextInt();
  
  			if(choice==1) {*/
		
		
		if (ans.equals('A')) {
			animal = new Dog();
			animal.speak();
		} else if (ans.equals('B')) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("Invalid Answer");
			animal.speak();
		}
	}

}
