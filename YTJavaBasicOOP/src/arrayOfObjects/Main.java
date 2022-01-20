package arrayOfObjects;

public class Main {

	public static void main(String[] args) {
		/*STORING
		 * Classname identifier = new Classname[size];
		 * identifier [index] = new Classname(constructor);
		 */
		
		/*WHEN IN FOR LOOP WITH (.LENGTH)
		 * kung ilan un laman ng array un din dapat laman nung size
		 *2 lng dito dahil 2 employees lng
		 *it errors pag mali un size*/
		
		Employee employees[] = new Employee[2];
		employees [0] = new Employee("Chorong", "Park", "Manager");
		employees [1] = new Employee("Bomi", "Yoon", "Assistant");
		
		System.out.println(employees[1].firstname);
		
		
		//ACCESSING
		/*System.out.println(employees[0].firstname);
		System.out.println(employees[1].firstname);*/
		
		/*employees[1].introduceself();
		employees[0].introduceself();*/
		
		//FOR LOOP
		/*for (int i = 0; i < employees.length; i++) {
			employees[i].introduceself();
		}*/
		
		//FOR EACH LOOP
	for (Employee e: employees) {
		e.introduceself();
	}
	}

}
