package colorChoosers;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JLabel label; 
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a Color:");
		button.setFocusable(false);
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.WHITE);
		label.setText("This is a text :D");
		label.setFont(new Font("MV Boli", Font.PLAIN, 75));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color.. I guess", Color.black); //shows the color chooser
		
			//label.setForeground(color); //changes color of text to the color you choose
			label.setBackground(color); //changes color of background to the color you choose
		}
		
	}

	
}
