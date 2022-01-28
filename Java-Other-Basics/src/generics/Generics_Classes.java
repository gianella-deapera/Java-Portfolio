package generics;

public class Generics_Classes {

	public static void main(String[] args) {

		//the short method is in the video(di ko magets so just watch)
		// https://www.youtube.com/watch?v=jUcAyZ5OUm0&list=PLZPZq0r_RZOMhCAyywfnYLlrjiVOkdAI1&index=83&ab_channel=BroCode
		
		
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.24);
		MyCharClass myChar = new MyCharClass('A');
		MyStringClass myString = new MyStringClass("Hellos");
		
		
		//prints value inside the classes above
		System.out.println(myInt.getValue());
		System.out.println(myString.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		
	}

}
