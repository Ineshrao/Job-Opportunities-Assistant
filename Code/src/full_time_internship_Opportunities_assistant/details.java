package full_time_internship_0pportunities_assistant;

import java.awt.EventQueue;


import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.Component;

public class details {

	private JFrame frame;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public void main(String company) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					details window = new details(company);
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
	public details(String company) {
		initialize(company);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String company) {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setBackground(new Color(82, 170, 255));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0, 0,screen.width,screen.height - 30);
		frame.setExtendedState(frame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(239, 246, 254));
		panel_1.setBounds(116, 197, 1328, 542);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		Connection con = null;
		System.out.println(company);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
			if (!con.isClosed())
				System.out.println("Successfully connected to MySQL server...");
		
			String query = "Select * FROM stud_company where companyname = '"+company+"'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
    		//rs.next();
			//rs.getString(1)
			//UPDATE Customers
			//SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
			//WHERE CustomerID = 1;
			
				//System.out.println(rs.getString(1));
				//System.out.println(rs.getString(2));
				//System.out.println(rs.getString(3))
			
			String query2 = "Select count(*) FROM stud_company where companyname = '"+company+"'";
    		Statement stmt2 = con.createStatement();
    		ResultSet rs2 = stmt2.executeQuery(query2);
    		rs2.next(); 
    		int i = rs2.getInt(1);

		
		if(i==1)
		{
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 103, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			
    		rs.next();
			
			String query_1 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_1 = con.createStatement();
			ResultSet rs_1 = stmt_1.executeQuery(query_1);
			
			rs_1.next();
			
			JButton btnNewButton = new JButton("Contact");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(SystemColor.textHighlight);
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(1169, 10, 129, 59);
			panel_dyn.add(btnNewButton);
			
			JLabel lblNewLabel = new JLabel(rs_1.getString(2)+" "+rs_1.getString(3));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel(rs_1.getString(4));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel(rs_1.getString(5));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 140, 59);
			panel_dyn.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("CGPA : "+rs_1.getString(6));
			lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_1.setBounds(971, 10, 134, 59);
			panel_dyn.add(lblNewLabel_1_2_1);
			

		}
		
		else if(i==2)
		{
			
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 103, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			
			JPanel panel_dyn1 = new JPanel();
			panel_dyn1.setBackground(Color.WHITE);
			panel_dyn1.setBounds(10, 192, 1308, 79);
			panel_1.add(panel_dyn1);
			panel_dyn1.setLayout(null);
			
			rs.next();
			
			String query_1 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_1 = con.createStatement();
			ResultSet rs_1 = stmt_1.executeQuery(query_1);
			
			rs_1.next();
			
			JButton btnNewButton = new JButton("Contact");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(SystemColor.textHighlight);
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(1169, 10, 129, 59);
			panel_dyn.add(btnNewButton);
			
			JLabel lblNewLabel = new JLabel(rs_1.getString(2)+" "+rs_1.getString(3));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel(rs_1.getString(4));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel(rs_1.getString(5));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 140, 59);
			panel_dyn.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("CGPA : "+rs_1.getString(6));
			lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_1.setBounds(971, 10, 134, 59);
			panel_dyn.add(lblNewLabel_1_2_1);
			
			rs.next();
			
			String query_2 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_2 = con.createStatement();
			ResultSet rs_2 = stmt_2.executeQuery(query_2);
			
			rs_2.next();
			
			JButton btnNewButton1 = new JButton("Contact");
			btnNewButton1.setForeground(Color.WHITE);
			btnNewButton1.setBackground(SystemColor.textHighlight);
			btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton1.setBounds(1169, 10, 129, 59);
			panel_dyn1.add(btnNewButton1);
			
			JLabel lblNewLabel1 = new JLabel(rs_2.getString(2)+" "+rs_2.getString(3));
			lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel1.setBounds(30, 10, 249, 59);
			panel_dyn1.add(lblNewLabel1);
			
			JLabel lblNewLabel_11 = new JLabel(rs_2.getString(4));
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_11.setBounds(376, 10, 249, 59);
			panel_dyn1.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_21 = new JLabel(rs_2.getString(5));
			lblNewLabel_1_21.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_21.setBounds(701, 10, 140, 59);
			panel_dyn1.add(lblNewLabel_1_21);
			
			JLabel lblNewLabel_1_2_11 = new JLabel("CGPA : "+rs_2.getString(6));
			lblNewLabel_1_2_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_11.setBounds(971, 10, 134, 59);
			panel_dyn1.add(lblNewLabel_1_2_11);
		}
		
		else if(i==3)
		{
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 103, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			
			JPanel panel_dyn1 = new JPanel();
			panel_dyn1.setBackground(Color.WHITE);
			panel_dyn1.setBounds(10, 192, 1308, 79);
			panel_1.add(panel_dyn1);
			panel_dyn1.setLayout(null);
			
			JPanel panel_dyn2 = new JPanel();
			panel_dyn2.setBackground(Color.WHITE);
			panel_dyn2.setBounds(10, 281, 1308, 79);
			panel_1.add(panel_dyn2);
			panel_dyn2.setLayout(null);
			
			rs.next();
			
			String query_1 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_1 = con.createStatement();
			ResultSet rs_1 = stmt_1.executeQuery(query_1);
			
			rs_1.next();
			
			JButton btnNewButton = new JButton("Contact");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(SystemColor.textHighlight);
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(1169, 10, 129, 59);
			panel_dyn.add(btnNewButton);
			
			
			
			JLabel lblNewLabel = new JLabel(rs_1.getString(2)+" "+rs_1.getString(3));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel(rs_1.getString(4));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel(rs_1.getString(5));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 140, 59);
			panel_dyn.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("CGPA : "+rs_1.getString(6));
			lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_1.setBounds(971, 10, 134, 59);
			panel_dyn.add(lblNewLabel_1_2_1);
			
			rs.next();
			
			String query_2 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_2 = con.createStatement();
			ResultSet rs_2 = stmt_2.executeQuery(query_2);
			
			rs_2.next();
			
			JButton btnNewButton1 = new JButton("Contact");
			btnNewButton1.setForeground(Color.WHITE);
			btnNewButton1.setBackground(SystemColor.textHighlight);
			btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton1.setBounds(1169, 10, 129, 59);
			panel_dyn1.add(btnNewButton1);
			
			JLabel lblNewLabel1 = new JLabel(rs_2.getString(2)+" "+rs_2.getString(3));
			lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel1.setBounds(30, 10, 249, 59);
			panel_dyn1.add(lblNewLabel1);
			
			JLabel lblNewLabel_11 = new JLabel(rs_2.getString(4));
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_11.setBounds(376, 10, 249, 59);
			panel_dyn1.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_21 = new JLabel(rs_2.getString(5));
			lblNewLabel_1_21.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_21.setBounds(701, 10, 140, 59);
			panel_dyn1.add(lblNewLabel_1_21);
			
			JLabel lblNewLabel_1_2_11 = new JLabel("CGPA : "+rs_2.getString(6));
			lblNewLabel_1_2_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_11.setBounds(971, 10, 134, 59);
			panel_dyn1.add(lblNewLabel_1_2_11);
			
			rs.next();
			
			String query_3 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_3 = con.createStatement();
			ResultSet rs_3 = stmt_3.executeQuery(query_3);
			
			rs_3.next();
			
			JButton btnNewButton2 = new JButton("Contact");
			btnNewButton2.setForeground(Color.WHITE);
			btnNewButton2.setBackground(SystemColor.textHighlight);
			btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton2.setBounds(1169, 10, 129, 59);
			panel_dyn2.add(btnNewButton2);
			
			JLabel lblNewLabel2 = new JLabel(rs_3.getString(2)+" "+rs_3.getString(3));
			lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel2.setBounds(30, 10, 249, 59);
			panel_dyn2.add(lblNewLabel2);
			
			JLabel lblNewLabel_12 = new JLabel(rs_3.getString(4));
			lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_12.setBounds(376, 10, 249, 59);
			panel_dyn2.add(lblNewLabel_12);
			
			JLabel lblNewLabel_1_22 = new JLabel(rs_3.getString(5));
			lblNewLabel_1_22.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_22.setBounds(701, 10, 140, 59);
			panel_dyn2.add(lblNewLabel_1_22);
			
			JLabel lblNewLabel_1_2_12 = new JLabel("CGPA : "+rs_3.getString(6));
			lblNewLabel_1_2_12.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_12.setBounds(971, 10, 134, 59);
			panel_dyn2.add(lblNewLabel_1_2_12);
			
		}
		else if(i==4)
		{
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 103, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			
			JPanel panel_dyn1 = new JPanel();
			panel_dyn1.setBackground(Color.WHITE);
			panel_dyn1.setBounds(10, 192, 1308, 79);
			panel_1.add(panel_dyn1);
			panel_dyn1.setLayout(null);
			
			JPanel panel_dyn2 = new JPanel();
			panel_dyn2.setBackground(Color.WHITE);
			panel_dyn2.setBounds(10, 281, 1308, 79);
			panel_1.add(panel_dyn2);
			panel_dyn2.setLayout(null);
			
			JPanel panel_dyn3 = new JPanel();
			panel_dyn3.setBackground(Color.WHITE);
			panel_dyn3.setBounds(10, 370, 1308, 79);
			panel_1.add(panel_dyn3);
			panel_dyn3.setLayout(null);
			
			rs.next();
			
			String query_1 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_1 = con.createStatement();
			ResultSet rs_1 = stmt_1.executeQuery(query_1);
			
			rs_1.next();
			
			JButton btnNewButton = new JButton("Contact");
			btnNewButton.setForeground(Color.WHITE);
			btnNewButton.setBackground(SystemColor.textHighlight);
			btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton.setBounds(1169, 10, 129, 59);
			panel_dyn.add(btnNewButton);
			
			JLabel lblNewLabel = new JLabel(rs_1.getString(2)+" "+rs_1.getString(3));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel(rs_1.getString(4));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel(rs_1.getString(5));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 140, 59);
			panel_dyn.add(lblNewLabel_1_2);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("CGPA : "+rs_1.getString(6));
			lblNewLabel_1_2_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_1.setBounds(971, 10, 134, 59);
			panel_dyn.add(lblNewLabel_1_2_1);
			
			rs.next();
			
			String query_2 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_2 = con.createStatement();
			ResultSet rs_2 = stmt_2.executeQuery(query_2);
			
			rs_2.next();
			
			JButton btnNewButton1 = new JButton("Contact");
			btnNewButton1.setForeground(Color.WHITE);
			btnNewButton1.setBackground(SystemColor.textHighlight);
			btnNewButton1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton1.setBounds(1169, 10, 129, 59);
			panel_dyn1.add(btnNewButton1);
			
			JLabel lblNewLabel1 = new JLabel(rs_2.getString(2)+" "+rs_2.getString(3));
			lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel1.setBounds(30, 10, 249, 59);
			panel_dyn1.add(lblNewLabel1);
			
			JLabel lblNewLabel_11 = new JLabel(rs_2.getString(4));
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_11.setBounds(376, 10, 249, 59);
			panel_dyn1.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_21 = new JLabel(rs_2.getString(5));
			lblNewLabel_1_21.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_21.setBounds(701, 10, 140, 59);
			panel_dyn1.add(lblNewLabel_1_21);
			
			JLabel lblNewLabel_1_2_11 = new JLabel("CGPA : "+rs_2.getString(6));
			lblNewLabel_1_2_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_11.setBounds(971, 10, 134, 59);
			panel_dyn1.add(lblNewLabel_1_2_11);
			
			rs.next();
			
			String query_3 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_3 = con.createStatement();
			ResultSet rs_3 = stmt_3.executeQuery(query_3);
			
			rs_3.next();
			
			JButton btnNewButton2 = new JButton("Contact");
			btnNewButton2.setForeground(Color.WHITE);
			btnNewButton2.setBackground(SystemColor.textHighlight);
			btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton2.setBounds(1169, 10, 129, 59);
			panel_dyn2.add(btnNewButton2);
			
			JLabel lblNewLabel2 = new JLabel(rs_3.getString(2)+" "+rs_3.getString(3));
			lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel2.setBounds(30, 10, 249, 59);
			panel_dyn2.add(lblNewLabel2);
			
			JLabel lblNewLabel_12 = new JLabel(rs_3.getString(4));
			lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_12.setBounds(376, 10, 249, 59);
			panel_dyn2.add(lblNewLabel_12);
			
			JLabel lblNewLabel_1_22 = new JLabel(rs_3.getString(5));
			lblNewLabel_1_22.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_22.setBounds(701, 10, 140, 59);
			panel_dyn2.add(lblNewLabel_1_22);
			
			JLabel lblNewLabel_1_2_12 = new JLabel("CGPA : "+rs_3.getString(6));
			lblNewLabel_1_2_12.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_12.setBounds(971, 10, 134, 59);
			panel_dyn2.add(lblNewLabel_1_2_12);
			
			rs.next();
			
			String query_4 = "Select * FROM student_details where username = '"+rs.getString(1)+"'";
			Statement stmt_4 = con.createStatement();
			ResultSet rs_4 = stmt_4.executeQuery(query_4);
			
			rs_4.next();
			
			JButton btnNewButton3 = new JButton("Contact");
			btnNewButton3.setForeground(Color.WHITE);
			btnNewButton3.setBackground(SystemColor.textHighlight);
			btnNewButton3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			btnNewButton3.setBounds(1169, 10, 129, 59);
			panel_dyn3.add(btnNewButton3);
			
			JLabel lblNewLabel3 = new JLabel(rs_4.getString(2)+" "+rs_4.getString(3));
			lblNewLabel3.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel3.setBounds(30, 10, 249, 59);
			panel_dyn3.add(lblNewLabel3);
			
			JLabel lblNewLabel_13 = new JLabel(rs_4.getString(4));
			lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_13.setBounds(376, 10, 249, 59);
			panel_dyn3.add(lblNewLabel_13);
			
			JLabel lblNewLabel_1_23 = new JLabel(rs_4.getString(5));
			lblNewLabel_1_23.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_23.setBounds(701, 10, 140, 59);
			panel_dyn3.add(lblNewLabel_1_23);
			
			JLabel lblNewLabel_1_2_13 = new JLabel("CGPA : "+rs_4.getString(6));
			lblNewLabel_1_2_13.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2_13.setBounds(971, 10, 134, 59);
			panel_dyn3.add(lblNewLabel_1_2_13);
		}
		
		
		txtName = new JTextField();
		txtName.setBorder(null);
		txtName.setFont(new Font("Arial", Font.PLAIN, 27));
		txtName.setHorizontalAlignment(JTextField.CENTER);
		txtName.setText(company);
		txtName.setBounds(10, 19, 1308, 79);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(101, 78, 1354, 674);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Full-Time/Internship");
		lblNewLabel_3.setBounds(15, 10, 589, 65);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 45));
		panel_2.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 246, 254));
		panel.setBounds(709, 0, 645, 674);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JButton logout = new JButton("BACK");
		logout.setForeground(Color.WHITE);
		logout.setBackground(SystemColor.textHighlight);
		logout.setFont(new Font("Arial", Font.PLAIN, 15));
		logout.setBounds(499, 10, 136, 45);
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				
				full_time_internship_0pportunities_assistant.dashboard o = new full_time_internship_0pportunities_assistant.dashboard();
				o.main(null);
			}
		});
		panel.add(logout);
		
		JLabel lblNewLabel_3_1 = new JLabel(" Opportunities Assistant");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(15, 53, 230, 50);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("OODJ MINI PROJECT");
		lblNewLabel_1_1.setBounds(299, 53, 200, 24);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 10));
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(239, 246, 254));
		panel_1_1.setBounds(0, 0, 811, 816);
		frame.getContentPane().add(panel_1_1);
}	
		
		catch(ClassNotFoundException e) {
			e.printStackTrace();
				}
			catch(SQLException e) {
			e.printStackTrace();
				}
			catch (Exception e) {
			e.printStackTrace();
				}
			finally {
				try {
					if (con != null)
					con.close();
					} 
				catch(SQLException e) {}
				}
	}
}
