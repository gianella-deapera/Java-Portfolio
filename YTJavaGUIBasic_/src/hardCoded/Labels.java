package hardCoded;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Labels {

	public static void main(String[] args) {
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("labelimage.jpg");
		Border border = BorderFactory.createLineBorder(Color.GREEN,3);
		
		JLabel label = new JLabel();					//create a label
		label.setText("Hey, do you even code?");		//set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);	//set text LEFT,CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP);		//set text TOP,CENTER, BOTTOM of imageicon
		label.setForeground(Color.BLUE);				//set font color of text
		label.setFont(new Font("Sans Serif", Font.ITALIC, 30));//set font of text
								//hindi lng Font.BOLD meron dito may kung anu ano pa
		
		label.setIconTextGap(-90);	//set gap of text to image
		//(-) >palapit sa image, (+) >palayo naman
		
		label.setBackground(Color.CYAN);			//set background color
		label.setOpaque(true);						//display background color
		label.setBorder(border);					//sets border of label (not image+text)
		label.setVerticalAlignment(JLabel.CENTER);	//set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER);//set horizontal position of icon+text within label
		//label.setBounds(100, 100, 500, 600);		//set x,y position within frame as well as dimensions
		
		
		JFrame  frame = new JFrame();							 //creates a frame, can also set title inside the ()
		frame.setTitle("A Label");							//sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exit from application
		frame.setResizable(true); 								//prevent frame from being resized
		//frame.setSize(800, 800);								//sets the x-dimension, and y-dimension of frame
		//frame.setLayout(null);
		frame.setVisible(true);									//make frame visible
		frame.add(label);
		frame.pack();//the frame become the size of the picture, this is always at the end to show components
					//resize the size of the frame to accommodate all of the components that you have
	}

}
