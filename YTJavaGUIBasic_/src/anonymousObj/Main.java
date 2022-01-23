package anonymousObj;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		/*THIS IS THE LONG METHOD
		 * 
		ImageIcon AC = new ImageIcon("src\\52_cards\\club_10.png");
		JLabel aCLabel = new JLabel(AC);
		deck.add(aCLabel);
		
		..REPEAT 51 TIMES TO ADD ALL THE IMAGES
		..NOT VERY GOOD IF 51 TIMES
		*/
		
		//THE SHORT METHOD - nameless obj
		//only works if the image name is 1,2,3 or so on basta naka int sya
		
		for (int i = 1; i <= 53; i++) {
			deck.add(new JLabel(new ImageIcon("src\\52_cards\\" + i + ".png")));
			frame.add(deck.get(i-1));
		}
		
		//frame.add(deck.get(0)); //if you want to call just one
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
	}

}
