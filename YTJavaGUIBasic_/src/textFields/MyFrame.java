package textFields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JTextField txtfield;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
	
		button = new JButton("Submit");
		button.addActionListener(this);
		
		txtfield = new JTextField();
		txtfield.setPreferredSize(new Dimension(250, 40));
		txtfield.setFont(new Font("Consolas", Font.PLAIN, 35));
		txtfield.setForeground(new Color(0x00FF00));
		txtfield.setBackground(Color.DARK_GRAY);
		txtfield.setCaretColor(Color.WHITE); //cursor line
		txtfield.setText("username");
		
		this.add(button);
		this.add(txtfield);
		this.pack();
		this.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println("Welcome " + txtfield.getText());
			button.setEnabled(false); // can't change the text once submitted
			txtfield.setEditable(false); // be careful in submitting the text it cannot be change
			
		}
		
	}

}
