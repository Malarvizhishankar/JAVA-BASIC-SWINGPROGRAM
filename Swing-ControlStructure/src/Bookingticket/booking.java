package Bookingticket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;

public class booking {

	private JFrame frame;
	private JTextField FROM;
	private JTextField TO;
 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					booking window = new booking();
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
	public booking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1094, 726);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(70, 22, 1035, 667);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel l1 = new JLabel("BOOK YOUR TRAIN TICKET ");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		l1.setBounds(349, 64, 342, 45);
		panel.add(l1);
		
		JLabel L2 = new JLabel("FROM");
		L2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		L2.setBounds(88, 174, 88, 13);
		panel.add(L2);
		
		FROM = new JTextField();
		FROM.setBounds(661, 172, 96, 19);
		panel.add(FROM);
		FROM.setColumns(10);
		
		JLabel L3 = new JLabel("TO");
		L3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		L3.setBounds(88, 255, 56, 13);
		panel.add(L3);
		
		TO = new JTextField();
		TO.setBounds(661, 253, 96, 19);
		panel.add(TO);
		TO.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("DATE");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(88, 357, 45, 13);
		panel.add(lblNewLabel);
		
		JDateChooser DC = new JDateChooser();
		DC.setBounds(661, 351, 96, 19);
		panel.add(DC);
		
		JLabel L4 = new JLabel("CLASS");
		L4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		L4.setBounds(88, 445, 69, 13);
		panel.add(L4);
		
		JLabel L5 = new JLabel("NO OF PASSENGERS");
		L5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		L5.setBounds(88, 547, 157, 13);
		panel.add(L5);
		
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		
		cb2.setBounds(661, 520, 108, 21);
		cb2.setSelectedItem(null);
		cb2.setEditable(true);
		panel.add(cb2);
		
		JComboBox cb1 = new JComboBox();
		cb1.setEditable(true);
		cb1.setModel(new DefaultComboBoxModel(new String[] {"sleeper", "semisleeper", "seater"}));
		cb1.setBounds(661, 445, 96, 21);
		panel.add(cb1);
		
		JButton n = new JButton("NEXT");
		n.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s=FROM.getText();
				String s1=TO.getText();
				String Class,nop;
				 Class=(String)cb1.getSelectedItem();
				 nop=(String)cb2.getSelectedItem();
				DateFormat date=new SimpleDateFormat("dd-mm-yyyy");
				String date1=date.format(DC.getDate());
				PassengerDetail p=new PassengerDetail();
				p.Passenger(s, s1,Class,nop,date1);
			     frame.dispose();
				p.NewScreen();
			}
		});
		n.setFont(new Font("Tahoma", Font.BOLD, 18));
		n.setBounds(424, 600, 85, 21);
		panel.add(n);
		
		
	}
}