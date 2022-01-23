package comboBoxes;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JComboBox comboBox;
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
				
		//if you want to add numbers here use the wrapper classes
		//Integer, Double
		String[] animals = {"dog", "cat", "bird", "tiger"};
		
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true);// can edit within the box
		//System.out.println(comboBox.getItemCount()); // gets the item count within the box
		//comboBox.addItem("horse"); // adds the horse
		//comboBox.insertItemAt("pig", 0); // inserts pig in index 0 but not selected first
		//comboBox.setSelectedIndex(0); // selects the pig in index 0
		//comboBox.removeItem("cat"); // removes the cat
		//comboBox.removeItemAt(0); // removes dog that is in index 0
		//comboBox.removeAllItems(); // removes all items
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem()); // prints the words in the array
			//System.out.println(comboBox.getSelectedIndex()); // prints the index
		}
		
	}
	
}
