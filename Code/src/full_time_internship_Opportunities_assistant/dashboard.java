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

public class dashboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard window = new dashboard();
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
	public dashboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root", "");
			if (!con.isClosed())
				System.out.println("Successfully connected to MySQL server...");
		
			String query = "Select * FROM company_details";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			String query2 = "Select count(*) FROM company_details";
    		Statement stmt2 = con.createStatement();
    		ResultSet rs2 = stmt2.executeQuery(query2);
    		rs2.next(); 
    		int i = rs2.getInt(1);
    		
    		
			
		
    		
    		//rs.next();
			
				//System.out.println(rs.getString(1));
				//System.out.println(rs.getString(2));
				//System.out.println(rs.getString(3));
		
		
		
		
		

		if(i==1)
		{
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 10, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			

			rs.next();
    		String Company = rs.getString(1);
			System.out.println();
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			
			
			JButton View = new JButton("view");
			View.setForeground(Color.WHITE);
			View.setBackground(SystemColor.textHighlight);
			View.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View.setBounds(1169, 10, 129, 59);

			View.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company);
					o.main(Company);
				}
			});
			panel_dyn.add(View);
			
			JLabel lblNewLabel = new JLabel("Name : "+rs.getString(1));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 363, 59);
			panel_dyn.add(lblNewLabel_1_2);
		}
		
		else if(i==2)
		{
			
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 10, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			
			JPanel panel_dyn1 = new JPanel();
			panel_dyn1.setBackground(Color.WHITE);
			panel_dyn1.setBounds(10, 99, 1308, 79);
			panel_1.add(panel_dyn1);
			panel_dyn1.setLayout(null);
			
			
    		rs.next();
    		
    		String Company = rs.getString(1);
    		
			JButton View = new JButton("view");
			View.setForeground(Color.WHITE);
			View.setBackground(SystemColor.textHighlight);
			View.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View.setBounds(1169, 10, 129, 59);
			View.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company);
					o.main(Company);
				}
			});
			panel_dyn.add(View);
			
			JLabel lblNewLabel = new JLabel("Name : "+rs.getString(1));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 363, 59);
			panel_dyn.add(lblNewLabel_1_2);
			
			rs.next();
    		String Company1 = rs.getString(1);
			JButton View1 = new JButton("view");
			View1.setForeground(Color.WHITE);
			View1.setBackground(SystemColor.textHighlight);
			View1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View1.setBounds(1169, 10, 129, 59);

			View1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company1);
					o.main(Company1);
				}
			});
			panel_dyn1.add(View1);
			
			JLabel lblNewLabel1 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel1.setBounds(30, 10, 249, 59);
			panel_dyn1.add(lblNewLabel1);
			
			JLabel lblNewLabel_11 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_11.setBounds(376, 10, 249, 59);
			panel_dyn1.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_21 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_21.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_21.setBounds(701, 10, 363, 59);
			panel_dyn1.add(lblNewLabel_1_21);
		}
		
		else if(i==3)
		{
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 10, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			
			JPanel panel_dyn1 = new JPanel();
			panel_dyn1.setBackground(Color.WHITE);
			panel_dyn1.setBounds(10, 99, 1308, 79);
			panel_1.add(panel_dyn1);
			panel_dyn1.setLayout(null);
			
			JPanel panel_dyn2 = new JPanel();
			panel_dyn2.setBackground(Color.WHITE);
			panel_dyn2.setBounds(10, 188, 1308, 79);
			panel_1.add(panel_dyn2);
			panel_dyn2.setLayout(null);
			
    		rs.next();
    		String Company = rs.getString(1);

			JButton View = new JButton("view");
			View.setForeground(Color.WHITE);
			View.setBackground(SystemColor.textHighlight);
			View.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View.setBounds(1169, 10, 129, 59);

			View.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company);
					o.main(Company);
				}
			});
			panel_dyn.add(View);
			
			JLabel lblNewLabel = new JLabel("Name : "+rs.getString(1));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 363, 59);
			panel_dyn.add(lblNewLabel_1_2);
			
			rs.next();
    		String Company2 = rs.getString(1);
			JButton View1 = new JButton("view");
			View1.setForeground(Color.WHITE);
			View1.setBackground(SystemColor.textHighlight);
			View1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View1.setBounds(1169, 10, 129, 59);

			View1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company2);
					o.main(Company2);
				}
			});
			panel_dyn1.add(View1);
			
			JLabel lblNewLabel1 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel1.setBounds(30, 10, 249, 59);
			panel_dyn1.add(lblNewLabel1);
			
			JLabel lblNewLabel_11 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_11.setBounds(376, 10, 249, 59);
			panel_dyn1.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_21 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_21.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_21.setBounds(701, 10, 363, 59);
			panel_dyn1.add(lblNewLabel_1_21);
			
			rs.next();
    		String Company1 = rs.getString(1);
			JButton View2 = new JButton("view");
			View2.setForeground(Color.WHITE);
			View2.setBackground(SystemColor.textHighlight);
			View2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View2.setBounds(1169, 10, 129, 59);

			View2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company1);
					o.main(Company1);
				}
			});
			panel_dyn2.add(View2);
			
			JLabel lblNewLabel2 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel2.setBounds(30, 10, 249, 59);
			panel_dyn2.add(lblNewLabel2);
			
			JLabel lblNewLabel_12 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_12.setBounds(376, 10, 249, 59);
			panel_dyn2.add(lblNewLabel_12);
			
			JLabel lblNewLabel_1_22 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_22.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_22.setBounds(701, 10, 363, 59);
			panel_dyn2.add(lblNewLabel_1_22);
			
		}
		else if(i==4)
		{
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 10, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);
			
			JPanel panel_dyn1 = new JPanel();
			panel_dyn1.setBackground(Color.WHITE);
			panel_dyn1.setBounds(10, 99, 1308, 79);
			panel_1.add(panel_dyn1);
			panel_dyn1.setLayout(null);
			
			JPanel panel_dyn2 = new JPanel();
			panel_dyn2.setBackground(Color.WHITE);
			panel_dyn2.setBounds(10, 188, 1308, 79);
			panel_1.add(panel_dyn2);
			panel_dyn2.setLayout(null);
			
			JPanel panel_dyn3 = new JPanel();
			panel_dyn3.setBackground(Color.WHITE);
			panel_dyn3.setBounds(10, 277, 1308, 79);
			panel_1.add(panel_dyn3);
			panel_dyn3.setLayout(null);
			
			rs.next();
    		String Company = rs.getString(1);
			JButton View = new JButton("view");
			View.setForeground(Color.WHITE);
			View.setBackground(SystemColor.textHighlight);
			View.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View.setBounds(1169, 10, 129, 59);

			View.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company);
					o.main(Company);
				}
			});
			panel_dyn.add(View);
			
			JLabel lblNewLabel = new JLabel("Name : "+rs.getString(1));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 363, 59);
			panel_dyn.add(lblNewLabel_1_2);
			
			rs.next();
    		String Company1 = rs.getString(1);
			JButton View1 = new JButton("view");
			View1.setForeground(Color.WHITE);
			View1.setBackground(SystemColor.textHighlight);
			View1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View1.setBounds(1169, 10, 129, 59);

			View1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company1);
					o.main(Company1);
				}
			});
			panel_dyn1.add(View1);
			
			JLabel lblNewLabel1 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel1.setBounds(30, 10, 249, 59);
			panel_dyn1.add(lblNewLabel1);
			
			JLabel lblNewLabel_11 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_11.setBounds(376, 10, 249, 59);
			panel_dyn1.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_21 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_21.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_21.setBounds(701, 10, 363, 59);
			panel_dyn1.add(lblNewLabel_1_21);
			
			
			rs.next();
			
    		String Company2 = rs.getString(1);
			JButton View2 = new JButton("view");
			View2.setForeground(Color.WHITE);
			View2.setBackground(SystemColor.textHighlight);
			View2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View2.setBounds(1169, 10, 129, 59);

			View2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company2);
					o.main(Company2);
				}
			});
			panel_dyn2.add(View2);
			
			JLabel lblNewLabel2 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel2.setBounds(30, 10, 249, 59);
			panel_dyn2.add(lblNewLabel2);
			
			JLabel lblNewLabel_12 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_12.setBounds(376, 10, 249, 59);
			panel_dyn2.add(lblNewLabel_12);
			
			JLabel lblNewLabel_1_22 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_22.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_22.setBounds(701, 10, 363, 59);
			panel_dyn2.add(lblNewLabel_1_22);
			
			rs.next();
    		String Company3 = rs.getString(1);
			JButton View3 = new JButton("view");
			View3.setForeground(Color.WHITE);
			View3.setBackground(SystemColor.textHighlight);
			View3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View3.setBounds(1169, 10, 129, 59);

			View3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company3);
					o.main(Company3);
				}
			});
			panel_dyn3.add(View3);
			
			JLabel lblNewLabel3 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel3.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel3.setBounds(30, 10, 249, 59);
			panel_dyn3.add(lblNewLabel3);
			
			JLabel lblNewLabel_13 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_13.setBounds(376, 10, 249, 59);
			panel_dyn3.add(lblNewLabel_13);
			
			JLabel lblNewLabel_1_23 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_23.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_23.setBounds(701, 10, 363, 59);
			panel_dyn3.add(lblNewLabel_1_23);
		}
		
		else if(i==5)
		{
			JPanel panel_dyn = new JPanel();
			panel_dyn.setBackground(Color.WHITE);
			panel_dyn.setBounds(10, 10, 1308, 79);
			panel_1.add(panel_dyn);
			panel_dyn.setLayout(null);

			JPanel panel_dyn1 = new JPanel();
			panel_dyn1.setBackground(Color.WHITE);
			panel_dyn1.setBounds(10, 99, 1308, 79);
			panel_1.add(panel_dyn1);
			panel_dyn1.setLayout(null);
			
			JPanel panel_dyn2 = new JPanel();
			panel_dyn2.setBackground(Color.WHITE);
			panel_dyn2.setBounds(10, 188, 1308, 79);
			panel_1.add(panel_dyn2);
			panel_dyn2.setLayout(null);
			
			JPanel panel_dyn3 = new JPanel();
			panel_dyn3.setBackground(Color.WHITE);
			panel_dyn3.setBounds(10, 277, 1308, 79);
			panel_1.add(panel_dyn3);
			panel_dyn3.setLayout(null);
			
			JPanel panel_dyn4 = new JPanel();
			panel_dyn4.setBackground(Color.WHITE);
			panel_dyn4.setBounds(10, 366, 1308, 79);
			panel_1.add(panel_dyn4);
			panel_dyn4.setLayout(null);
			
			rs.next();
    		String Company = rs.getString(1);
			JButton View = new JButton("view");
			View.setForeground(Color.WHITE);
			View.setBackground(SystemColor.textHighlight);
			View.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View.setBounds(1169, 10, 129, 59);

			View.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company);
					o.main(Company);
				}
			});
			panel_dyn.add(View);
			
			JLabel lblNewLabel = new JLabel("Name : "+rs.getString(1));
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel.setBounds(30, 10, 249, 59);
			panel_dyn.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1.setBounds(376, 10, 249, 59);
			panel_dyn.add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_2.setBounds(701, 10, 363, 59);
			panel_dyn.add(lblNewLabel_1_2);
			rs.next();    		
			String Company1 = rs.getString(1);
			JButton View1 = new JButton("view");
			View1.setForeground(Color.WHITE);
			View1.setBackground(SystemColor.textHighlight);
			View1.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View1.setBounds(1169, 10, 129, 59);

			View1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company1);
					o.main(Company1);
				}
			});
			panel_dyn1.add(View1);
			
			JLabel lblNewLabel1 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel1.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel1.setBounds(30, 10, 249, 59);
			panel_dyn1.add(lblNewLabel1);
			
			JLabel lblNewLabel_11 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_11.setBounds(376, 10, 249, 59);
			panel_dyn1.add(lblNewLabel_11);
			
			JLabel lblNewLabel_1_21 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_21.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_21.setBounds(701, 10, 363, 59);
			panel_dyn1.add(lblNewLabel_1_21);
			rs.next();
    		String Company2 = rs.getString(1);
			JButton View2 = new JButton("view");
			View2.setForeground(Color.WHITE);
			View2.setBackground(SystemColor.textHighlight);
			View2.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View2.setBounds(1169, 10, 129, 59);

			View2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company2);
					o.main(Company2);
				}
			});
			panel_dyn2.add(View2);
			
			JLabel lblNewLabel2 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel2.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel2.setBounds(30, 10, 249, 59);
			panel_dyn2.add(lblNewLabel2);
			
			JLabel lblNewLabel_12 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_12.setBounds(376, 10, 249, 59);
			panel_dyn2.add(lblNewLabel_12);
			
			JLabel lblNewLabel_1_22 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_22.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_22.setBounds(701, 10, 363, 59);
			panel_dyn2.add(lblNewLabel_1_22);
			rs.next();
    		String Company3 = rs.getString(1);
			JButton View3 = new JButton("view");
			View3.setForeground(Color.WHITE);
			View3.setBackground(SystemColor.textHighlight);
			View3.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View3.setBounds(1169, 10, 129, 59);

			View3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company3);
					o.main(Company3);
				}
			});
			panel_dyn3.add(View3);
			
			JLabel lblNewLabel3 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel3.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel3.setBounds(30, 10, 249, 59);
			panel_dyn3.add(lblNewLabel3);
			
			JLabel lblNewLabel_13 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_13.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_13.setBounds(376, 10, 249, 59);
			panel_dyn3.add(lblNewLabel_13);
			
			JLabel lblNewLabel_1_23 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_23.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_23.setBounds(701, 10, 363, 59);
			panel_dyn3.add(lblNewLabel_1_23);
			rs.next();
    		String Company4 = rs.getString(1);
			JButton View4 = new JButton("view");
			View4.setForeground(Color.WHITE);
			View4.setBackground(SystemColor.textHighlight);
			View4.setFont(new Font("Tahoma", Font.PLAIN, 20));
			View4.setBounds(1169, 10, 129, 59);

			View4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame.dispose();
					
					full_time_internship_0pportunities_assistant.details o = new full_time_internship_0pportunities_assistant.details(Company4);
					o.main(Company4);
				}
			});
			panel_dyn4.add(View4);
			
			JLabel lblNewLabel4 = new JLabel("Name : "+rs.getString(1));
			lblNewLabel4.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel4.setBounds(30, 10, 249, 59);
			panel_dyn4.add(lblNewLabel4);
			
			JLabel lblNewLabel_14 = new JLabel("Type : "+rs.getString(2));
			lblNewLabel_14.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_14.setBounds(376, 10, 249, 59);
			panel_dyn4.add(lblNewLabel_14);
			
			JLabel lblNewLabel_1_24 = new JLabel("Students Registered : "+rs.getString(3));
			lblNewLabel_1_24.setFont(new Font("Arial", Font.PLAIN, 25));
			lblNewLabel_1_24.setBounds(701, 10, 363, 59);
			panel_dyn4.add(lblNewLabel_1_24);
			
		}
		
		
		
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
		
		JButton logout = new JButton("LOG OUT");
		logout.setForeground(Color.WHITE);
		logout.setBackground(SystemColor.textHighlight);
		logout.setFont(new Font("Arial", Font.PLAIN, 15));
		logout.setBounds(499, 10, 136, 45);
		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				full_time_internship_0pportunities_assistant.loginpage o = new full_time_internship_0pportunities_assistant.loginpage();
				o.main(null);
			}
		});
		panel.add(logout);
		
		JButton add = new JButton("ADD");
		add.setForeground(Color.BLACK);
		add.setFont(new Font("Arial", Font.PLAIN, 15));
		add.setBackground(Color.WHITE);
		add.setBounds(327, 10, 136, 45);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				full_time_internship_0pportunities_assistant.Addcomp o = new full_time_internship_0pportunities_assistant.Addcomp();
				o.main(null);
			}
		});
		panel.add(add);
		
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
