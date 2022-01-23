package withWBuilder;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;

public class JComboBox {

	private JFrame frame;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBox window = new JComboBox();
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
	public JComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Animals");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		javax.swing.JComboBox animal = new javax.swing.JComboBox();
		animal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				lblNewLabel.setText(animal.getSelectedItem().toString());
			
			}
		});
		animal.setModel(new DefaultComboBoxModel(new String[] {"Animals","Lion", "Cat", "Elephant", "Dog", "Tiger"}));
		animal.setBounds(115, 53, 186, 29);
		frame.getContentPane().add(animal);
		
		lblNewLabel = new JLabel("Animal Selected");
		lblNewLabel.setBounds(176, 179, 97, 14);
		frame.getContentPane().add(lblNewLabel);
		
	}
}
