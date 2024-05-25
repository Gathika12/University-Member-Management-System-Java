package CourseWork01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Component;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txt01;
	private JPasswordField txt02;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserID");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(131, 174, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(131, 242, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		txt01 = new JTextField();
		txt01.setBounds(213, 162, 196, 38);
		contentPane.add(txt01);
		txt01.setColumns(10);
		
		JButton login = new JButton("Login");
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txt01.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill out username");
				}
				else if(txt02.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null, "Please fill out password");
				}
				else if(txt01.getText().contains("123") && txt02.getText().contains("123"))
				{
					JOptionPane.showMessageDialog(null, "Login Successfull!!");
					setVisible(false);
					new Home().setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong username or password!!", "Message", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		login.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		login.setBounds(211, 303, 86, 27);
		contentPane.add(login);
		
		JButton cancle = new JButton("Cancle");
		cancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				
			}
		});
		cancle.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		cancle.setBounds(326, 303, 86, 27);
		contentPane.add(cancle);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/loginNew02.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(239, 11, 147, 122);
		contentPane.add(lblNewLabel_2);
		
		txt02 = new JPasswordField();
		txt02.setBounds(214, 233, 195, 38);
		contentPane.add(txt02);
	}
}
