package chckBox;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkBox;
	ImageIcon xIcon, rIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		xIcon = new ImageIcon("exit.png");
		rIcon = new ImageIcon("restart.png");
		
		button = new JButton();
		button.setText("SUBMIT");
		button.addActionListener(this);
		button.setFocusable(false);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot.");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas", Font.PLAIN, 35));
		checkBox.setIcon(xIcon);		//the checkbox became an image here, default select is exit
		checkBox.setSelectedIcon(rIcon);//changed the checkbox to restart when selected
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
		
		
	}
	
		
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println(checkBox.isSelected());
		}
		
	}

	
	
}
