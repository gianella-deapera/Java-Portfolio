package hardCoded;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frames {

	public static void main(String[] args) {
		 // JFrame = a GUI window to add components to
		
		JFrame  frame = new JFrame();							 //creates a frame, can also set title inside the ()
		frame.setTitle("IPSUM Frame");							//sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exit from application
		frame.setResizable(false); 								//prevent frame from being resized
		frame.setSize(420, 420);								//sets the x-dimension, and y-dimension of frame
		frame.setVisible(true);									//make frame visible
		
		ImageIcon image = new ImageIcon("logo-sample.jpg"); 		//create an ImageIcon
		frame.setIconImage(image.getImage());						//change icon of frame
		frame.getContentPane().setBackground(new Color(85, 43, 69));//change color of background
										//this color is in RGB								
										//or (Color.green)
										//or (new Color(0x123456) in hexadecimal
	
	}

}
