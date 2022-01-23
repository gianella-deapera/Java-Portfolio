package lambdas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	JButton mybutton = new JButton("My Button 1");
	JButton mybutton2 = new JButton("My Button 2");
	
	MyFrame(){
	
		//ONE LINE ONLY
		
		mybutton.setBounds(100, 100, 150, 100);
		mybutton.addActionListener(
				(e) -> System.out.println("You clicked BUTTON #1")			
		);
		
		//MORE LINES
		
		mybutton2.setBounds(100, 200, 150, 100);
		mybutton2.addActionListener(
				(e) -> {
					System.out.println("You clicked BUTTON #2");
					System.out.println("Enjoy!");
				}
		);
		
		this.add(mybutton2);
		this.add(mybutton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420, 420);
		this.setLayout(null);
		this.setVisible(true);
		
	}
	
}
