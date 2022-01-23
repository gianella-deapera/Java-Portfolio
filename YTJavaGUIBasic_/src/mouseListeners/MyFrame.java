package mouseListeners;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(250, 250);
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setBackground(Color.GREEN);
		label.setOpaque(true);
		//label.addMouseListener(this); //mouselisteners only applies to the square shaped
		this.addMouseListener(this); //mouselisteners applies to the whole frame
		
		this.add(label);
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		//System.out.println("You clicked the mouse!"); //clicked inside the green square
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		System.out.println("You entered the component!"); //enter the mouse inside the green square
		label.setBackground(Color.BLUE); //becomes blue after entering
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		System.out.println("You exited the component!"); //exit the mouse inside the green square
		label.setBackground(Color.RED); //becomes red after exiting
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		System.out.println("You pressed the mouse!"); //clicked inside the green square
		label.setBackground(Color.YELLOW); //becomes yellow after clicking
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		System.out.println("You released the mouse!"); //clicked inside the green square
		label.setBackground(Color.PINK); //becomes pink after released
	}

	
}
