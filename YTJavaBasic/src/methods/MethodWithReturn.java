package methods;

public class MethodWithReturn {

	public static void main(String[] args) {
		
		int sum  = add(7,9);
		System.out.println("Sum : " +sum);
		
		System.out.println(isLegal(9));
	}

	/*modifiers returntype methodName(Arguments=datatype and argumentname){
	 * DO ANYTHING HERE
	 * return value;}*/
	
	static int add(int num1,int num2) {
		return num1 + num2;
	}
	
	/*itong sa add pwede rin gawing calcu, change lng un operation
	 * or mag add ka na lng ng program para sa ibang operations*/
	
	static boolean isLegal(int age) {
		
		if (age>=18) return true;
		else return false;
	}
	
}
