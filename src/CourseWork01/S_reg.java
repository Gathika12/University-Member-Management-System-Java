package CourseWork01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.log.Logger;

import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.lang.System.Logger.Level;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.sql.*;
import java.util.Vector;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class S_reg extends JFrame {

	private JPanel contentPane;
	private JTextField txt01;
	private JTextField txt02;
	private JTextField txt03;
	private JTextField txt04;
	private JTextField txt05;
	private JTextField txt06;
	private JTextField txt07;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					S_reg frame = new S_reg();
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
	public S_reg() {
		
		
		
		setTitle("Student Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1207, 656);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 84, 302, 522);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(92, 11, 118, 26);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(28, 75, 62, 14);
		panel.add(lblNewLabel_1);
		
		txt01 = new JTextField();
		txt01.setBounds(113, 73, 168, 20);
		panel.add(txt01);
		txt01.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("First Name");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(28, 114, 75, 14);
		panel.add(lblNewLabel_1_1);
		
		txt02 = new JTextField();
		txt02.setColumns(10);
		txt02.setBounds(113, 112, 168, 20);
		panel.add(txt02);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(28, 153, 75, 14);
		panel.add(lblNewLabel_1_1_1);
		
		txt03 = new JTextField();
		txt03.setColumns(10);
		txt03.setBounds(113, 151, 168, 20);
		panel.add(txt03);
		
		txt04 = new JTextField();
		txt04.setColumns(10);
		txt04.setBounds(113, 186, 168, 20);
		panel.add(txt04);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Date of Birth");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(28, 188, 75, 14);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Email");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(28, 228, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		txt05 = new JTextField();
		txt05.setColumns(10);
		txt05.setBounds(113, 226, 168, 20);
		panel.add(txt05);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Course");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(28, 267, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_2 = new JLabel("NIC number");
		lblNewLabel_1_1_1_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_2.setBounds(28, 307, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1_2);
		
		txt06 = new JTextField();
		txt06.setColumns(10);
		txt06.setBounds(113, 305, 168, 20);
		panel.add(txt06);
		
		JLabel lblNewLabel_1_1_1_1_1_3 = new JLabel("Mobile Number");
		lblNewLabel_1_1_1_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_3.setBounds(28, 345, 100, 14);
		panel.add(lblNewLabel_1_1_1_1_1_3);
		
		txt07 = new JTextField();
		txt07.setColumns(10);
		txt07.setBounds(133, 343, 148, 20);
		panel.add(txt07);
		
		JTextArea txt08 = new JTextArea();
		txt08.setBounds(113, 379, 168, 22);
		panel.add(txt08);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			try {
				String  sid,fname,lname,dob,email,nic,mob,address;
				String course;
				
				sid = txt01.getText();
				fname = txt02.getText();
				lname = txt03.getText();
				dob = txt04.getText();
				email = txt05.getText();
				course = textField.getText();
				nic = txt06.getText();
				mob = txt07.getText();
				address = txt08.getText();
				
				// Database connection parameters
		        String jdbcUrl = "jdbc:mysql://localhost:4306/studentinfo";
		        String dbUsername = "root";
		        String dbPassword = "";
				
		        	Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                    PreparedStatement preparedStatement = connection.prepareStatement("Insert into students(sid,fname,lname,dob,email,course,nic,mob,address)values(?,?,?,?,?,?,?,?,?)");
                    preparedStatement.setString(1, sid);
                    preparedStatement.setString(2, fname);
                    preparedStatement.setString(3, lname);
                    preparedStatement.setString(4, dob);
                    preparedStatement.setString(5, email);
                    preparedStatement.setString(6, course);
                    preparedStatement.setString(7, nic);
                    preparedStatement.setString(8, mob);
                    preparedStatement.setString(9, address);

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
                    textField.setText("");
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
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBounds(95, 430, 107, 26);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1_1_1_1_1_2_1 = new JLabel("Address");
		lblNewLabel_1_1_1_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_2_1.setBounds(28, 383, 75, 14);
		panel.add(lblNewLabel_1_1_1_1_1_2_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(113, 265, 168, 20);
		panel.add(textField);
		
		JButton btnNewButton_2 = new JButton("Show");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int CC;
                try {
				// Database connection parameters
		        String jdbcUrl = "jdbc:mysql://localhost:4306/studentinfo";
		        String dbUsername = "root";
		        String dbPassword = "";
				
		        Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM students");
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
                		v2.add(rs.getString("sid"));
                		v2.add(rs.getString("fname"));
                		v2.add(rs.getString("dob"));
                		v2.add(rs.getString("email"));
                		v2.add(rs.getString("course"));
                		v2.add(rs.getString("nic"));
                		v2.add(rs.getString("mob"));
                		v2.add(rs.getString("address"));
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
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBackground(Color.GREEN);
		btnNewButton_2.setBounds(10, 467, 89, 26);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Update");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int selectedIndex=table.getSelectedRow();
					
					txt01.setText(model.getValueAt(selectedIndex, 0).toString());
					
					
					
					String  sid,fname,lname,dob,email,nic,mob,address;
					String course;
					
					sid = txt01.getText();
					fname = txt02.getText();
					lname = txt03.getText();
					dob = txt04.getText();
					email = txt05.getText();
					course = textField.getText();
					nic = txt06.getText();
					mob = txt07.getText();
					address = txt08.getText();
					
					// Database connection parameters
			        String jdbcUrl = "jdbc:mysql://localhost:4306/studentinfo";
			        String dbUsername = "root";
			        String dbPassword = "";
					
			        	Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	                    PreparedStatement preparedStatement = connection.prepareStatement("update students set sid=?,fname=?,lname=?,dob=?,email=?,course=?,nic=?,mob=?,address=? where sid=?");
	                    preparedStatement.setString(1, sid);
	                    preparedStatement.setString(2, fname);
	                    preparedStatement.setString(3, lname);
	                    preparedStatement.setString(4, dob);
	                    preparedStatement.setString(5, email);
	                    preparedStatement.setString(6, course);
	                    preparedStatement.setString(7, nic);
	                    preparedStatement.setString(8, mob);
	                    preparedStatement.setString(9, address);
	                    preparedStatement.setString(10, sid);

	                    int rowsAffected = preparedStatement.executeUpdate();

	                    
	                    if (rowsAffected > 0) {
	                        JOptionPane.showMessageDialog(null, "Updated successfully.");
	                    } else {
	                        JOptionPane.showMessageDialog(null, "Failed to Update.");
	                    }
	                    
	                    txt01.setText("");
	                    txt02.setText("");
	                    txt03.setText("");
	                    txt04.setText("");
	                    txt05.setText("");
	                    textField.setText("");
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
		btnNewButton_2_1.setForeground(Color.BLUE);
		btnNewButton_2_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		btnNewButton_2_1.setBackground(Color.GREEN);
		btnNewButton_2_1.setBounds(105, 467, 89, 26);
		panel.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Delete");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
try {
					
					DefaultTableModel model=(DefaultTableModel) table.getModel();
					int selectedIndex=table.getSelectedRow();
					
					txt01.setText(model.getValueAt(selectedIndex, 0).toString());
					
					
					
					String  sid,fname,lname,dob,email,nic,mob,address;
					String course;
					
					sid = txt01.getText();
					fname = txt02.getText();
					lname = txt03.getText();
					dob = txt04.getText();
					email = txt05.getText();
					course = textField.getText();
					nic = txt06.getText();
					mob = txt07.getText();
					address = txt08.getText();
					
					// Database connection parameters
			        String jdbcUrl = "jdbc:mysql://localhost:4306/studentinfo";
			        String dbUsername = "root";
			        String dbPassword = "";
					
			        	Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
	                    PreparedStatement preparedStatement = connection.prepareStatement("delete from students where sid=?");
	                    preparedStatement.setString(1, sid);
	                    

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
	                    textField.setText("");
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
		btnNewButton_2_1_1.setForeground(Color.BLUE);
		btnNewButton_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton_2_1_1.setBackground(Color.GREEN);
		btnNewButton_2_1_1.setBounds(203, 467, 89, 26);
		panel.add(btnNewButton_2_1_1);
		
		
		
		JLabel lblNewLabel_2 = new JLabel("Student Registration");
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_2.setBounds(422, 21, 275, 33);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(351, 84, 830, 522);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 39, 830, 483);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(-6, -16, 842, 505);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(6, 16, 830, 483);
		panel_3.add(scrollPane_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel model=(DefaultTableModel) table.getModel();
				int selectedIndex=table.getSelectedRow();
				
				txt01.setText(model.getValueAt(selectedIndex, 0).toString());
				txt02.setText(model.getValueAt(selectedIndex, 1).toString());
				txt04.setText(model.getValueAt(selectedIndex, 2).toString());
				txt05.setText(model.getValueAt(selectedIndex, 3).toString());
				txt06.setText(model.getValueAt(selectedIndex, 5).toString());
				txt07.setText(model.getValueAt(selectedIndex, 6).toString());
				txt08.setText(model.getValueAt(selectedIndex, 7).toString());
				
				
				
			}
		});
		scrollPane_1.setViewportView(scrollPane);
		scrollPane.setAutoscrolls(true);
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"StudentID", "Name", "Date of Birth", "Email", "Course", "NIC", "Mobile ", "Address"
			}
		));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JButton btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Home().setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBounds(1101, 21, 80, 33);
		contentPane.add(btnNewButton_1);
	}
}
