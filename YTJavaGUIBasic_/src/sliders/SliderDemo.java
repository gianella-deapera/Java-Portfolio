package sliders;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemo implements ChangeListener{

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	//by default slider is horizontal
	
	SliderDemo(){
		frame = new JFrame("SLIDER DEMO");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50); //0-100 number of slider, arrow is in 50 mark
		
		slider.setPreferredSize(new Dimension(400, 200));
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10); // small lines every 10
		
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(25); //large lines every 25
		
		slider.setPaintLabels(true); //put numbers in majorticks
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		slider.setOrientation(SwingConstants.VERTICAL); //sets in vertical
		
		label.setFont(new Font("MV Boli", Font.PLAIN, 25));
		label.setText("°C = " + slider.getValue());  //gets the set value of slider
		
		slider.addChangeListener(this); //gets the current value of the slide when you move it
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420, 420);
		frame.setVisible(true);
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("°C = " + slider.getValue()); //gets the current value of the slide when you move it
		
	}

	
}
