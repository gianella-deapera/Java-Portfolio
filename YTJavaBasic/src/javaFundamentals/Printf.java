package javaFundamentals;

public class Printf {

	public static void main(String[] args) {
		
		//Printing like c++ in java
		String word = "Apink";		// %s (pwede rin %10s=left justify or %-10s=right justify)
		int number = 20;			// %d
		char letter = 'A';			// %c
		boolean condition = true;	// %b
		double d = 3.12;			// %f
		float f = 6.57f;			// %f
		long l = 10000009080L;		// %d
		
		double db = 564.54;	//if put (-), it will be negative
		double dk = 1000;
		double dc = 457.98;
		
		System.out.printf("Word    = %s \n", word);
		System.out.printf("Number  = %d \n",number);
		System.out.printf("Letter  = %c \n",letter);
		System.out.printf("Boolean = %b \n",condition);
		System.out.printf("Double  = %.4f \n",d);		//.4f gives 4 decimal pt & 4f gives 4 zeros
		System.out.printf("Float   = %.3f \n",f);		//.3f gives 3 decimal pt
		System.out.printf("Long    = %d \n \n",l);
		
		System.out.printf("Double plus  = %+f \n",db);			//adds + sign & 0
		System.out.printf("Double comma = %,f \n",dk);			//adds , & 0
		System.out.printf("Double zeros = %020f \n \n",dc);		//add 0 to front and end
		
		//kung anung naunang iprint dito sa sentence, un din dapat ang pagkakasunod sunod sa dulo
		System.out.printf("The word is %s and number is %d.\nThis is %b.",word,number,condition);
	}

}
