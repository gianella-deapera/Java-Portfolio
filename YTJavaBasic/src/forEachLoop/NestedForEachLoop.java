package forEachLoop;

public class NestedForEachLoop {

	public static void main(String[] args) {
		
		String users [][] = {
				{"Chorong", "rong123"},
				{"Bomi", "bom123","2ndborn"},
				{"Eunji", "pup123"},
				{"Naeun", "tuna123","4thborn"}
		};
		for (String[] user:users) {
			
			//System.out.println(user[0]); puro names lng lalabas dahil un lng ang nasa index 0
			//System.out.println(user[1]); puro password lng nasa index 0
			
			for (String info:user) {
				System.out.println(info);
			}
			System.out.println();
		}
	}

}
