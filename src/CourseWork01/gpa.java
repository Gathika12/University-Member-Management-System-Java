package CourseWork01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class gpa extends JFrame {

	private JPanel contentPane;
	
	private JTextField S01TF;
	private JTextField S02TF;
	private JTextField S03TF;
	private JTextField S04TF;
	private JTextField S05TF;
	private JTextField S06TF;
	private JTextField S07TF;
	private JTextField average;
	private JTextField gpaValue;
	private JButton btnClear;
	private JButton btnExit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gpa frame = new gpa();
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
	public gpa() {
		setTitle("GPA calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GPA Calculator");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setBounds(203, 11, 174, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Subject 01");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(34, 109, 93, 21);
		contentPane.add(lblNewLabel_1);
		
		S01TF = new JTextField();
		S01TF.setBounds(137, 111, 45, 20);
		contentPane.add(S01TF);
		S01TF.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject 02");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(34, 146, 93, 21);
		contentPane.add(lblNewLabel_1_1);
		
		S02TF = new JTextField();
		S02TF.setColumns(10);
		S02TF.setBounds(137, 148, 45, 20);
		contentPane.add(S02TF);
		
		JLabel lblNewLabel_1_2 = new JLabel("Subject 03");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(34, 181, 93, 21);
		contentPane.add(lblNewLabel_1_2);
		
		S03TF = new JTextField();
		S03TF.setColumns(10);
		S03TF.setBounds(137, 183, 45, 20);
		contentPane.add(S03TF);
		
		JLabel lblNewLabel_1_3 = new JLabel("Subject 04");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(34, 220, 93, 21);
		contentPane.add(lblNewLabel_1_3);
		
		S04TF = new JTextField();
		S04TF.setColumns(10);
		S04TF.setBounds(137, 222, 45, 20);
		contentPane.add(S04TF);
		
		JLabel lblNewLabel_1_4 = new JLabel("Subject 05");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_4.setBounds(34, 260, 93, 21);
		contentPane.add(lblNewLabel_1_4);
		
		S05TF = new JTextField();
		S05TF.setColumns(10);
		S05TF.setBounds(137, 262, 45, 20);
		contentPane.add(S05TF);
		
		JLabel lblNewLabel_1_5 = new JLabel("Subject 06");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_5.setBounds(33, 297, 93, 21);
		contentPane.add(lblNewLabel_1_5);
		
		S06TF = new JTextField();
		S06TF.setColumns(10);
		S06TF.setBounds(136, 299, 46, 20);
		contentPane.add(S06TF);
		
		JLabel lblNewLabel_1_6 = new JLabel("Subject 07");
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_6.setBounds(34, 333, 93, 21);
		contentPane.add(lblNewLabel_1_6);
		
		S07TF = new JTextField();
		S07TF.setColumns(10);
		S07TF.setBounds(137, 335, 45, 20);
		contentPane.add(S07TF);
		
		JLabel lblNewLabel_2 = new JLabel("Marks");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(136, 74, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Average");
		lblNewLabel_2_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_2.setBounds(289, 110, 63, 20);
		contentPane.add(lblNewLabel_2_2);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(275, 135, 79, 47);
		contentPane.add(average);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("GPA");
		lblNewLabel_2_2_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2_2_1.setBounds(297, 222, 42, 20);
		contentPane.add(lblNewLabel_2_2_1);
		
		gpaValue = new JTextField();
		gpaValue.setColumns(10);
		gpaValue.setBounds(277, 243, 79, 47);
		contentPane.add(gpaValue);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//calculate all the grades
				
				double avg;
				double gpa=0;
				
				int m1 = Integer.parseInt(S01TF.getText());
				int m2 = Integer.parseInt(S02TF.getText());
				int m3 = Integer.parseInt(S03TF.getText());
				int m4 = Integer.parseInt(S04TF.getText());
				int m5 = Integer.parseInt(S05TF.getText());
				int m6 = Integer.parseInt(S06TF.getText());
				int m7 = Integer.parseInt(S07TF.getText());
				
				int tot = m1 + m2 + m3 + m4 + m5 + m6 + m7;
				
				avg = tot/7;
				
				average.setText(String.valueOf(avg));
				
				if(avg>80)
				{
					gpaValue.setText("4.0");
				}
				else if(avg>70)
				{
					gpaValue.setText("3.5");
				}
				else if(avg>60)
				{
					gpaValue.setText("3.0");
				}
				else if(avg>50)
				{
					gpaValue.setText("2.5");
				}
				else if(avg>40)
				{
					gpaValue.setText("2.0");
				}
				else if(avg>30)
				{
					gpaValue.setText("Not enough to calculate");
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(429, 145, 114, 37);
		contentPane.add(btnNewButton);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//clear action
				
				S01TF.setText("");
				S02TF.setText("");
				S03TF.setText("");
				S04TF.setText("");
				S05TF.setText("");
				S06TF.setText("");
				S07TF.setText("");
				average.setText("");
				gpaValue.setText("");
				S01TF.requestFocus();
				
			}
		});
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnClear.setBounds(429, 219, 114, 23);
		contentPane.add(btnClear);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//exit action
			
				setVisible(false);
				new Home().setVisible(true);
			
			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(429, 261, 114, 23);
		contentPane.add(btnExit);
	}
}
