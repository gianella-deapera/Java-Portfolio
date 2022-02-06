package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private JButton btnERASE;
	private JButton btnC;
	private JButton btnPLUS;
	private JButton btnMINUS;
	private JButton btnMULTI;
	private JButton btnDIV;
	private JButton btnDOT;
	private JButton btnEQUALS;
	private JButton btn0;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	
	private JRadioButton rdbtnON;
	private JRadioButton rdbtnOFF;
	
	private JLabel lblCaption;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}
	
	
	double num,ans;
	int calculation;
	
	public void arithmetic_operation() {
		switch (calculation) {
		case 1:
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 2:
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 3:
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		case 4:
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
				
			
		default:
			break;
		}
	}
	
	
	public void on() {
		
		rdbtnON.setEnabled(false);
		rdbtnOFF.setEnabled(true);
		
		textField.setEnabled(true);
		
		btnERASE.setEnabled(true);
		btnPLUS.setEnabled(true);
		btnMULTI.setEnabled(true);
		btnMINUS.setEnabled(true);
		btnEQUALS.setEnabled(true);
		btnDOT.setEnabled(true);
		btnDIV.setEnabled(true);
		btnC.setEnabled(true);
		btn0.setEnabled(true);
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
	}
	
	
	public void off() {
		
		rdbtnON.setEnabled(true);
		rdbtnOFF.setEnabled(false);
		
		textField.setEnabled(false);
		textField.setText(null);
		
		btnERASE.setEnabled(false);
		btnPLUS.setEnabled(false);
		btnMULTI.setEnabled(false);
		btnMINUS.setEnabled(false);
		btnEQUALS.setEnabled(false);
		btnDOT.setEnabled(false);
		btnDIV.setEnabled(false);
		btnC.setEnabled(false);
		btn0.setEnabled(false);
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("CALCULATOR");
		frame.setBounds(125, 100, 287, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 34));
		textField.setBounds(10, 25, 251, 55);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		rdbtnON = new JRadioButton("ON");
		rdbtnON.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				on();
			}
		});
		buttonGroup.add(rdbtnON);
		rdbtnON.setForeground(Color.BLUE);
		rdbtnON.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnON.setBounds(7, 85, 57, 23);
		frame.getContentPane().add(rdbtnON);
		
		rdbtnOFF = new JRadioButton("OFF");
		rdbtnOFF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				off();
			}
		});
		buttonGroup.add(rdbtnOFF);
		rdbtnOFF.setForeground(Color.BLUE);
		rdbtnOFF.setFont(new Font("Tahoma", Font.BOLD, 12));
		rdbtnOFF.setBounds(7, 111, 57, 23);
		frame.getContentPane().add(rdbtnOFF);
		
		btnERASE = new JButton("<--");
		btnERASE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length = textField.getText().length();
				int number = textField.getText().length() -1;
				String store;
				
				if (length > 0) {
					StringBuilder erase = new StringBuilder(textField.getText());
					erase.deleteCharAt(number);
					store = erase.toString();
					textField.setText(store);
				}
				
				
			}
		});
		btnERASE.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnERASE.setBounds(70, 89, 57, 38);
		frame.getContentPane().add(btnERASE);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnC.setBounds(137, 89, 57, 38);
		frame.getContentPane().add(btnC);
		
		btnPLUS = new JButton("+");
		btnPLUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText(null);
				lblCaption.setText(num + "+");
				
				
				
			}
		});
		btnPLUS.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnPLUS.setBounds(204, 89, 57, 38);
		frame.getContentPane().add(btnPLUS);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		btn7.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn7.setBounds(14, 141, 50, 38);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		btn8.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn8.setBounds(80, 141, 50, 38);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		btn9.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn9.setBounds(147, 141, 50, 38);
		frame.getContentPane().add(btn9);
		
		btnMINUS = new JButton("-");
		btnMINUS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText(null);
				lblCaption.setText(num + "-");
				
			}
		});
		btnMINUS.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnMINUS.setBounds(211, 141, 50, 38);
		frame.getContentPane().add(btnMINUS);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		btn4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn4.setBounds(14, 188, 50, 38);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		btn5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn5.setBounds(80, 188, 50, 38);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		btn6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn6.setBounds(147, 188, 50, 38);
		frame.getContentPane().add(btn6);
		
		btnMULTI = new JButton("*");
		btnMULTI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText(null);
				lblCaption.setText(num + "*");
				
			}
		});
		btnMULTI.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnMULTI.setBounds(211, 188, 50, 38);
		frame.getContentPane().add(btnMULTI);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
				
			}
		});
		btn1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn1.setBounds(14, 233, 50, 38);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
				
			}
		});
		btn2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn2.setBounds(80, 233, 50, 38);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
				
			}
		});
		btn3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn3.setBounds(147, 233, 50, 38);
		frame.getContentPane().add(btn3);
		
		btnDIV = new JButton("/");
		btnDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText(null);
				lblCaption.setText(num + "/");
				
			}
		});
		btnDIV.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnDIV.setBounds(211, 233, 50, 38);
		frame.getContentPane().add(btnDIV);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		btn0.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btn0.setBounds(14, 282, 50, 38);
		frame.getContentPane().add(btn0);
		
		btnDOT = new JButton(".");
		btnDOT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		btnDOT.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnDOT.setBounds(80, 282, 50, 38);
		frame.getContentPane().add(btnDOT);
		
		btnEQUALS = new JButton("=");
		btnEQUALS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				arithmetic_operation();
				lblCaption.setText(null);
				
			}
		});
		btnEQUALS.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnEQUALS.setBounds(147, 282, 114, 38);
		frame.getContentPane().add(btnEQUALS);
		
		lblCaption = new JLabel("");
		lblCaption.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCaption.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCaption.setForeground(new Color(72, 61, 139));
		lblCaption.setBounds(191, 11, 70, 14);
		frame.getContentPane().add(lblCaption);
	}
}
