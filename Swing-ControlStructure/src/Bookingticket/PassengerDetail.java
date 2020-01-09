package Bookingticket;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class PassengerDetail extends JFrame {
	private String sa,sb,fr,t,d;
private String age,athar;
	private JFrame frame;
	private JTextField T1;
	private JTextField T2;
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	private String date;
	private String gender;
	
	private float totamt[];
	private JTextArea textArea;
	  private String amount;
	  private JButton P1;
	  
	/**
	 * Launch the application.
	 */
	  public void Passenger(String s1,String s2,String s3,String s4,String date1) throws HeadlessException {
			//super();
			this.sa=s1;      //seat class
			this.sb=s2;
			this.fr=s3;                                             
			this.t=s4;
			this.d=date1;
			      
		}
	 
 void detail()throws NumberFormatException
	{
		
		T1.getText();
		
		 athar=T2.getText();
		
}	
	
	
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerDetail window = new PassengerDetail();
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
	public PassengerDetail() {
	
		frame = new JFrame();
		frame.setBounds(100, 100, 819, 759);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		T1 = new JTextField();
		T1.setBounds(557, 128, 96, 19);
		frame.getContentPane().add(T1);
		T1.setColumns(10);
		
		T2 = new JTextField();
		T2.setBounds(557, 220, 96, 19);
		frame.getContentPane().add(T2);
		T2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("PASSENGER DETAILS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(256, 10, 293, 67);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_1.setBounds(65, 130, 81, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ADHAR NO");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_2.setBounds(50, 222, 111, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DOB");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_3.setBounds(65, 306, 60, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("GENDER");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel_4.setBounds(65, 384, 96, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		JRadioButton M = new JRadioButton("MALE");
		buttonGroup.add(M);
		M.setFont(new Font("Times New Roman", Font.BOLD, 16));
		M.setBounds(446, 380, 103, 21);
		frame.getContentPane().add(M);
		
		JRadioButton F = new JRadioButton("FEMALE");
		buttonGroup.add(F);
		F.setFont(new Font("Times New Roman", Font.BOLD, 16));
		F.setBounds(592, 380, 103, 21);
		frame.getContentPane().add(F);
		
		JDateChooser DC = new JDateChooser();
		DC.setBounds(557, 279, 95, 19);
		frame.getContentPane().add(DC);
		
		JButton P = new JButton("ADD PASSENGER");
		P.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				detail();
				T1.setText("");
				T2.setText("");
				DC.setCalendar(null);
				M.setSelected(false);
				F.setSelected(false);
				T1.setFocusable(true);
			
			
			}
		});
		P.setFont(new Font("Tahoma", Font.BOLD, 16));
	P.setBounds(37, 443, 219, 21);
		frame.getContentPane().add(P);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 518, 766, 194);
		frame.getContentPane().add(textArea);
		
		JButton P1 = new JButton("PRINT BILL");
		P1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("\t----------------------------------------------------------------------------------------------------------------------------------\n"
						+ "\t\t  "+"BOOKING DETAILS"+"\t"+"\n\n"+"NAME"+"\t"+"AGE WITH GENDER"+"\t"+"CLASS"+"\t"+"COST OF TICKET INCLUDING TAX"+
				       "\n\n------------------------------------------------------------------------------------------------------------------------------------------\n\n");
                amount="360.00";
               DateFormat date1=new SimpleDateFormat("dd-mm-yyyy");
       		date=date1.format(DC.getDate());
       	if(M.isSelected())
       		{
       			gender="MALE";
       		}
       		else
       		{
       			gender="FEMALE";
       		}
				
					textArea.setText(textArea.getText()+"\n\n"+T1.getText()+"\t     "+age+" "+gender+"\t\t\t\t"+amount);
					
					
					
				}				
});
		
		P1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		P1.setBounds(50, 474, 198, 21);
		frame.getContentPane().add(P1);
		
	}
	
		
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
}