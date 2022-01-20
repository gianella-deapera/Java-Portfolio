package act_StudentObjSimulation;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("Chorong", "Park", "IV", "Music", "GF",87.9f, 98.6f, 84.9f );
		Student s1 = new Student("Eunji", "Jung", "III", "Sports", "FF", 95.6f, 98.2f, 65.9f );
			s.introduceself();
			s.evaluategrade();
			
			s1.introduceself();
			s1.evaluategrade();

	}

}
