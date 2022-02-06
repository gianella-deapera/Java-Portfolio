package traveltickets;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.ButtonGroup;

public class travelticketsystem {

	private JFrame frame;
	private JTextField textTax;
	private JTextField textSubtotal;
	private JTextField textTotal;
	private JTextField textClass;
	private JTextField textTicket;
	private JTextField textAdult;
	private JTextField textChild;
	private JTextField textFrom;
	private JTextField textTo;
	private JTextField textDate;
	private JTextField textTime;
	private JTextField textTicNum;
	private JTextField textPrice;
	private JTextField textRoute;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					travelticketsystem window = new travelticketsystem();
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
	public travelticketsystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 872, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 11, 836, 47);
		frame.getContentPane().add(panel);
		
		JLabel lbltitle = new JLabel("Travelling Ticketing System - London");
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		panel.add(lbltitle);
		
		JLabel lblTicketype = new JLabel("TICKET TYPE");
		lblTicketype.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTicketype.setBounds(127, 69, 109, 24);
		frame.getContentPane().add(lblTicketype);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		buttonGroup.add(rdbtnStandard);
		rdbtnStandard.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnStandard.setBounds(10, 99, 109, 23);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		buttonGroup.add(rdbtnEconomy);
		rdbtnEconomy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnEconomy.setBounds(10, 137, 109, 23);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnFirstClass = new JRadioButton("First Class");
		buttonGroup.add(rdbtnFirstClass);
		rdbtnFirstClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnFirstClass.setBounds(10, 171, 109, 23);
		frame.getContentPane().add(rdbtnFirstClass);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		buttonGroup_1.add(rdbtnSingleTicket);
		rdbtnSingleTicket.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnSingleTicket.setBounds(127, 100, 109, 23);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		buttonGroup_1.add(rdbtnReturnTicket);
		rdbtnReturnTicket.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnReturnTicket.setBounds(127, 137, 119, 23);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		buttonGroup_2.add(rdbtnAdult);
		rdbtnAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnAdult.setBounds(266, 100, 100, 23);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		buttonGroup_2.add(rdbtnChild);
		rdbtnChild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		rdbtnChild.setBounds(266, 137, 100, 23);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox comboBoxDesti = new JComboBox();
		comboBoxDesti.setModel(new DefaultComboBoxModel(new String[] {"Choose Destination", "Canada", "New York", "Japan", "Korea"}));
		comboBoxDesti.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxDesti.setBounds(127, 171, 208, 23);
		frame.getContentPane().add(comboBoxDesti);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.GRAY);
		separator.setBounds(10, 91, 341, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTax.setBounds(10, 229, 46, 14);
		frame.getContentPane().add(lblTax);
		
		JLabel lblSubtotal = new JLabel("Subtotal");
		lblSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblSubtotal.setBounds(10, 263, 68, 14);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(10, 296, 46, 14);
		frame.getContentPane().add(lblTotal);
		
		textTax = new JTextField();
		textTax.setBackground(Color.WHITE);
		textTax.setEditable(false);
		textTax.setHorizontalAlignment(SwingConstants.CENTER);
		textTax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTax.setBounds(88, 226, 148, 20);
		frame.getContentPane().add(textTax);
		textTax.setColumns(10);
		
		textSubtotal = new JTextField();
		textSubtotal.setBackground(Color.WHITE);
		textSubtotal.setEditable(false);
		textSubtotal.setHorizontalAlignment(SwingConstants.CENTER);
		textSubtotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textSubtotal.setColumns(10);
		textSubtotal.setBounds(88, 260, 148, 20);
		frame.getContentPane().add(textSubtotal);
		
		textTotal = new JTextField();
		textTotal.setBackground(Color.WHITE);
		textTotal.setEditable(false);
		textTotal.setHorizontalAlignment(SwingConstants.CENTER);
		textTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTotal.setColumns(10);
		textTotal.setBounds(88, 293, 148, 20);
		frame.getContentPane().add(textTotal);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.GRAY);
		separator_1.setBounds(10, 205, 341, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.GRAY);
		separator_2.setBounds(10, 338, 341, 2);
		frame.getContentPane().add(separator_2);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double tax = 19.50;
				double km8 = 25.98;
				double km12 = 25.25;
				double km20 = 45.66;
				double km30 = 65.36;
				double totalcost, economy = 3.95, firstclass = 5.60;
				
				//-----------all standard
				//korea
				
				if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * km8)/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km8 + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Korea");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km8 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Korea");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * km8)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km8 + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Korea");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * km8)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km8 + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Korea");
				
					
					//japan
				}else if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * km12)/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km12 + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Japan");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km12 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Japan");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * km12)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km12 + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Japan");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * km12)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km12 + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Japan");
				
					
					//new york
				}else if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * km20)/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km20 + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-New York");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km20 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-New York");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * km20)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km20 + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-New York");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * km20)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km20 + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-New York");
				
					
					//canada
				} else if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * km30)/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km30 + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Canada");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km30 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Canada");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * km30)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km30 + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Canada");
					
				} else if (rdbtnStandard.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * km30)/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km30 + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Standard");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Canada");
				
					//-----------economy
					//korea
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 + economy))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km8 + economy + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Korea");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 * economy * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km8 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Korea");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 + economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km8 + economy + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Korea");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 * economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 * economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km8 * economy + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Korea");
				
					
					//Japan
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 + economy))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km12 + economy + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Japan");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 * economy * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km12 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Japan");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 + economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km12 + economy + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Japan");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 * economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 * economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km12 * economy + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Japan");
				
					
					//New York
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 + economy))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km20 + economy + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-New York");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 * economy * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km20 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-New York");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 + economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km20 + economy + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-New York");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 * economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 * economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km20 * economy + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-New York");
				
					
					//Canada
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 + economy))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km30 + economy + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Canada");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 * economy * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km30 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Canada");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 + economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 + economy);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km30 + economy + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Canada");
					
				} else if (rdbtnEconomy.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 * economy))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 * economy * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km30 * economy + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("Economy");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Canada");
				
					
					//firstclass-----------
					//korea
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km8 + firstclass + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Korea");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 * firstclass * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km8 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Korea");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km8 + firstclass + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Korea");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Korea")))) {
					
					totalcost = (tax * (km8 * firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km8 * firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km8 * firstclass + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Korea");
				
					
					//Japan
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km12 + firstclass + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Japan");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 * firstclass * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km12 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Japan");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km12 + firstclass + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Japan");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Japan")))) {
					
					totalcost = (tax * (km12 * firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km12 * firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km12 * firstclass + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Japan");
				
					
					//New York
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km20 + firstclass + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-New York");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 * firstclass * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km20 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-New York");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km20 + firstclass + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-New York");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("New York")))) {
					
					totalcost = (tax * (km20 * firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km20 * firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km20 * firstclass + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-New York");
				
					
					//Canada
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km30 + firstclass + totalcost);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Canada");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnAdult.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 * firstclass * 2))/100;
					String sTax = String.format("$%.2f", totalcost);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f",firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km30 + totalcost) * 2);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText("Yes");
					textChild.setText(null);
					textRoute.setText("London-Canada");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnSingleTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 + firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 + firstclass);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", km30 + firstclass + totalcost -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("One Way");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Canada");
					
				} else if (rdbtnFirstClass.isSelected() && (rdbtnReturnTicket.isSelected() && (rdbtnChild.isSelected() 
						&& comboBoxDesti.getSelectedItem().equals("Canada")))) {
					
					totalcost = (tax * (km30 * firstclass))/100;
					String sTax = String.format("$%.2f", totalcost - 15);
					textTax.setText(sTax);
					
					String subTotal = String.format("$%.2f", km30 * firstclass * 2);
					textSubtotal.setText(subTotal);
					
					String Total = String.format("$%.2f", (km30 * firstclass + totalcost * 2) -15);
					textTotal.setText(Total);
					textPrice.setText(Total);
					
					textClass.setText("First Class");
					textTicket.setText("Return");
					textAdult.setText(null);
					textChild.setText("Yes");
					textRoute.setText("London-Canada");
				
					
					//destination
				} else {
					comboBoxDesti.getSelectedItem().equals("Choose Destination");
					
					buttonGroup.equals(false);
					buttonGroup_1.equals(false);
					buttonGroup_2.equals(false);
										
					textTax.setText(null);
					textTotal.setText(null);
					textSubtotal.setText(null);
					
					textFrom.setText(null);
					textTo.setText(null);
					textDate.setText(null);
					textTime.setText(null);
					
					textTicNum.setText(null);
					textPrice.setText(null);
					textRoute.setText(null);
					
					textClass.setText(null);
					textTicket.setText(null);
					textAdult.setText(null);
					textChild.setText(null);
					
					JOptionPane.showMessageDialog(null, "Incomplete info. Please check.");
				}
							
			}
		});
		
		
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//for time
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat ttime = new SimpleDateFormat("HH:mm");
				textTime.setText(ttime.format(timer.getTime()));
				
				//date
				SimpleDateFormat tdate = new SimpleDateFormat("dd-MMM-yyyy");
				textDate.setText(tdate.format(timer.getTime()));
				textFrom.setText("London");
				textTo.setText((String) comboBoxDesti.getSelectedItem() + " *");
				
				//random num generator
				int num;
				String q = "";
				num = 1234 + (int)(Math.random()*4235);
				q += num + 1234;
				textTicNum.setText(q);
				
				//textRoute.setText("Anywhere");
				
				
			}
		});
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnTotal.setBounds(91, 359, 89, 23);
		frame.getContentPane().add(btnTotal);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBoxDesti.setSelectedItem("Destination");
				
				buttonGroup.clearSelection();
				buttonGroup_1.clearSelection();
				buttonGroup_2.clearSelection();
								
				
				textTax.setText(null);
				textTotal.setText(null);
				textSubtotal.setText(null);
				
				textFrom.setText(null);
				textTo.setText(null);
				textDate.setText(null);
				textTime.setText(null);
				
				textTicNum.setText(null);
				textPrice.setText(null);
				textRoute.setText(null);
				
				textClass.setText(null);
				textTicket.setText(null);
				textAdult.setText(null);
				textChild.setText(null);
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(234, 359, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frame = new JFrame("EXIT");
				if (JOptionPane.showConfirmDialog(frame, "Confirm Exit?", "Ticketing System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(755, 359, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.DARK_GRAY);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(374, 69, 21, 313);
		frame.getContentPane().add(separator_3);
		
		JLabel lblClass = new JLabel("CLASS");
		lblClass.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClass.setBounds(414, 69, 80, 24);
		frame.getContentPane().add(lblClass);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.GRAY);
		separator_4.setBounds(392, 91, 450, 2);
		frame.getContentPane().add(separator_4);
		
		textClass = new JTextField();
		textClass.setBackground(Color.WHITE);
		textClass.setEditable(false);
		textClass.setHorizontalAlignment(SwingConstants.CENTER);
		textClass.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textClass.setBounds(392, 102, 86, 24);
		frame.getContentPane().add(textClass);
		textClass.setColumns(10);
		
		JLabel lblTicket = new JLabel("TICKET");
		lblTicket.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTicket.setBounds(532, 69, 80, 24);
		frame.getContentPane().add(lblTicket);
		
		textTicket = new JTextField();
		textTicket.setBackground(Color.WHITE);
		textTicket.setEditable(false);
		textTicket.setHorizontalAlignment(SwingConstants.CENTER);
		textTicket.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTicket.setColumns(10);
		textTicket.setBounds(513, 102, 86, 24);
		frame.getContentPane().add(textTicket);
		
		JLabel lblAdult = new JLabel("ADULT");
		lblAdult.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAdult.setBounds(648, 69, 80, 24);
		frame.getContentPane().add(lblAdult);
		
		textAdult = new JTextField();
		textAdult.setBackground(Color.WHITE);
		textAdult.setEditable(false);
		textAdult.setHorizontalAlignment(SwingConstants.CENTER);
		textAdult.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAdult.setColumns(10);
		textAdult.setBounds(628, 102, 86, 24);
		frame.getContentPane().add(textAdult);
		
		JLabel lblChild = new JLabel("CHILD");
		lblChild.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblChild.setBounds(755, 69, 80, 24);
		frame.getContentPane().add(lblChild);
		
		textChild = new JTextField();
		textChild.setBackground(Color.WHITE);
		textChild.setEditable(false);
		textChild.setHorizontalAlignment(SwingConstants.CENTER);
		textChild.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textChild.setColumns(10);
		textChild.setBounds(737, 102, 86, 24);
		frame.getContentPane().add(textChild);
		
		JSeparator separator_4_1 = new JSeparator();
		separator_4_1.setForeground(Color.GRAY);
		separator_4_1.setBounds(392, 133, 450, 2);
		frame.getContentPane().add(separator_4_1);
		
		JLabel lblFrom = new JLabel("From");
		lblFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFrom.setBounds(386, 159, 46, 14);
		frame.getContentPane().add(lblFrom);
		
		textFrom = new JTextField();
		textFrom.setBackground(Color.WHITE);
		textFrom.setEditable(false);
		textFrom.setHorizontalAlignment(SwingConstants.CENTER);
		textFrom.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFrom.setColumns(10);
		textFrom.setBounds(464, 156, 148, 20);
		frame.getContentPane().add(textFrom);
		
		textTo = new JTextField();
		textTo.setBackground(Color.WHITE);
		textTo.setEditable(false);
		textTo.setHorizontalAlignment(SwingConstants.CENTER);
		textTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTo.setColumns(10);
		textTo.setBounds(464, 190, 148, 22);
		frame.getContentPane().add(textTo);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTo.setBounds(386, 193, 68, 14);
		frame.getContentPane().add(lblTo);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDate.setBounds(386, 226, 46, 14);
		frame.getContentPane().add(lblDate);
		
		textDate = new JTextField();
		textDate.setBackground(Color.WHITE);
		textDate.setEditable(false);
		textDate.setHorizontalAlignment(SwingConstants.CENTER);
		textDate.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDate.setColumns(10);
		textDate.setBounds(464, 223, 148, 20);
		frame.getContentPane().add(textDate);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTime.setBounds(386, 260, 46, 14);
		frame.getContentPane().add(lblTime);
		
		textTime = new JTextField();
		textTime.setBackground(Color.WHITE);
		textTime.setEditable(false);
		textTime.setHorizontalAlignment(SwingConstants.CENTER);
		textTime.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTime.setColumns(10);
		textTime.setBounds(464, 257, 148, 20);
		frame.getContentPane().add(textTime);
		
		JSeparator separator_3_1 = new JSeparator();
		separator_3_1.setOrientation(SwingConstants.VERTICAL);
		separator_3_1.setForeground(Color.DARK_GRAY);
		separator_3_1.setBounds(622, 138, 11, 250);
		frame.getContentPane().add(separator_3_1);
		
		JLabel lblTicNo = new JLabel("Ticket Number");
		lblTicNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTicNo.setBounds(638, 154, 119, 14);
		frame.getContentPane().add(lblTicNo);
		
		textTicNum = new JTextField();
		textTicNum.setBackground(Color.WHITE);
		textTicNum.setEditable(false);
		textTicNum.setHorizontalAlignment(SwingConstants.CENTER);
		textTicNum.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTicNum.setColumns(10);
		textTicNum.setBounds(653, 185, 148, 20);
		frame.getContentPane().add(textTicNum);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(638, 216, 46, 14);
		frame.getContentPane().add(lblPrice);
		
		textPrice = new JTextField();
		textPrice.setBackground(Color.WHITE);
		textPrice.setEditable(false);
		textPrice.setHorizontalAlignment(SwingConstants.CENTER);
		textPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textPrice.setColumns(10);
		textPrice.setBounds(653, 247, 148, 20);
		frame.getContentPane().add(textPrice);
		
		JLabel lblRoute = new JLabel("Route");
		lblRoute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRoute.setBounds(638, 278, 46, 14);
		frame.getContentPane().add(lblRoute);
		
		textRoute = new JTextField();
		textRoute.setBackground(Color.WHITE);
		textRoute.setEditable(false);
		textRoute.setHorizontalAlignment(SwingConstants.CENTER);
		textRoute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textRoute.setColumns(10);
		textRoute.setBounds(653, 309, 148, 24);
		frame.getContentPane().add(textRoute);
	}
}
