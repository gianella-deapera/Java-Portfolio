package hardCoded;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPanes {

	public static void main(String[] args) {
		//JOptionPane = pop up a standard dialog box that prompts users for a value 
		//				or informs them of something.

	//JOptionPane.showMessageDialog(null, "This is some useless info.", "Plain", JOptionPane.PLAIN_MESSAGE);
	//JOptionPane.showMessageDialog(null, "Here is more useless info.", "Info", JOptionPane.INFORMATION_MESSAGE);
	//JOptionPane.showMessageDialog(null, "Warning! Aliens are coming.", "Warning", JOptionPane.WARNING_MESSAGE);
	//JOptionPane.showMessageDialog(null, "Really?", "Question", JOptionPane.QUESTION_MESSAGE);
	//JOptionPane.showMessageDialog(null, "Something went wrong.", "Error", JOptionPane.ERROR_MESSAGE);
	
		//int and string says you can store result inside the variable
	//int ans = JOptionPane.showConfirmDialog(null, "Hey, Do you even code?", "Sample Title", JOptionPane.YES_NO_CANCEL_OPTION );
	//String name = JOptionPane.showInputDialog("What is your name?");
	//System.out.println("Hello " + name);
		
		String [] response = {"No, really awesome!", "Thank you!", "*blushing hard*"};
		
		ImageIcon icon = new ImageIcon("stopwatch.png");
		
		JOptionPane.showOptionDialog(null,
				"You are awesome!",
				"The SECRET",
				JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				icon,
				response, 
				0); //index 0 is autmatically selected
	
	}

}
