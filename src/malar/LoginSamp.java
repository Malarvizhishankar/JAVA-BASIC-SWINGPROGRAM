package malar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSamp {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSamp window = new LoginSamp();
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
	public LoginSamp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 492, 413);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APPLICATION FORM");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblNewLabel.setBounds(110, 11, 210, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(42, 59, 63, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(42, 101, 63, 25);
		frame.getContentPane().add(lblNewLabel_2);
		
		t1 = new JTextField();
		t1.setBounds(160, 64, 123, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(160, 99, 123, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Date Of Birth:");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(41, 142, 86, 24);
		frame.getContentPane().add(lblNewLabel_3);
		
		t3 = new JTextField();
		t3.setBounds(160, 144, 123, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile Number:");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_4.setBounds(42, 181, 96, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		t4 = new JTextField();
		t4.setBounds(160, 184, 123, 20);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Gender:");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_5.setBounds(42, 219, 63, 31);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton rb1 = new JRadioButton("Male");
		buttonGroup.add(rb1);
		rb1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rb1.setBounds(160, 223, 63, 23);
		frame.getContentPane().add(rb1);
		
		JRadioButton rb2 = new JRadioButton("Female");
		buttonGroup.add(rb2);
		rb2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		rb2.setBounds(241, 223, 109, 23);
		frame.getContentPane().add(rb2);
		
		JLabel lblNewLabel_6 = new JLabel("Email Id:");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_6.setBounds(42, 257, 63, 25);
		frame.getContentPane().add(lblNewLabel_6);
		
		t5 = new JTextField();
		t5.setBounds(160, 259, 123, 20);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		JTextArea ta1 = new JTextArea();
		ta1.setBounds(42, 295, 335, 68);
		frame.getContentPane().add(ta1);
		
		JButton b1 = new JButton("Submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String Gender;
				if(rb1.isSelected())
				{
					Gender="Male";
				}
				else
				{
					Gender="Female";
				}
				ta1.setText("First Name\t"+t1.getText()+"Last Name\t"+t2.getText()+"DateOfBirth\t"+t3.getText()+"Mobile Number\t"+t4.getText()+"Gender\t"+Gender+"EmailId\t"+t5.getText());
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		b1.setBounds(377, 164, 89, 50);
		frame.getContentPane().add(b1);
	}
}
