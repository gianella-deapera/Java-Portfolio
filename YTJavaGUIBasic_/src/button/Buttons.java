package button;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Buttons extends JFrame implements ActionListener{

	JButton button;
	JLabel label;
	
	Buttons() {
		
		ImageIcon icon = new ImageIcon("button1.png");
		ImageIcon icon2 = new ImageIcon("button2.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 200, 170);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100, 50, 250, 170);
		button.addActionListener(this);
		//LAMBDA (more advanced)
		//wala na un override below ito na lang
		//button.addActionListener(e -> System.out.println("CLICK"));
		
		button.setText("I'm a BUTTON!");
		button.setFocusable(false); //removes the square shape within the text of button
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(-2);
		button.setForeground(Color.blue);
		button.setBackground(Color.yellow);
		button.setBorder(BorderFactory.createEtchedBorder());
		//button.setEnabled(false); disable the button
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			//System.out.println("Click!");
			//button.setEnabled(false); //can clicked button only once
			label.setVisible(true);
		}
		
	}
}
