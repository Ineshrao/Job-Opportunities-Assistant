package full_time_internship_0pportunities_assistant;

import java.awt.EventQueue;
import java.util.regex.Matcher;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import java.util.regex.Pattern;
public class Signup {

	private JFrame frame;
	private JTextField lname;
	private JTextField fname;
	private JTextField email;
	private JTextField num;
	private JTextField username;
	private JTextField password;
	private JTextField cgpa;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup window = new Signup();
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
	public Signup() {
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
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(365, 255, 287, 31);
		panel_2.add(lname);
		
		JLabel lblNewLabel_2_2 = new JLabel("First Name");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(46, 222, 145, 31);
		panel_2.add(lblNewLabel_2_2);
		
		fname = new JTextField();
		fname.setColumns(10);
		fname.setBounds(46, 255, 287, 31);
		panel_2.add(fname);
		
		JLabel lblNewLabel_3 = new JLabel("Create your account ");
		lblNewLabel_3.setBounds(160, 100, 382, 45);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 38));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("It's free and easy");
		lblNewLabel_1_1.setBounds(275, 158, 152, 24);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Last Name");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(365, 230, 145, 14);
		panel_2.add(lblNewLabel_2_2_1);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(46, 344, 287, 31);
		panel_2.add(email);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Email");
		lblNewLabel_2_2_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_2.setBounds(46, 314, 145, 24);
		panel_2.add(lblNewLabel_2_2_2);
		
		num = new JTextField();
		num.setColumns(10);
		num.setBounds(365, 344, 287, 31);
		panel_2.add(num);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Mobile Number");
		lblNewLabel_2_2_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_1_1.setBounds(365, 319, 145, 14);
		panel_2.add(lblNewLabel_2_2_1_1);
		
		username = new JTextField();
		
		username.setColumns(10);
		username.setBounds(46, 445, 287, 31);
		panel_2.add(username);
		
		JLabel lblNewLabel_2_2_3 = new JLabel("Username");
		lblNewLabel_2_2_3.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_3.setBounds(46, 420, 145, 20);
		panel_2.add(lblNewLabel_2_2_3);
		
		password = new JTextField();
		password.setColumns(10);
		password.setBounds(365, 445, 287, 31);
		panel_2.add(password);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Password");
		lblNewLabel_2_2_1_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_1_2.setBounds(365, 420, 145, 20);
		panel_2.add(lblNewLabel_2_2_1_2);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(82, 170, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userText;
	            String pwdText;
	            String lnam;
	            String fnam;
	            String emai;
	            String nu;
	            String cgp;
	            userText = username.getText();
	            pwdText = password.getText();
	            lnam = lname.getText();
	            fnam = fname.getText();
	            emai = email.getText();
	            nu = num.getText();
	            cgp = cgpa.getText();
            	
            	//boolean selected = chash.isSelected();
                //if (selected) {
                //    System.out.println("Check box state is selected.");
                //} else {
                //    System.out.println("Check box state is not selected.");
                //}
	            Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
	            Matcher mat = pattern.matcher(emai);

            	float c = Float.parseFloat(cgp);
            	Long n = Long.parseLong(nu);
            	int len = String.valueOf(n).length();
            	if(len==10  &&  c<=10&&c>=0 && mat.matches()  && userText!=null && pwdText!=null && lnam!=null && fnam!=null)
            	{
            		
	            Connection con = null;
            	try {
            		Class.forName("com.mysql.cj.jdbc.Driver");
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java",
            		"root", "");
            		if (!con.isClosed())
            			System.out.println("Successfully connected to MySQL server...");
            		String query = "Select count(*) FROM login_details where username = '"+userText+"'";
            		Statement stmt2 = con.createStatement();
            		ResultSet rs = stmt2.executeQuery(query);
            		rs.next();
            		if(rs.getInt(1)==1){
            			System.out.println("Error");
                    } else {
                    	
                    	
                    	
                    	
                    	
                    	
                    	PreparedStatement ps=con.prepareStatement("insert into student_details values(?,?,?,?,?,?)");
                		Statement stmt = con.createStatement();
                		ps.setString(1,userText);
                		ps.setString(2,fnam);
                		ps.setString(3,lnam);
                		ps.setString(4,emai);
                		ps.setString(5,nu);
                		ps.setString(6,cgp);
                		int i=ps.executeUpdate();
                		
                		
                		PreparedStatement ps1=con.prepareStatement("insert into login_details values(?,?)");
                		Statement stmt1 = con.createStatement();
                		ps1.setString(1,userText);
                		ps1.setString(2,pwdText);
                		int j=ps1.executeUpdate();
                		
                		frame.dispose();
        				full_time_internship_0pportunities_assistant.loginpage o = new full_time_internship_0pportunities_assistant.loginpage();
        				o.main(null);
                		
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
            	else
            	{
            		 UIManager UI=new UIManager();
                  	 UI.put("OptionPane.background", Color.white);
                  	 UI.put("OptionPane.messageFont", new Font("Arial", Font.PLAIN, 15));
                  	 UI.put("Panel.background", Color.white);
                  	 UI.put("Button.background", new Color(82, 170, 255));
                  	 UI.put("Button.foreground",Color.WHITE);
                  	 UI.put("setFont",new Font("Arial", Font.PLAIN, 18));
                  	 JOptionPane.showMessageDialog(null,"Invalid Details, please check.","Error",JOptionPane.ERROR_MESSAGE);
            	}
			}
		});
		
		cgpa = new JTextField();
		cgpa.setColumns(10);
		cgpa.setBounds(247, 518, 219, 31);
		panel_2.add(cgpa);
		
		JLabel lblNewLabel_2_2_3_1 = new JLabel("CGPA");
		lblNewLabel_2_2_3_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_3_1.setBounds(179, 521, 204, 24);
		panel_2.add(lblNewLabel_2_2_3_1);
		btnNewButton.setBounds(46, 587, 168, 58);
		panel_2.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 246, 254));
		panel.setBounds(709, 0, 645, 674);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/images/sign.png")));
		lblNewLabel.setBounds(25, 117, 610, 557);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Already a member?");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(25, 46, 171, 19);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("LOG IN");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				full_time_internship_0pportunities_assistant.loginpage o = new full_time_internship_0pportunities_assistant.loginpage();
				o.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 13));
		btnNewButton_1.setBounds(174, 37, 124, 37);
		panel.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(239, 246, 254));
		panel_1_1.setBounds(0, 0, 811, 816);
		frame.getContentPane().add(panel_1_1);
	}
}
