package CourseWork01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class lecturer_reg extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField txt01;
	private JTextField txt02;
	private JTextField txt03;
	private JTextField txt04;
	private JTextField txt05;
	private JTextField txt07;
	private JTextField txt08;
	private JTable table;
	private JTextField txt06;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lecturer_reg frame = new lecturer_reg();
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
	public lecturer_reg() {
		setTitle("Lecturer Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1207, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(592, 10, 1, 1);
		panel_1.setLayout(null);
		panel_1.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Student Details");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBackground(Color.BLACK);
		lblNewLabel_2.setBounds(92, 11, 118, 26);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Student ID");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(28, 75, 62, 14);
		panel_1.add(lblNewLabel_1_2);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(113, 73, 168, 20);
		panel_1.add(textField_7);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("First Name");
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(28, 114, 75, 14);
		panel_1.add(lblNewLabel_1_1_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(113, 112, 168, 20);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Last Name");
		lblNewLabel_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2.setBounds(28, 153, 75, 14);
		panel_1.add(lblNewLabel_1_1_1_2);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(113, 151, 168, 20);
		panel_1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(113, 186, 168, 20);
		panel_1.add(textField_10);
		
		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Date of Birth");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_2.setBounds(28, 188, 75, 14);
		panel_1.add(lblNewLabel_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_1_1_4 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_4.setBounds(28, 228, 75, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_4);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(113, 226, 168, 20);
		panel_1.add(textField_11);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Course");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_2.setBounds(28, 267, 75, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(113, 264, 168, 22);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(28, 305, 75, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setBounds(113, 302, 62, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnFemale_1 = new JRadioButton("Female");
		rdbtnFemale_1.setBounds(194, 302, 87, 23);
		panel_1.add(rdbtnFemale_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2_1 = new JLabel("NIC number");
		lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_2_1.setBounds(28, 341, 75, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_2_1);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(113, 339, 168, 20);
		panel_1.add(textField_12);
		
		JLabel lblNewLabel_1_1_1_1_1_3_1 = new JLabel("Mobile Number");
		lblNewLabel_1_1_1_1_1_3_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_3_1.setBounds(28, 379, 100, 14);
		panel_1.add(lblNewLabel_1_1_1_1_1_3_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(133, 377, 148, 20);
		panel_1.add(textField_13);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBackground(Color.GREEN);
		btnNewButton_1.setBounds(92, 442, 118, 35);
		panel_1.add(btnNewButton_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(598, 10, 1, 1);
		panel.setLayout(null);
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(92, 11, 118, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(28, 75, 62, 14);
		panel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 73, 168, 20);
		panel.add(textField);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(28, 114, 75, 14);
		panel.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(113, 112, 168, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(28, 153, 75, 14);
		panel.add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(113, 151, 168, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(113, 186, 168, 20);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Date of Birth");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(28, 188, 75, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(28, 228, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(113, 226, 168, 20);
		panel.add(textField_4);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Course");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(28, 267, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(113, 264, 168, 22);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(28, 305, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(113, 302, 62, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(194, 302, 87, 23);
		panel.add(rdbtnFemale);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("NIC number");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_2.setBounds(28, 341, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(113, 339, 168, 20);
		panel.add(textField_5);
		
		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("Mobile Number");
		lblNewLabel_1_1_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_3.setBounds(28, 379, 100, 14);
		panel.add(lblNewLabel_1_1_1_1_1_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(133, 377, 148, 20);
		panel.add(textField_6);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(92, 442, 118, 35);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(10, 84, 302, 522);
		contentPane.add(panel_2);
		
		JLabel lblLecturerDetails = new JLabel("Lecturer Details");
		lblLecturerDetails.setForeground(Color.RED);
		lblLecturerDetails.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblLecturerDetails.setBackground(Color.BLACK);
		lblLecturerDetails.setBounds(92, 11, 132, 26);
		panel_2.add(lblLecturerDetails);
		
		JLabel lblNewLabel_1_3 = new JLabel("Lecturer ID");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(28, 75, 75, 14);
		panel_2.add(lblNewLabel_1_3);
		
		txt01 = new JTextField();
		txt01.setColumns(10);
		txt01.setBounds(113, 73, 168, 20);
		panel_2.add(txt01);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("First Name");
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_3.setBounds(28, 114, 75, 14);
		panel_2.add(lblNewLabel_1_1_3);
		
		txt02 = new JTextField();
		txt02.setColumns(10);
		txt02.setBounds(113, 112, 168, 20);
		panel_2.add(txt02);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Last Name");
		lblNewLabel_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_3.setBounds(28, 153, 75, 14);
		panel_2.add(lblNewLabel_1_1_1_3);
		
		txt03 = new JTextField();
		txt03.setColumns(10);
		txt03.setBounds(113, 151, 168, 20);
		panel_2.add(txt03);
		
		txt04 = new JTextField();
		txt04.setColumns(10);
		txt04.setBounds(113, 186, 168, 20);
		panel_2.add(txt04);
		
		JLabel lblNewLabel_1_1_1_1_3 = new JLabel("NIC");
		lblNewLabel_1_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_3.setBounds(28, 188, 75, 14);
		panel_2.add(lblNewLabel_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_5 = new JLabel("Address");
		lblNewLabel_1_1_1_1_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_5.setBounds(28, 228, 75, 14);
		panel_2.add(lblNewLabel_1_1_1_1_1_5);
		
		txt05 = new JTextField();
		txt05.setColumns(10);
		txt05.setBounds(113, 226, 168, 20);
		panel_2.add(txt05);
		
		JLabel lblNewLabel_1_1_1_1_1_1_3 = new JLabel("Subject");
		lblNewLabel_1_1_1_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_3.setBounds(28, 267, 75, 14);
		panel_2.add(lblNewLabel_1_1_1_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_1_1_2_2 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_2_2.setBounds(28, 305, 75, 14);
		panel_2.add(lblNewLabel_1_1_1_1_1_2_2);
		
		txt07 = new JTextField();
		txt07.setColumns(10);
		txt07.setBounds(113, 303, 168, 20);
		panel_2.add(txt07);
		
		JLabel lblNewLabel_1_1_1_1_1_3_2 = new JLabel("Mobile Number");
		lblNewLabel_1_1_1_1_1_3_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_3_2.setBounds(28, 343, 100, 14);
		panel_2.add(lblNewLabel_1_1_1_1_1_3_2);
		
		txt08 = new JTextField();
		txt08.setColumns(10);
		txt08.setBounds(133, 341, 148, 20);
		panel_2.add(txt08);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					String  lecid,fname,lname,nic,address,subject,email,mob;
					
					
					lecid = txt01.getText();
					fname = txt02.getText();
					lname = txt03.getText();
					nic = txt04.getText();
					address = txt05.getText();
					subject = txt06.getText();
					email = txt07.getText();
					mob = txt08.getText();
					
					
					// Database connection parameters
			        String jdbcUrl = "jdbc:mysql://localhost:4306/lec_reg";
			        String dbUsername = "root";
			        String dbPassword = "";
					
			        	Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	                    PreparedStatement preparedStatement = connection.prepareStatement("Insert into lecturer(lecid,fname,lname,nic,address,subject,email,mob)values(?,?,?,?,?,?,?,?)");
	                    preparedStatement.setString(1, lecid);
	                    preparedStatement.setString(2, fname);
	                    preparedStatement.setString(3, lname);
	                    preparedStatement.setString(4, nic);
	                    preparedStatement.setString(5, address);
	                    preparedStatement.setString(6, subject);
	                    preparedStatement.setString(7, email);
	                    preparedStatement.setString(8, mob);
	                    

	                    int rowsAffected = preparedStatement.executeUpdate();

	                    
	                    if (rowsAffected > 0) {
	                        JOptionPane.showMessageDialog(null, "Added successfully.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Failed to add.");
	                    }
	                    
	                    txt01.setText("");
	                    txt02.setText("");
	                    txt03.setText("");
	                    txt04.setText("");
	                    txt05.setText("");
	                    txt06.setText("");
	                    txt07.setText("");
	                    txt08.setText("");
	                   
	                    txt01.requestFocus();
	                    
	                    
	                    preparedStatement.close();
	                    connection.close();
	                    
	                }
	                catch(Exception ex)
	                {
	                	ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Database connection error.");
	                }
				}
				
			}
				
			
		);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(91, 392, 118, 26);
		panel_2.add(btnNewButton_2);
		
		txt06 = new JTextField();
		txt06.setColumns(10);
		txt06.setBounds(113, 265, 168, 20);
		panel_2.add(txt06);
		
		JButton btnNewButton_2_1_1 = new JButton("Show");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int CC;
                try {
				// Database connection parameters
		        String jdbcUrl = "jdbc:mysql://localhost:4306/lec_reg";
		        String dbUsername = "root";
		        String dbPassword = "";
				
		        Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM lecturer");
                ResultSet rs=preparedStatement.executeQuery();
                
                ResultSetMetaData RSMD=rs.getMetaData();
                CC = RSMD.getColumnCount();
                DefaultTableModel DFT=(DefaultTableModel) table.getModel();
                DFT.setRowCount(0);
                
                while (rs.next())
                {
                	Vector v2=new Vector();
                	
                	for (int i=1;i<=CC;i++)
                	{
                		v2.add(rs.getString("lecid"));
                		v2.add(rs.getString("fname"));
                		v2.add(rs.getString("lname"));
                		v2.add(rs.getString("nic"));
                		v2.add(rs.getString("address"));
                		v2.add(rs.getString("subject"));
                		v2.add(rs.getString("email"));
                		v2.add(rs.getString("mob"));
                		
                	}
                	
                	DFT.addRow(v2);
                	
                }
                
                }
                catch(Exception ex)
                {
                	ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Database connection error.");
                }
				
				
			}
				
				
			
		});
		btnNewButton_2_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2_1_1.setBackground(Color.GREEN);
		btnNewButton_2_1_1.setBounds(10, 429, 85, 26);
		panel_2.add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("Update");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int selectedIndex=table.getSelectedRow();
					
					txt01.setText(model.getValueAt(selectedIndex, 0).toString());
					
					String  lecid,fname,lname,nic,address,subject,email,mob;
					
					
					lecid = txt01.getText();
					fname = txt02.getText();
					lname = txt03.getText();
					nic = txt04.getText();
					address = txt05.getText();
					subject = txt06.getText();
					email = txt07.getText();
					mob = txt08.getText();
					
					
					// Database connection parameters
			        String jdbcUrl = "jdbc:mysql://localhost:4306/lec_reg";
			        String dbUsername = "root";
			        String dbPassword = "";
					
			        	Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	                    PreparedStatement preparedStatement = connection.prepareStatement("update lecturer set lecid=?,fname=?,lname=?,nic=?,address=?,subject=?,email=?,mob=? where lecid=?");
	                    preparedStatement.setString(1, lecid);
	                    preparedStatement.setString(2, fname);
	                    preparedStatement.setString(3, lname);
	                    preparedStatement.setString(4, nic);
	                    preparedStatement.setString(5, address);
	                    preparedStatement.setString(6, subject);
	                    preparedStatement.setString(7, email);
	                    preparedStatement.setString(8, mob);
	                    preparedStatement.setString(9, lecid);
	                    

	                    int rowsAffected = preparedStatement.executeUpdate();

	                    
	                    if (rowsAffected > 0) {
	                        JOptionPane.showMessageDialog(null, "Added successfully.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Failed to add.");
	                    }
	                    
	                    txt01.setText("");
	                    txt02.setText("");
	                    txt03.setText("");
	                    txt04.setText("");
	                    txt05.setText("");
	                    txt06.setText("");
	                    txt07.setText("");
	                    txt08.setText("");
	                   
	                    txt01.requestFocus();
	                    
	                    
	                    preparedStatement.close();
	                    connection.close();
	                    
	                }
	                catch(Exception ex)
	                {
	                	ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Database connection error.");
	                }
				}
				
			
				
			
		});
		btnNewButton_2_1_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1_1_1.setBackground(Color.GREEN);
		btnNewButton_2_1_1_1.setBounds(107, 429, 90, 26);
		panel_2.add(btnNewButton_2_1_1_1);
		
		JButton btnNewButton_2_1_1_2 = new JButton("Delete");
		btnNewButton_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int selectedIndex=table.getSelectedRow();
					
					txt01.setText(model.getValueAt(selectedIndex, 0).toString());
					
					String  lecid,fname,lname,nic,address,subject,email,mob;
					
					
					lecid = txt01.getText();
					fname = txt02.getText();
					lname = txt03.getText();
					nic = txt04.getText();
					address = txt05.getText();
					subject = txt06.getText();
					email = txt07.getText();
					mob = txt08.getText();
					
					
					// Database connection parameters
			        String jdbcUrl = "jdbc:mysql://localhost:4306/lec_reg";
			        String dbUsername = "root";
			        String dbPassword = "";
					
			        	Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	                    PreparedStatement preparedStatement = connection.prepareStatement("delete from lecturer where lecid=?");
	                    preparedStatement.setString(1, lecid);
	                   
	                    

	                    int rowsAffected = preparedStatement.executeUpdate();

	                    
	                    if (rowsAffected > 0) {
	                        JOptionPane.showMessageDialog(null, "Deleted successfully.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Failed to Delete.");
	                    }
	                    
	                    txt01.setText("");
	                    txt02.setText("");
	                    txt03.setText("");
	                    txt04.setText("");
	                    txt05.setText("");
	                    txt06.setText("");
	                    txt07.setText("");
	                    txt08.setText("");
	                   
	                    txt01.requestFocus();
	                    
	                    
	                    preparedStatement.close();
	                    connection.close();
	                    
	                }
	                catch(Exception ex)
	                {
	                	ex.printStackTrace();
	                    JOptionPane.showMessageDialog(null, "Database connection error.");
	                }
				
			}
		});
		btnNewButton_2_1_1_2.setForeground(Color.BLUE);
		btnNewButton_2_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2_1_1_2.setBackground(Color.GREEN);
		btnNewButton_2_1_1_2.setBounds(207, 429, 85, 26);
		panel_2.add(btnNewButton_2_1_1_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(351, 84, 830, 522);
		contentPane.add(panel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int selectedIndex=table.getSelectedRow();
				
				txt01.setText(model.getValueAt(selectedIndex, 0).toString());
				txt02.setText(model.getValueAt(selectedIndex, 1).toString());
				txt03.setText(model.getValueAt(selectedIndex, 2).toString());
				txt04.setText(model.getValueAt(selectedIndex, 3).toString());
				txt05.setText(model.getValueAt(selectedIndex, 4).toString());
				txt06.setText(model.getValueAt(selectedIndex, 5).toString());
				txt07.setText(model.getValueAt(selectedIndex, 6).toString());
				txt08.setText(model.getValueAt(selectedIndex, 7).toString());
				
				
			}
		});
		scrollPane.setBounds(0, 0, 830, 522);
		panel_1_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"LecturerID", "FirstName", "LastName", "NIC", "Address", "Subject", "Email", "Mobile Number"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBackground(Color.LIGHT_GRAY);
		
		JLabel lblNewLabel_2_1 = new JLabel("Lecturers Registration");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(481, 10, 302, 33);
		contentPane.add(lblNewLabel_2_1);
		
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
		btnNewButton_1_1.setBounds(1101, 10, 80, 33);
		contentPane.add(btnNewButton_1_1);
	}

}
