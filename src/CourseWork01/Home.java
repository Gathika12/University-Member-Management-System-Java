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

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setTitle("Home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				setVisible(false);
				new Faculty().setVisible(true);
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\kumarasingha\\Desktop\\EAD project Images\\studentIcon.png"));
		btnNewButton.setBounds(10, 56, 168, 137);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Student Registration");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(11, 200, 168, 21);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Staff().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\kumarasingha\\Desktop\\EAD project Images\\staffIcon.png"));
		btnNewButton_1.setBounds(211, 56, 168, 137);
		contentPane.add(btnNewButton_1);
		
		JLabel lblStaffRegistration = new JLabel("Staff Registration");
		lblStaffRegistration.setForeground(Color.BLUE);
		lblStaffRegistration.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblStaffRegistration.setBounds(221, 200, 137, 21);
		contentPane.add(lblStaffRegistration);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new course_info().setVisible(true);
			}
		});
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\kumarasingha\\Desktop\\EAD project Images\\CoursesIcon.png"));
		btnNewButton_1_1.setBounds(415, 56, 168, 137);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblUpdateCourses = new JLabel("Update Courses");
		lblUpdateCourses.setForeground(Color.BLUE);
		lblUpdateCourses.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblUpdateCourses.setBounds(440, 200, 123, 21);
		contentPane.add(lblUpdateCourses);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new gpa().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\kumarasingha\\Desktop\\EAD project Images\\marksIcon.png"));
		btnNewButton_2.setBounds(353, 248, 168, 137);
		contentPane.add(btnNewButton_2);
		
		JLabel lblCalculateGpa = new JLabel("Calculate GPA");
		lblCalculateGpa.setForeground(Color.BLUE);
		lblCalculateGpa.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblCalculateGpa.setBounds(377, 396, 123, 21);
		contentPane.add(lblCalculateGpa);
		
		JLabel lblNewLabel_1 = new JLabel("University Members Registration System");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setBounds(74, 11, 442, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Billing().setVisible(true);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\kumarasingha\\Desktop\\EAD project Images\\Payment-card-icon.png"));
		btnNewButton_3.setBounds(105, 248, 168, 137);
		contentPane.add(btnNewButton_3);
		
		JLabel lblBillingPayments = new JLabel("Billing & Payments");
		lblBillingPayments.setForeground(Color.BLUE);
		lblBillingPayments.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBillingPayments.setBounds(115, 396, 156, 21);
		contentPane.add(lblBillingPayments);
		
		JButton btnNewButton_4 = new JButton("Sign out");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Login().setVisible(true);
				
			}
		});
		btnNewButton_4.setForeground(Color.RED);
		btnNewButton_4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton_4.setBounds(269, 463, 89, 23);
		contentPane.add(btnNewButton_4);
	}

}
