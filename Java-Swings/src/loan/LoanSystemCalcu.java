package loan;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class LoanSystemCalcu {

	private JFrame frame;
	private JTextField textInterest;
	private JTextField textNoYears;
	private JTextField textLoan;
	private JTextField textMonthly;
	private JTextField texTotal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoanSystemCalcu window = new LoanSystemCalcu();
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
	public LoanSystemCalcu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 443);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		panel.setBounds(10, 11, 581, 43);
		frame.getContentPane().add(panel);
		
		JLabel lblTitle = new JLabel("Loan Management System Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lblTitle);
		
		JLabel lblInterestRate = new JLabel("Interest Rate");
		lblInterestRate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInterestRate.setBounds(21, 115, 107, 19);
		frame.getContentPane().add(lblInterestRate);
		
		JLabel lblYears = new JLabel("Number of Year(s)");
		lblYears.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYears.setBounds(21, 152, 132, 19);
		frame.getContentPane().add(lblYears);
		
		JLabel lblLoan = new JLabel("Amount of Loan");
		lblLoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLoan.setBounds(21, 188, 107, 19);
		frame.getContentPane().add(lblLoan);
		
		JLabel lblMonthly = new JLabel("Monthly Payment");
		lblMonthly.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMonthly.setBounds(21, 224, 132, 19);
		frame.getContentPane().add(lblMonthly);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(21, 266, 107, 19);
		frame.getContentPane().add(lblTotal);
		
		textInterest = new JTextField();
		textInterest.setHorizontalAlignment(SwingConstants.CENTER);
		textInterest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textInterest.setBounds(163, 109, 104, 31);
		frame.getContentPane().add(textInterest);
		textInterest.setColumns(10);
		
		textNoYears = new JTextField();
		textNoYears.setHorizontalAlignment(SwingConstants.CENTER);
		textNoYears.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNoYears.setColumns(10);
		textNoYears.setBounds(163, 146, 104, 31);
		frame.getContentPane().add(textNoYears);
		
		textLoan = new JTextField();
		textLoan.setHorizontalAlignment(SwingConstants.CENTER);
		textLoan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textLoan.setColumns(10);
		textLoan.setBounds(163, 182, 104, 31);
		frame.getContentPane().add(textLoan);
		
		textMonthly = new JTextField();
		textMonthly.setHorizontalAlignment(SwingConstants.CENTER);
		textMonthly.setBackground(Color.WHITE);
		textMonthly.setEditable(false);
		textMonthly.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textMonthly.setColumns(10);
		textMonthly.setBounds(163, 218, 104, 31);
		frame.getContentPane().add(textMonthly);
		
		texTotal = new JTextField();
		texTotal.setHorizontalAlignment(SwingConstants.CENTER);
		texTotal.setBackground(Color.WHITE);
		texTotal.setEditable(false);
		texTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		texTotal.setColumns(10);
		texTotal.setBounds(163, 260, 104, 31);
		frame.getContentPane().add(texTotal);
		
		JTextArea textAreaReceipt = new JTextArea();
		textAreaReceipt.setEditable(false);
		textAreaReceipt.setBounds(302, 109, 289, 229);
		frame.getContentPane().add(textAreaReceipt);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((textInterest.getText().length() == 0) || (textNoYears.getText().length() == 0) || (textLoan.getText().length() == 0)) {
					JOptionPane.showMessageDialog(null, "Incomplete info. Please check");
				
				} else {
					
					double interestrate = Double.parseDouble(textInterest.getText());
					double monthlyinterest = interestrate/1200;
					int numyears = Integer.parseInt(textNoYears.getText());
					double loan = Double.parseDouble(textLoan.getText());
					
					double monthlypayment = loan * monthlyinterest/(1-1/Math.pow(1 + monthlyinterest, numyears * 12));
					
					String iMonthlyPayment;
					iMonthlyPayment = Double.toString(monthlypayment);
					iMonthlyPayment = String.format("$%.2f", monthlypayment);
					textMonthly.setText(iMonthlyPayment);
					
					double totalpayment = monthlypayment * numyears * 12;
					String iTotalPayment;
					iTotalPayment = String.format("$%.2f", totalpayment);
					texTotal.setText(iTotalPayment);
					
					
				}
				
		
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalculate.setBounds(159, 312, 119, 31);
		frame.getContentPane().add(btnCalculate);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textInterest.setText(null);
				textNoYears.setText(null);
				textLoan.setText(null);
				textMonthly.setText(null);
				texTotal.setText(null);
				textAreaReceipt.setText(null);
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(159, 354, 119, 31);
		frame.getContentPane().add(btnReset);
		
		JButton btnGenerateReceipt = new JButton("Generate Receipt");
		btnGenerateReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if ((textInterest.getText().length() == 0) || (textNoYears.getText().length() == 0) || (textLoan.getText().length() == 0)) {
					JOptionPane.showMessageDialog(null, "Incomplete info. Please check");
				
				} else {
									
				String InterestRate = String.format(textInterest.getText());
				String NumberYears = String.format(textNoYears.getText());
				String AmountLoan = String.format(textLoan.getText());
				
				String MonthlyPayment = String.format(textMonthly.getText());
				String Total = String.format(texTotal.getText());
				
				//reference
				int reference = 1234 + (int) (Math.random() *4567);
				
				//calendar
				Calendar time = Calendar.getInstance();
				time.getTime();
				
				//time
				SimpleDateFormat ttime = new SimpleDateFormat("HH:mm:ss");
				ttime.format(time.getTime());
				
				//date
				SimpleDateFormat tdate = new SimpleDateFormat("dd-MMM-yyy");
				tdate.format(time.getTime());
				
				//receipt
				textAreaReceipt.append("\tLoan Management System \n\n" + 
				" Reference No: \t" + reference +
				"\n=========================================\t" +
				"\n Interest Rate\t\t" + InterestRate +
				"\n Repayment Years\t" + NumberYears +
				"\n Amount of Loan\t" +"$"  + AmountLoan +
				"\n Monthly Payment\t" + MonthlyPayment +
				"\n Total Payment\t\t" + Total +
				
				"\n=========================================\t" +
				"\n Date: " + tdate.format(time.getTime()) +
				"\tTime: " + ttime.format(time.getTime()) +
				"\n\n\tTHANK YOU!\n"
										
						);
				}
			}
		});
		btnGenerateReceipt.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnGenerateReceipt.setBounds(302, 69, 152, 29);
		frame.getContentPane().add(btnGenerateReceipt);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?", "Loan System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(505, 354, 86, 31);
		frame.getContentPane().add(btnExit);
	}
}
