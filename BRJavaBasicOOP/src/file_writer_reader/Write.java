package file_writer_reader;

import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red. \nViolets are blue. \nAnd how are you? \nI'm fine. Thank you!");
			writer.append("\n(A poem made by me. hehe)");
			writer.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
