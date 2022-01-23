package frame2;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	 // JFrame = a GUI window to add components to
	
	MyFrame() {
		
		this.setTitle("IPSUM Frame");							//sets title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exit from application
		this.setResizable(false); 								//prevent frame from being resized
		this.setSize(420, 420);									//sets the x-dimension, and y-dimension of frame
		this.setVisible(true);									//make frame visible
		
		ImageIcon image = new ImageIcon("logo-sample.jpg"); 		//create an ImageIcon
		this.setIconImage(image.getImage());						//change icon of frame
		this.getContentPane().setBackground(new Color(40, 34, 69));	//change color of background
										//this color is in RGB								
										//or (Color.green)
										//or (new Color(0x123456) in hexadecimal
	
	}
}
