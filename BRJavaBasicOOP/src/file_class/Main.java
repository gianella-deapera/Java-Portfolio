package file_class;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		//File file = new File("C:/Users/Gia/eclipse-workspace/BRJavaBasicOOP/eclipse_file.txt");
		//or ganito kung diff project folder right click>properties>location
		
		File file = new File("eclipse_file.txt");

		if (file.exists()) {
			System.out.println("That file exist.");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
			//then refresh in folder package explorer to check its deleted
		}
		else {
			System.out.println("Nothing.");
		}
	
	}

}
