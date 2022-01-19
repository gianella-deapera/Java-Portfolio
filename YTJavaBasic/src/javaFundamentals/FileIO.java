package javaFundamentals;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) {
		
		//(Print) Basic File Handling
		//this creates a new file called "example.txt" which is found on workspace eclipse 
		
		File myFile = new File("example.txt");
		
		try {
			PrintWriter pw = new PrintWriter(myFile);
			int number = 100;
			pw.println("Hello World x" + number);
			pw.println("Let's GO!");
			pw.println("Apink is Awesome!");
			pw.close();

		} catch (IOException e) {
			System.out.printf("Error! %s",e);
		//printf is from c language
		//%s = format specifier for STRING data type 
		
		}
		
		//(Scan) Basic File Handling
		//this reads the text inside "example.txt" and output it to the console
		
		try {
			Scanner scan = new Scanner(myFile);
			String name = scan.nextLine();
			String number = scan.nextLine();
			String word = scan.nextLine();
			
			System.out.println(name);
			System.out.println(number);
			System.out.println(word);
			scan.close();
			
		} catch (FileNotFoundException e) {
			System.out.printf("Error %s \n",e);
		}

	}

}
