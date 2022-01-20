package encapsulation;

public class Main {

	public static void main(String[] args) {
		
		User u = new User(12345, "bom123" ,"Bomi", "Yoon");
			
			//nabago na dito sa setter un userid
			u.setuserID(5689);
			//naget na un bagong userid which is 5689
			int id = u.getuserID();
			System.out.println(id);
			System.out.println(u.getfirstname());
	}

}
