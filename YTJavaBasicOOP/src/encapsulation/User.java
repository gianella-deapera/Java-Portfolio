package encapsulation;

public class User {

	//make attribute to private para di mabago or ma access
		private int userID;
		private String username;
		private String firstname, lastname;
		
		User(int userID, String username, String firstname, String lastname){
			this.userID = userID;
			this.username = username;
			this.firstname = firstname;
			this.lastname = lastname;
		}
		//setter para mabago un value ng userid dahil naka private sya
		void setuserID(int userID) {
			this.userID = userID;
		}
		//getter para makuha value ng userid
		int getuserID() {
			return userID;
		}
		String getusername() {
			return username;
		}
		void setfirstname(String firstname) {
			this.firstname = firstname;
		}
		void setlastname(String lastname) {
			this.lastname = lastname;
		}
		String getfirstname() {
			return firstname;
		}
		String getlastname() {
			return lastname;
		}
	
}
