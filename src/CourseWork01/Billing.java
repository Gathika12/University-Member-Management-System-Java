package CourseWork01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.awt.event.ActionEvent;
import java.sql.*;


public class Billing extends JFrame {
	
	public int finalTotal = 0;
	

	private JPanel contentPane;
	private JTextField txt01;
	private JTextField txt02;
	private JTextField txt03;
	private JTextField txt04;
	private JTextField txt05;
	private JTextField txt06;
	private JTextField txt07;
	private JTextField txt08;
	private JTextField txt09;
	private JTextField txt10;
	private JTextField txt11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
		setTitle("Billing & Payments");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,994, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("                                        Billing & Payments");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1_1.setBackground(Color.RED);
		lblNewLabel_1_1.setBounds(0, 11, 978, 58);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("Student Details");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(20, 101, 130, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Course Details");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 186, 130, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblStudentId.setBounds(30, 133, 76, 21);
		contentPane.add(lblStudentId);
		
		txt01 = new JTextField();
		txt01.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=txt01.getText();
				
				try 
				{
					
					// Database connection parameters
			        String jdbcUrl = "jdbc:mysql://localhost:4306/studentinfo";
			        String dbUsername = "root";
			        String dbPassword = "";
					
			        Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
					Statement st=connection.createStatement();
					ResultSet rs=st.executeQuery("select *from students where sid like '"+name+"%'");
					
					if(rs.next())
					{
						txt01.setText(rs.getString(1));
						txt02.setText(rs.getString(2));
						txt03.setText(rs.getString(5));
						txt04.setText(rs.getString(8));
					}
					else
					{
						txt02.setText("");
						txt03.setText("");
						txt04.setText("");
					}
					
				} 
				catch (Exception e2) 
				{
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		txt01.setBounds(101, 134, 138, 20);
		contentPane.add(txt01);
		txt01.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblName.setBounds(259, 133, 40, 21);
		contentPane.add(lblName);
		
		txt02 = new JTextField();
		txt02.setColumns(10);
		txt02.setBounds(308, 134, 152, 20);
		contentPane.add(txt02);
		
		JLabel lblAddress = new JLabel("Email");
		lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblAddress.setBounds(479, 133, 39, 21);
		contentPane.add(lblAddress);
		
		txt03 = new JTextField();
		txt03.setColumns(10);
		txt03.setBounds(529, 134, 147, 20);
		contentPane.add(txt03);
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNumber.setBounds(710, 133, 63, 21);
		contentPane.add(lblNumber);
		
		txt04 = new JTextField();
		txt04.setColumns(10);
		txt04.setBounds(783, 134, 157, 20);
		contentPane.add(txt04);
		
		JLabel lblCourseId = new JLabel("Course ID");
		lblCourseId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCourseId.setBounds(30, 218, 76, 21);
		contentPane.add(lblCourseId);
		
		txt05 = new JTextField();
		txt05.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name=txt05.getText();
				
				try 
				{
					
					// Database connection parameters
			        String jdbcUrl = "jdbc:mysql://localhost:4306/courseinfo";
			        String dbUsername = "root";
			        String dbPassword = "";
					
			        Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
					Statement st=connection.createStatement();
					ResultSet rs=st.executeQuery("select *from course where cid like '"+name+"%'");
					
					if(rs.next())
					{
						txt05.setText(rs.getString(1));
						txt06.setText(rs.getString(5));
						txt07.setText(rs.getString(6));
						
					}
					else
					{
						txt06.setText("");
						txt07.setText("");
						
					}
					
				} 
				catch (Exception e2) 
				{
					// TODO: handle exception
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
		});
		txt05.setColumns(10);
		txt05.setBounds(101, 219, 63, 20);
		contentPane.add(txt05);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDuration.setBounds(217, 218, 63, 21);
		contentPane.add(lblDuration);
		
		txt06 = new JTextField();
		txt06.setColumns(10);
		txt06.setBounds(280, 219, 110, 20);
		contentPane.add(txt06);
		
		JLabel lblFee = new JLabel("Fee");
		lblFee.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblFee.setBounds(412, 218, 36, 21);
		contentPane.add(lblFee);
		
		txt07 = new JTextField();
		txt07.setColumns(10);
		txt07.setBounds(458, 219, 138, 20);
		contentPane.add(txt07);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDescription.setBounds(637, 218, 76, 21);
		contentPane.add(lblDescription);
		
		txt08 = new JTextField();
		txt08.setColumns(10);
		txt08.setBounds(723, 219, 99, 20);
		contentPane.add(txt08);
		
		JLabel lblNewLabel_1_2 = new JLabel("Payment Details");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(455, 273, 130, 21);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTotal.setBounds(455, 310, 49, 21);
		contentPane.add(lblTotal);
		
		txt09 = new JTextField();
		txt09.setColumns(10);
		txt09.setBounds(570, 311, 147, 20);
		contentPane.add(txt09);
		
		JLabel lblPaidAmount = new JLabel("Paid Amount");
		lblPaidAmount.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPaidAmount.setBounds(455, 351, 96, 21);
		contentPane.add(lblPaidAmount);
		
		txt10 = new JTextField();
		txt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				String paidAmount=txt10.getText();
				int z=Integer.parseInt(paidAmount);
				finalTotal= z-finalTotal;
				String finalTotal01=String.valueOf(finalTotal);
				txt11.setText(finalTotal01);
				txt11.setEditable(false);
			}
		});
		txt10.setColumns(10);
		txt10.setBounds(570, 352, 147, 20);
		contentPane.add(txt10);
		
		JLabel lblReturnAmount = new JLabel("Return Amount");
		lblReturnAmount.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblReturnAmount.setBounds(455, 391, 96, 21);
		contentPane.add(lblReturnAmount);
		
		txt11 = new JTextField();
		txt11.setColumns(10);
		txt11.setBounds(570, 392, 147, 20);
		contentPane.add(txt11);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String StudentID=txt01.getText();
				String Name=txt02.getText();
				String Email=txt03.getText();
				String Number=txt04.getText();
				
				String path="E:\\pdf";
				com.itextpdf.text.Document doc=new com.itextpdf.text.Document();
				try
				{
					PdfWriter.getInstance(doc, new FileOutputStream(path+""+Name+""+txt05.getText()+".pdf"));
					doc.open();
					Paragraph paragraph1=new Paragraph("                                         National Institute of Business Management\n                                                               Billing &Payments\n                                               Contact Number(+94)412347390\n\n");
					doc.add(paragraph1);
					Paragraph paragraph2=new Paragraph("Student Details;\n StudentID;"+StudentID+"\n Name:"+Name+"\n Email;"+Email+"\n Number:"+Number+"\n\n");
					doc.add(paragraph2);
					PdfPTable tb1=new PdfPTable(5);
					
					
					doc.add(tb1);
					
					Paragraph paragraph3=new Paragraph("\nTotal"+txt09.getText()+"\nPaid Amound"+txt10.getText()+"\nReturn Amount"+txt11.getText()+"\n\nThank You!!");
					doc.add(paragraph3);
					
					JOptionPane.showMessageDialog(null, "Bill Genarated");
					setVisible(false);
					new Billing().setVisible(true);
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				
			doc.close();
			
			try {
				String  sid,Sname,cid,duration,fees,paid;
				
				
				sid = txt01.getText();
				Sname = txt02.getText();
				cid = txt05.getText();
				duration = txt06.getText();
				fees = txt07.getText();
				paid = txt10.getText();
				
				
				// Database connection parameters
		        String jdbcUrl = "jdbc:mysql://localhost:4306/billing";
		        String dbUsername = "root";
		        String dbPassword = "";
				
		        	Connection connection = DriverManager.getConnection(jdbcUrl, dbUsername, dbPassword);
                    PreparedStatement preparedStatement = connection.prepareStatement("Insert into bill(sid,Sname,cid,duration,fees,paid)values(?,?,?,?,?,?)");
                    preparedStatement.setString(1, sid);
                    preparedStatement.setString(2, Sname);
                    preparedStatement.setString(3, cid);
                    preparedStatement.setString(4, duration);
                    preparedStatement.setString(5, fees);
                    preparedStatement.setString(6, paid);
                    

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
                    txt09.setText("");
                    txt10.setText("");
                    txt11.setText("");
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
		btnNewButton.setBounds(813, 308, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Billing().setVisible(true);
			}
		});
		btnReset.setBounds(813, 349, 89, 23);
		contentPane.add(btnReset);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new Home().setVisible(true);
				
			}
		});
		btnClose.setBounds(813, 389, 89, 23);
		contentPane.add(btnClose);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 260, 435, 183);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Student", "Course", "Duration", "Fees"
			}
		));
		
		JButton btnNewButton_1 = new JButton("ADD");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				int price=Integer.parseInt(txt07.getText());
				int total=price;
				DefaultTableModel model=(DefaultTableModel)table.getModel();
				model.addRow(new Object[] {txt01.getText(),txt05.getText(),txt06.getText(),total});
				finalTotal=finalTotal+total;
				String finalTotal01 = String.valueOf(finalTotal);
				txt09.setText(finalTotal01);
			}
		});
		btnNewButton_1.setBounds(867, 218, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
