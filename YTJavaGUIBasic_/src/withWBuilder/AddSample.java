package withWBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;

public class AddSample {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSample window = new AddSample();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddSample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("ADD Sample");
		frame.setBounds(100, 100, 299, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
	
		
		JLabel numb1 = new JLabel("600");
		numb1.setBounds(91, 41, 46, 14);
		frame.getContentPane().add(numb1);
		
		JLabel numb2 = new JLabel("900");
		numb2.setBounds(91, 69, 46, 14);
		frame.getContentPane().add(numb2);
		
		JLabel ansLabel = new JLabel("ANSWER");
		ansLabel.setBounds(88, 143, 69, 14);
		frame.getContentPane().add(ansLabel);
		
		//ADD
		JButton addbutton = new JButton("ADD");
		addbutton.setBackground(new Color(204, 255, 204));
		addbutton.setForeground(new Color(102, 0, 153));
		addbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int num1 = Integer.parseInt(numb1.getText());
			int num2 = Integer.parseInt(numb2.getText());
			
			int sum = num1 + num2;
			
			ansLabel.setText(String.format("%d", sum));
			
			}
		});
		
	
		addbutton.setBounds(68, 108, 89, 23);
		frame.getContentPane().add(addbutton);
		
		//CLOSE BUTTON
		
		JButton closebutton = new JButton("CLOSE");
		closebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			System.exit(0);
			}
		});
		closebutton.setBounds(10, 195, 89, 23);
		frame.getContentPane().add(closebutton);
	}
}
