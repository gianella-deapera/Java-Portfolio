package hardCoded;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayouts {

	public static void main(String[] args) {
		// Layout Manager = Defines the natural layout for components within a container
		
		// FlowLayout = 	places components in a row, sized at their preferred size. 
		//					If the horizontal space in the container is too small,
		//					the FlowLayout class uses the next available row.

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 350);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 250));
		panel.setBackground(Color.YELLOW);
		panel.setLayout(new FlowLayout());
		
		//instead of this JButton button1 = new JButton();
		//we can use this shortcut
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		frame.setVisible(true);
	}

}
