package menuBars;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	JMenu fileMenu, editMenu, helpMenu;
	JMenuItem loadItem, saveItem, exitItem;
	ImageIcon loadIcon, saveIcon, exitIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		
		loadIcon = new ImageIcon("load.png"); //adds the images
		saveIcon = new ImageIcon("save.png");
		exitIcon = new ImageIcon("exit.png");
		
		menuBar = new JMenuBar();
		fileMenu = new JMenu("File"); //creates the main item
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load"); //creates item in file menu
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(loadIcon); //sets the ion image
		saveItem.setIcon(saveIcon);
		exitItem.setIcon(exitIcon);
		
		fileMenu.setMnemonic(KeyEvent.VK_F); //ALT + F for file
		editMenu.setMnemonic(KeyEvent.VK_E); //ALT + E for edit
		helpMenu.setMnemonic(KeyEvent.VK_H); //ALT + H for help
		
		loadItem.setMnemonic(KeyEvent.VK_L);//click to file(in output) then shortcut key of L to load
		saveItem.setMnemonic(KeyEvent.VK_S);//same in here and exit
		exitItem.setMnemonic(KeyEvent.VK_E);
		
		fileMenu.add(loadItem); // adds this items to filemenu
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
		
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loadItem) {
			System.out.println("Loading file...");
		
		}if (e.getSource() == saveItem) {
			System.out.println("Saving file...");
		
		}if (e.getSource() == exitItem) {
			System.exit(0);
		}
		
	}

}
