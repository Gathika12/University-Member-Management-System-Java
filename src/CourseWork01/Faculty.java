package CourseWork01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Faculty extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Faculty frame = new Faculty();
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
	public Faculty() {
		setTitle("Faculties");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new S_reg().setVisible(true);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kumarasingha\\Desktop\\EAD project Images\\engineering.png"));
		btnNewButton.setBounds(95, 120, 167, 133);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new S_reg().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\kumarasingha\\Desktop\\EAD project Images\\Business.png"));
		btnNewButton_1.setBounds(361, 120, 167, 133);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Engineering & Computing");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(85, 269, 192, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblBusinessManagement = new JLabel("Business Management");
		lblBusinessManagement.setForeground(Color.BLUE);
		lblBusinessManagement.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblBusinessManagement.setBounds(361, 269, 167, 21);
		contentPane.add(lblBusinessManagement);
		
		JLabel lblNewLabel_1 = new JLabel("FACULTIES");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_1.setBounds(228, 46, 135, 36);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1_1 = new JButton("HOME");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Home().setVisible(true);
			}
		});
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(503, 11, 80, 33);
		contentPane.add(btnNewButton_1_1);
	}

}
