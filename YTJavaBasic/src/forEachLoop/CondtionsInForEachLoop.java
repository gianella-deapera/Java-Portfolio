package forEachLoop;

public class CondtionsInForEachLoop {

	public static void main(String[] args) {

		//pag tinanggal ang else statement Nauen has be... lng output
		//wala na un chorong bomi eunji sa unahan
		
		String names[] = {"Chorong", "Bomi", "Eunji", "Naeun", "Namjoo", "Hayoung"};
		
		for (String name :names ) {

			if (name.equalsIgnoreCase("Naeun")) {
				System.out.println(name + " has been found.");
				break;
			}else {
				System.out.println(name);
			}
	}
	}
}
