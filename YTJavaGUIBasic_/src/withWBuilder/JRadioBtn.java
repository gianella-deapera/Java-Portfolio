package withWBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class JRadioBtn {

	private JFrame frame;
	private JRadioButton MALE;
	private JRadioButton FEMALE;
	private JLabel ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JRadioBtn window = new JRadioBtn();
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
	public JRadioBtn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("GENDER");
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Gender = new JLabel("GENDER");
		Gender.setFont(new Font("Tahoma", Font.BOLD, 14));
		Gender.setBounds(156, 30, 79, 43);
		frame.getContentPane().add(Gender);
		
		MALE = new JRadioButton("MALE");
		MALE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (MALE.isSelected()) 
					FEMALE.setSelected(false);
			}
		});
		MALE.setBounds(53, 96, 109, 23);
		frame.getContentPane().add(MALE);
		
		FEMALE = new JRadioButton("FEMALE");
		FEMALE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				if (FEMALE.isSelected()) 
					MALE.setSelected(false);
			}
		});
		FEMALE.setBounds(53, 140, 109, 23);
		frame.getContentPane().add(FEMALE);
		
		JButton CHECK = new JButton("CHECK");
		CHECK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String selection = null;
			
			if(MALE.isSelected()) 
				selection = "MALE Selected";
			
			if(FEMALE.isSelected()) 
				selection = "FEMALE Selected";
			ans.setText(selection);
			
			//for console
			//System.out.println(selection);	
			
			}
		});
		CHECK.setBounds(126, 197, 89, 23);
		frame.getContentPane().add(CHECK);
		
		JLabel chosen = new JLabel("Gender Chosen:");
		chosen.setBounds(206, 100, 136, 14);
		frame.getContentPane().add(chosen);
		
		ans = new JLabel("Answer");
		ans.setBounds(225, 144, 117, 14);
		frame.getContentPane().add(ans);
	}
}
