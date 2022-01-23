package hardCoded;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panels {

	public static void main(String[] args) {
		
		// JPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("panelimage.png");
		
		JLabel label = new JLabel("HELLO");
		label.setIcon(icon);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		//label.setBounds(0, 0, 75, 75); this and null below to put image in specific position
		//and no need to use the ff: label.setVerticalAlignment(JLabel.BOTTOM);
									//label.setHorizontalAlignment(JLabel.RIGHT);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(new BorderLayout());
		//redPanel.setLayout(null);
		
		JPanel yellowPanel = new JPanel();
		yellowPanel.setBackground(Color.YELLOW);
		yellowPanel.setBounds(250, 0, 250, 250);
		yellowPanel.setLayout(new BorderLayout());
		//yellowPanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(new BorderLayout());
		//greenPanel.setLayout(null);
		
		JFrame  frame = new JFrame("A Panel");					//creates a frame, can also set title inside the ()
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exit from application
		frame.setSize(600, 600);								//sets the x-dimension, and y-dimension of frame
		frame.setLayout(null);
		frame.setVisible(true);									//make frame visible
		
		yellowPanel.add(label);
		frame.add(redPanel);
		frame.add(yellowPanel);
		frame.add(greenPanel);
	
	}

}
