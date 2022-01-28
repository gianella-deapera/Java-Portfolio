package variable_scope;

import java.util.Random;

public class DiceRoller {

	//i think this is local declare, I THINK GLOBAL DECLARE IS EASIER
	
	DiceRoller(){
		Random random = new Random();
		int number = 0;
		roll(random,number);
	
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
	
}

//this is global declare PS. I THINK THIS IS EASIER

/*
 	Random random;
	int number;
 
 	DiceRoller(){
		Random random = new Random();
		roll();
	
	}
	
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
	 */
