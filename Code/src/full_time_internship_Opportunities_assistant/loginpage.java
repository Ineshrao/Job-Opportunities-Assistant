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
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.UIManager;
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
import javax.swing.JPasswordField;
import javax.swing.UIManager;
public class loginpage {


	private JFrame frame;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */

	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
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
	public loginpage() {
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
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(101, 78, 1354, 674);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel usernamelabel = new JLabel("Username");
		usernamelabel.setFont(new Font("Arial", Font.PLAIN, 20));
		usernamelabel.setBounds(838, 219, 145, 14);
		panel_2.add(usernamelabel);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(838, 244, 338, 50);
		panel_2.add(username);
		
		JLabel lblNewLabel_3 = new JLabel("Log-In into your account ");
		lblNewLabel_3.setBounds(781, 77, 458, 45);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 38));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("It's safe and secure");
		lblNewLabel_1_1.setBounds(929, 133, 188, 24);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1_1);
		
		JLabel passwordlabel = new JLabel("Password");
		passwordlabel.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordlabel.setBounds(838, 346, 145, 14);
		panel_2.add(passwordlabel);
		
		JButton btnNewButton = new JButton("LOG IN");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(82, 170, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userText;
	            String pwdText;
	            userText = username.getText();
	            pwdText = password.getText();
	            if (userText.equalsIgnoreCase("admin") && pwdText.equalsIgnoreCase("admin")) {
	            	
	    					frame.dispose();
	    					
	    					full_time_internship_0pportunities_assistant.dashboard o = new full_time_internship_0pportunities_assistant.dashboard();
	    					o.main(null);
	            } 
	            else {
	            	
	            	Connection con = null;
	            	String f1,f2;
	            	try {
	            		Class.forName("com.mysql.cj.jdbc.Driver");
	            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java",
	            		"root", "");
	            		if (!con.isClosed())
	            			System.out.println("Successfully connected to MySQL server...");
	            		String query = "Select count(*) FROM login_details where username = '"+userText+"' and password = '"+pwdText+"'";
	            		Statement stmt2 = con.createStatement();
	            		ResultSet rs = stmt2.executeQuery(query);
	            		rs.next();
	            		if(rs.getInt(1)==1){
	            			frame.dispose();
        					full_time_internship_0pportunities_assistant.stud_dashboard o = new full_time_internship_0pportunities_assistant.stud_dashboard(userText);
        					o.main(userText);
	                    } else {
	                     UIManager UI=new UIManager();
	                   	 UI.put("OptionPane.background", Color.white);
	                   	 UI.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 15));
	                   	 UI.put("Panel.background", Color.white);
	                   	 UI.put("Button.background", new Color(82, 170, 255));
	                   	 UI.put("Button.foreground",Color.WHITE);
	            		 UI.put("setFont",new Font("Arial", Font.PLAIN, 18));
	                   	 JOptionPane.showMessageDialog(null,"Invalid Credentials","Error",JOptionPane.ERROR_MESSAGE);
	                     System.out.println("failed");
	                    	}
	            	}
	            	catch(ClassNotFoundException f) {
	            		f.printStackTrace();
	            			}
	            		catch(SQLException f) {
	            		f.printStackTrace();
	            			}
	            		catch (Exception f) {
	            		f.printStackTrace();
	            			}
	            		finally {
	            			try {
	            				if (con != null)
	            				con.close();
	            				} 
	            			catch(SQLException f) {}
	            			}
				}
			}
			});
		btnNewButton.setBounds(933, 502, 168, 58);
		panel_2.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 246, 254));
		panel.setBounds(0, 0, 612, 674);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/images/sign.png")));
		lblNewLabel.setBounds(0, 117, 610, 557);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New here?");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(56, 46, 171, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("SIGN UP");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				full_time_internship_0pportunities_assistant.Signup o = new full_time_internship_0pportunities_assistant.Signup();
				o.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1.setBounds(153, 37, 124, 37);
		panel.add(btnNewButton_1);
		
		password = new JPasswordField();
		password.setBounds(838, 374, 338, 50);
		panel_2.add(password);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(239, 246, 254));
		panel_1_1.setBounds(711, 0, 836, 816);
		frame.getContentPane().add(panel_1_1);
	}
}

