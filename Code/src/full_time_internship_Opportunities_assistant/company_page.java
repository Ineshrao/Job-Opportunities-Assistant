package full_time_internship_0pportunities_assistant;

import java.awt.EventQueue;


import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.ComponentOrientation;
import java.awt.Desktop;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.border.MatteBorder;

public class company_page {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtCompanyName;
	private JTextField txtEmail;
	private JTextField txtContactNumber;
	private JTextField txtRequiredCgpa;
	private JTextField txtType;
	private JTextField txtStudentsRegistered;

	/**
	 * Launch the application.
	 */
	public void main(String company,String username) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					company_page window = new company_page(company,username);
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
	public company_page(String company,String username) {
		initialize(company,username);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String company,String username) {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
			if (!con.isClosed())
				System.out.println("Successfully connected to MySQL server...");
		
			String query = "Select * FROM company_details where companyname = '"+company+"'";
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
			
			rs.next();
		
		
		
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
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(116, 197, 1328, 542);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		System.out.println();
		txtName = new JTextField();
		txtName.setBorder(null);
		txtName.setFont(new Font("Arial", Font.BOLD, 35));
		txtName.setText("Details");
		txtName.setBounds(593, 42, 123, 44);
		panel_1.add(txtName);
		txtName.setColumns(10);
		
		txtCompanyName = new JTextField();
		txtCompanyName.setBorder(null);
		txtCompanyName.setText("Company Name : "+rs.getString(1));
		txtCompanyName.setFont(new Font("Arial", Font.PLAIN, 27));
		txtCompanyName.setColumns(10);
		txtCompanyName.setBounds(146, 160, 584, 44);
		panel_1.add(txtCompanyName);
		
		txtEmail = new JTextField();
		txtEmail.setBorder(null);
		txtEmail.setText("Email : "+rs.getString(4));
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 27));
		txtEmail.setColumns(10);
		txtEmail.setBounds(146, 225, 584, 44);
		panel_1.add(txtEmail);
		
		txtContactNumber = new JTextField();
		txtContactNumber.setBorder(null);
		txtContactNumber.setText("Contact Number : "+rs.getString(5));
		txtContactNumber.setFont(new Font("Arial", Font.PLAIN, 27));
		txtContactNumber.setColumns(10);
		txtContactNumber.setBounds(146, 288, 584, 44);
		panel_1.add(txtContactNumber);
		
		txtRequiredCgpa = new JTextField();
		txtRequiredCgpa.setBorder(null);
		txtRequiredCgpa.setText("CGPA Required : "+rs.getString(6));
		txtRequiredCgpa.setFont(new Font("Arial", Font.PLAIN, 27));
		txtRequiredCgpa.setColumns(10);
		txtRequiredCgpa.setBounds(740, 225, 584, 44);
		panel_1.add(txtRequiredCgpa);
		
		txtType = new JTextField();
		txtType.setBorder(null);
		txtType.setText("Type : "+rs.getString(2));
		txtType.setFont(new Font("Arial", Font.PLAIN, 27));
		txtType.setColumns(10);
		txtType.setBounds(744, 160, 584, 44);
		panel_1.add(txtType);
		
		txtStudentsRegistered = new JTextField();
		txtStudentsRegistered.setBorder(null);
		txtStudentsRegistered.setText("Students Registered : "+rs.getString(3));
		txtStudentsRegistered.setFont(new Font("Arial", Font.PLAIN, 27));
		txtStudentsRegistered.setColumns(10);
		txtStudentsRegistered.setBounds(740, 288, 584, 44);
		panel_1.add(txtStudentsRegistered);
		final int reg = rs.getInt(3);
		final String url=rs.getString(7);
		JButton btnApply = new JButton("Apply");
		btnApply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con = null;
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
					if (!con.isClosed())
						System.out.println("Successfully connected to MySQL server...");
				String query2 = "Select count(*) FROM stud_company where companyname = '"+company+"' and Username = '"+username+"'";
	    		Statement stmt2 = con.createStatement();
	    		ResultSet rs2 = stmt2.executeQuery(query2);
	    		rs2.next(); 
	    		
	    		String query0 = "Select cgpa FROM student_details where Username = '"+username+"'";
	    		Statement stmt0 = con.createStatement();
	    		ResultSet rs0 = stmt0.executeQuery(query0);
	    		rs0.next();
	    		
	    		float c = rs0.getFloat(1);
	    		
	    		String query11 = "Select ccgpa FROM company_details where companyname = '"+company+"'";
	    		Statement stmt11 = con.createStatement();
	    		ResultSet rs11 = stmt11.executeQuery(query11);
	    		rs11.next();
	    		
	    		float cc = rs11.getFloat(1);
	    		
	    		if(c<cc)
	    		{
	    			UIManager UI=new UIManager();
                	 UI.put("OptionPane.background", Color.white);
                	 UI.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 15));
                	 UI.put("Panel.background", Color.white);
                	 UI.put("Button.background", new Color(82, 170, 255));
                	 UI.put("Button.foreground",Color.WHITE);
                	 UI.put("setFont",new Font("Arial", Font.PLAIN, 18));
                	 JOptionPane.showMessageDialog(null,"Your CGPA must be greater than "+cc+" to apply.","Error",JOptionPane.ERROR_MESSAGE);
	    			
	    		}
	    		else {
	    		int k = rs2.getInt(1);
				
	    		if(k==0)
	    		{
	    			
					int i=reg+1;
					String query1 = "UPDATE company_details SET reg = ?  WHERE companyname = ?";
					PreparedStatement preparedStmt = con.prepareStatement(query1);
				    preparedStmt.setInt(1, i);
				    preparedStmt.setString(2, company);
				    preparedStmt.executeUpdate();
				    
				    				
					PreparedStatement ps=con.prepareStatement("insert into stud_company values(?,?)");
	        		Statement stmt = con.createStatement();
	        		ps.setString(1,username);
	        		ps.setString(2,company);
	        		int j=ps.executeUpdate();
					
	        		
	        		System.out.println(url);
	        		Desktop desktop = java.awt.Desktop.getDesktop();
	  			  	URI oURL = new URI(url);
	  			  	desktop.browse(oURL);

	    		}
	    		else
	    		{
	    			UIManager UI=new UIManager();
                  	 UI.put("OptionPane.background", Color.white);
                  	 UI.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 15));
                  	 UI.put("Panel.background", Color.white);
                  	 UI.put("Button.background", new Color(82, 170, 255));
                  	 UI.put("Button.foreground",Color.WHITE);
                  	 UI.put("setFont",new Font("Arial", Font.PLAIN, 18));
                  	 JOptionPane.showMessageDialog(null,"You have already Applied","Error",JOptionPane.ERROR_MESSAGE);
	    			System.out.println("NOT ALLOWED");
	    		}
				}
				}

                    	
            	
            		catch(SQLException f) {
            		f.printStackTrace();
            			}
            		catch (Exception f) {
            		f.printStackTrace();
            			}
            		finally {
            			
            			}
			}
		});
		btnApply.setForeground(Color.WHITE);
		btnApply.setFont(new Font("Arial", Font.PLAIN, 15));
		btnApply.setBackground(SystemColor.textHighlight);
		btnApply.setBounds(580, 427, 136, 45);
		panel_1.add(btnApply);
		
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
		logout.setBorder(null);
		logout.setForeground(Color.WHITE);
		logout.setBackground(SystemColor.textHighlight);
		logout.setFont(new Font("Arial", Font.PLAIN, 15));
		logout.setBounds(499, 10, 136, 45);

		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				full_time_internship_0pportunities_assistant.stud_dashboard o = new full_time_internship_0pportunities_assistant.stud_dashboard(username);
				o.main(username);

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