package hardCoded;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstGUI implements ActionListener{

	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public FirstGUI() {
		
		frame = new JFrame("First GUI");
		
		JButton button = new JButton("CLICK HERE!");
		button.addActionListener(this);
		
		label = new JLabel("Number of Clicks: 0 ");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(30, 50, 30, 70));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new FirstGUI();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of Clicks: " + count);
	}

}
