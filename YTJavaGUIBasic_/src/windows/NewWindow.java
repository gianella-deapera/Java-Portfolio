package windows;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	JFrame frame = new JFrame("New Window");
	JLabel label = new JLabel("HELLO! NEW WINDOW OPENS.");
	
	NewWindow(){
		
		label.setBounds(10, 0, 400, 50);
		label.setFont(new Font(null, Font.BOLD, 25));
		
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
