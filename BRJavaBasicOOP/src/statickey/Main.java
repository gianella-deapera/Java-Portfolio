package statickey;

public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend1 = new Friend("Bomi");
		Friend friend2 = new Friend("Eunji");
		Friend friend3 = new Friend("Spongebob");

		System.out.println(Friend.numberofFriends);
	
		Friend.displayFriends();
	}

}
