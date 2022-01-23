package hardCoded;

import javax.swing.JOptionPane;

public class Intro {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Enter Your Name:");
		JOptionPane.showMessageDialog(null, "Hello, " + name +".");

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age:"));
		JOptionPane.showMessageDialog(null, "You're " + age + " years old.");
	
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height:"));
		JOptionPane.showMessageDialog(null, "You're " + height + " cm tall.");
	
	}

}
