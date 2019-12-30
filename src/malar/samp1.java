package malar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class samp1 {

	private JFrame frame;
	private JTextField textbox1;
	private JTextField textbox2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					samp1 window = new samp1();
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
	public samp1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lable1 = new JLabel("UserName");
		lable1.setBackground(Color.YELLOW);
		lable1.setBounds(78, 34, 81, 37);
		frame.getContentPane().add(lable1);
		
		JLabel label2 = new JLabel("Password");
		label2.setBounds(78, 83, 81, 37);
		frame.getContentPane().add(label2);
		
		textbox1 = new JTextField();
		textbox1.setBounds(228, 42, 86, 20);
		frame.getContentPane().add(textbox1);
		textbox1.setColumns(10);
		
		textbox2 = new JTextField();
		textbox2.setBounds(228, 91, 86, 20);
		frame.getContentPane().add(textbox2);
		textbox2.setColumns(10);
		
		JButton button1 = new JButton("Submit");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String uname=textbox1.getText();
			String pwd=textbox2.getText();
			if(uname.equals("malar")&&pwd.equals("vizhi"))
			{
				JOptionPane.showMessageDialog(frame, "Login Success");
				
			}
			else
			{
				JOptionPane.showMessageDialog(frame, "Login Failed");
			}
			}
		});
		button1.setBounds(144, 159, 89, 48);
		frame.getContentPane().add(button1);
	}
}
