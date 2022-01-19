package arrays;

public class Iterating2DArrays {

	public static void main(String[] args) {
		String users [][] = {
				{"Chorong", "rong123"},
				{"Bomi", "bom123"},
				{"Eunji", "pup123"},
				{"Naeun", "tuna123"}
		};
	
		for (int row = 0; row < users.length; row++) {
			
			for (int col = 0; col < users[row].length; col++) {
				System.out.println(users[row][col]);
			}
			System.out.println();
		} 
		
	}

}
//System.out.println(users[ROW OR COL].length]); to print no. of row or col
//System.out.println(users[0].length]); 
//prints the number of array in index 0==si CHORONG YUN kaya 2 ANG SAGOT
