package radioBtn;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{

	JRadioButton pizzaButton, burgerButton, hotdogButton;
	ImageIcon pizzaIcon, burgerIcon, hotdogIcon;
	
	MyFrame(){
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza.png");
		burgerIcon = new ImageIcon("burger.png");
		hotdogIcon = new ImageIcon("hotdog.png");
		
		pizzaButton = new JRadioButton("Pizza");
		burgerButton = new JRadioButton("Hamburger");
		hotdogButton = new JRadioButton("Hotdog");		
		
		ButtonGroup group = new ButtonGroup(); // means you can only select 1 item within this group
		group.add(pizzaButton);
		group.add(burgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		burgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);// sets the button to the icon of pizza
		burgerButton.setIcon(burgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(pizzaButton);
		this.add(burgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == pizzaButton) {
			System.out.println("You ordered pizza!");
		
		}else if (e.getSource() == burgerButton) {
			System.out.println("You ordered hamburger!");
		
		}else if (e.getSource() == hotdogButton) {
			System.out.println("You order hotdog!");
		}
		
	}

	
}
