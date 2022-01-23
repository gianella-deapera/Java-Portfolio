package keyListeners;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	
	JLabel label;
	ImageIcon icon;
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(250, 250);
		
		icon = new ImageIcon("pizza.png");
		
		this.addKeyListener(this);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		//label.setBackground(Color.BLUE); //this uses blue square instead of png
		//label.setOpaque(true);
		label.setIcon(icon);
		
		this.getContentPane().setBackground(Color.CYAN);
		this.add(label);
		this.setLayout(null);
		this.setVisible(true);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		//this use arrow keys
		switch (e.getKeyCode()) {
		case 37: label.setLocation(label.getX() -10, label.getY()); //10 to be faster
			break;
		case 38: label.setLocation(label.getX(), label.getY() -10);
			break;
		case 39: label.setLocation(label.getX() +10, label.getY());
			break;
		case 40: label.setLocation(label.getX(), label.getY() +10);
			break;

		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//keyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key code: " + e.getKeyCode());
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		//this use awsd keys
		switch (e.getKeyChar()) {
		case 'a': label.setLocation(label.getX() -10, label.getY()); //10 to be faster
			break;
		case 'w': label.setLocation(label.getX(), label.getY() -10);
			break;
		case 's': label.setLocation(label.getX(), label.getY() +10);
			break;
		case 'd': label.setLocation(label.getX() +10, label.getY());
			break;

		}
	}
	

}
