package progressBars;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarDemo {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0, 100);
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(0, 0, 420, 50);
		bar.setStringPainted(true); //adds % to bar
		bar.setFont(new Font("MV Boli", Font.BOLD, 20));
		bar.setForeground(Color.blue);
		bar.setBackground(Color.yellow);
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 0;
		
		while (counter <= 100) { 
			bar.setValue(counter);
			try {
				Thread.sleep(50); //increased by (counter)1 every 50 milliseconds
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter += 1;
		}
		bar.setString("DONE!"); //display this after the progress bar finished
	}
}
