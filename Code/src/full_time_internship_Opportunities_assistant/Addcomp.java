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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class Addcomp {

	private JFrame frame;
	private JTextField ccgpa;
	private JTextField cname;
	private JTextField cemail;
	private JTextField cnum;

	private JTextField link;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Addcomp window = new Addcomp();
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
	public Addcomp() {
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
		
		ccgpa = new JTextField();
		ccgpa.setColumns(10);
		ccgpa.setBounds(365, 380, 287, 31);
		panel_2.add(ccgpa);
		
		JLabel lblNewLabel_2_2 = new JLabel("Company Name");
		lblNewLabel_2_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(46, 258, 152, 31);
		panel_2.add(lblNewLabel_2_2);
		
		cname = new JTextField();
		cname.setColumns(10);
		cname.setBounds(46, 291, 287, 31);
		panel_2.add(cname);
		
		JLabel lblNewLabel_3 = new JLabel("Add a Company");
		lblNewLabel_3.setBounds(213, 144, 382, 45);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 38));
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_1 = new JLabel("It's helpful");
		lblNewLabel_1_1.setBounds(302, 196, 152, 24);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_2.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Required CGPA");
		lblNewLabel_2_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(365, 351, 145, 22);
		panel_2.add(lblNewLabel_2_2_1);
		
		cemail = new JTextField();
		cemail.setColumns(10);
		cemail.setBounds(46, 380, 287, 31);
		panel_2.add(cemail);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Email");
		lblNewLabel_2_2_2.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_2.setBounds(46, 350, 145, 24);
		panel_2.add(lblNewLabel_2_2_2);
		
		cnum = new JTextField();
		cnum.setColumns(10);
		cnum.setBounds(365, 291, 287, 31);
		panel_2.add(cnum);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Contact Number");
		lblNewLabel_2_2_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_1_1.setBounds(365, 266, 168, 14);
		panel_2.add(lblNewLabel_2_2_1_1);
		
		String[] optionsToChoose = {"Full Time", "Internship"};
		

		JComboBox<String> ctype = new JComboBox<>(optionsToChoose);
		ctype.setFont(new Font("Arial", Font.PLAIN, 15));
		ctype.setBounds(46, 464, 287, 31);
		panel_2.add(ctype);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Type");
		lblNewLabel_2_2_2_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_2_1.setBounds(46, 434, 145, 24);
		panel_2.add(lblNewLabel_2_2_2_1);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(82, 170, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

	            String cgpa;
	            String name;
	            String email;
	            String num;
	            String lin;
	            String typ;
	            int reg=0;
	            cgpa = ccgpa.getText();
	            name = cname.getText();
	            email = cemail.getText();
	            num = cnum.getText();
	            typ = ctype.getItemAt(ctype.getSelectedIndex());
	            lin = link.getText();
            	
            	//boolean selected = chash.isSelected();
                //if (selected) {
                //    System.out.println("Check box state is selected.");
                //} else {
                //    System.out.println("Check box state is not selected.");
                //}
	            Pattern pattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
	            Matcher mat = pattern.matcher(email);

            	float c = Float.parseFloat(cgpa);
            	Long n = Long.parseLong(num);
            	int len = String.valueOf(n).length();
            	if(len==10  &&  c<=10&&c>=0 && mat.matches()  && name!=null && typ!=null && lin!=null)
            	{
	            Connection con = null;
            	try {
            		Class.forName("com.mysql.cj.jdbc.Driver");
            		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java",
            		"root", "");
            		if (!con.isClosed())
            			System.out.println("Successfully connected to MySQL server...");
            		 
                    	PreparedStatement ps=con.prepareStatement("insert into company_details values(?,?,?,?,?,?,?)");
                		Statement stmt = con.createStatement();
                		ps.setString(1,name);
                		ps.setString(2,typ);
                		ps.setInt(3,reg);
                		ps.setString(4,email);
                		ps.setString(5,num);
                		ps.setString(6,cgpa);
                		ps.setString(7,lin);
                		int i=ps.executeUpdate();
                		

                		
                		frame.dispose();
        				full_time_internship_0pportunities_assistant.dashboard o = new full_time_internship_0pportunities_assistant.dashboard();
        				o.main(null);
                		
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
		btnNewButton.setBounds(269, 578, 168, 58);
		panel_2.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 246, 254));
		panel.setBounds(709, 0, 645, 674);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Addcomp.class.getResource("/images/sign.png")));
		lblNewLabel.setBounds(25, 117, 610, 557);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				full_time_internship_0pportunities_assistant.dashboard o = new full_time_internship_0pportunities_assistant.dashboard();
				o.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton_1.setBounds(491, 21, 133, 43);
		panel.add(btnNewButton_1);
		
		
		
		link = new JTextField();
		link.setColumns(10);
		link.setBounds(365, 464, 287, 31);
		panel_2.add(link);
		
		JLabel lblNewLabel_2_2_2_1_1 = new JLabel("Registration site");
		lblNewLabel_2_2_2_1_1.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel_2_2_2_1_1.setBounds(365, 434, 152, 24);
		panel_2.add(lblNewLabel_2_2_2_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(239, 246, 254));
		panel_1_1.setBounds(0, 0, 811, 816);
		frame.getContentPane().add(panel_1_1);
	}
}
