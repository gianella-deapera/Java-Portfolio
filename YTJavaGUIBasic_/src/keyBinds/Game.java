package keyBinds;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.*;

public class Game {

	JFrame frame;
	JLabel label;
	Action upAction, downAction, leftAction, rightAction;
	
	Game(){
		
		frame = new JFrame("KeyBinding Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.BLUE);
		label.setBounds(100, 100, 100, 100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		//for wasd
		//label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction"); //and so on use chars
		//label.getActionMap().put("upAction", upAction);
		
		//this uses the arrows
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
		
	}
	
	public class UpAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setLocation(label.getX(), label.getY() -10);
			
		}
		
	}
	
	public class DownAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setLocation(label.getX(), label.getY() +10);
			
		}
		
	}
	
	public class LeftAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setLocation(label.getX() -10, label.getY());
			
		}
		
	}
	
	public class RightAction extends AbstractAction {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			label.setLocation(label.getX() +10, label.getY());
			
		}
		
	}
	
}
