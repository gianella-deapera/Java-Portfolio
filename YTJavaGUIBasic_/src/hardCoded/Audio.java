package hardCoded;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Audio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// for .WAV files only

		Scanner scan = new Scanner(System.in);
		
		File file = new File("tune.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.println("MUSIC WILL PLAY, WHAT DO YOU WANT TO DO?");
			System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
			System.out.println("Enter your Choice: ");
		
			response = scan.next();
			response = response.toUpperCase();
		
		switch (response) {
			case ("P"): clip.start();
			break;
			case ("S"): clip.stop();
			break;
			case ("R"): clip.setMicrosecondPosition(0);
			break;
			case ("Q"): clip.close();
			break;
			default: System.out.println("Invalid");
			
		}
		System.out.println("Byeeee!\n");
	
		}

	}

}
