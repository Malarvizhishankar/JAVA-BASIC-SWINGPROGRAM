package malar;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class malar {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					malar window = new malar();
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
	public malar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel s1 = new JLabel("Speed");
		s1.setBounds(72, 34, 136, 43);
		frame.getContentPane().add(s1);
		
		JLabel s2 = new JLabel("Time");
		s2.setBounds(72, 92, 46, 14);
		frame.getContentPane().add(s2);
		
		t1 = new JTextField();
		t1.setBounds(178, 45, 86, 20);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(178, 89, 86, 20);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel s3 = new JLabel("Distance");
		s3.setBounds(72, 136, 46, 14);
		frame.getContentPane().add(s3);
		
		t3 = new JTextField();
		t3.setBounds(178, 133, 86, 20);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton b1 = new JButton("Calculate");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double c=Double.parseDouble(t1.getText())*Double.parseDouble(t2.getText());
			
				t3.setText(c+"");
			}
		});
		b1.setBounds(113, 184, 89, 23);
		frame.getContentPane().add(b1);
	}
}
