package withWBuilder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JCheckBox {

	private JFrame frame;
	private javax.swing.JCheckBox elem;
	private javax.swing.JCheckBox HS;
	private javax.swing.JCheckBox Coll;
	private javax.swing.JCheckBox PG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBox window = new JCheckBox();
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
	public JCheckBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel educ = new JLabel("Education Qualification");
		educ.setFont(new Font("Tahoma", Font.BOLD, 18));
		educ.setBounds(102, 11, 224, 31);
		frame.getContentPane().add(educ);
		
		elem = new javax.swing.JCheckBox("Elementary");
		elem.setBounds(44, 76, 97, 23);
		frame.getContentPane().add(elem);
		
		HS = new javax.swing.JCheckBox("High School");
		HS.setBounds(44, 142, 97, 23);
		frame.getContentPane().add(HS);
		
		Coll = new javax.swing.JCheckBox("College");
		Coll.setBounds(229, 76, 97, 23);
		frame.getContentPane().add(Coll);
		
		PG = new javax.swing.JCheckBox("Post Graduate");
		PG.setBounds(229, 142, 139, 23);
		frame.getContentPane().add(PG);
		
		JButton btn = new JButton("CHECK");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String qual[] = new String [5];
			
			if (elem.isSelected()) {
				qual[0] = elem.getText();	
				}
			if (HS.isSelected()) {
				qual[1] = HS.getText();	
				}
			if (Coll.isSelected()) {
				qual[2] = Coll.getText();	
				}
			if (PG.isSelected()) {
				qual[3] = PG.getText();	
				}
			for(int i = 0; i<=3; i++) {
				System.out.println(qual[i]);
			}
			}
		});
		btn.setBounds(149, 209, 89, 23);
		frame.getContentPane().add(btn);
	}
}
