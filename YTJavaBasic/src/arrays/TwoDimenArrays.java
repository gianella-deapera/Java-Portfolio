package arrays;

public class TwoDimenArrays {

	public static void main(String[] args) {
		
		//Declare with values
		String users [][] = {
				{"Chorong", "rong123"},
				{"Bomi", "bom123"},
				{"Eunji", "pup123"},
				{"Naeun", "tuna123"}
		};
	
		//Declare without values
		//datatype identifier[][] = new datatype [rows][cols];
		String names [][] = new String [4][2];
		
		//Read values
		//System.out.println(identifier[row][col]);
		//System.out.println(users[0][1]);
		
		//Write values=change values
		//identifier[row][col] = value;
		users[0][0] = "leader";
		System.out.println(users[0][0]);
		
	}

}
