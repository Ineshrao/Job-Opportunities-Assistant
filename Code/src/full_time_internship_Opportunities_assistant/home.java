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
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

public class home {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home window = new home();
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
	public home() {
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
		
		JLabel lblNewLabel_3 = new JLabel("Full-Time/Internship");
		lblNewLabel_3.setBounds(61, 209, 946, 65);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 60));
		panel_2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton.setBackground(new Color(82, 170, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				full_time_internship_0pportunities_assistant.Signup o = new full_time_internship_0pportunities_assistant.Signup();
				o.main(null);
			}
		});
		btnNewButton.setBounds(156, 388, 168, 58);
		panel_2.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(239, 246, 254));
		panel.setBounds(709, 0, 645, 674);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Signup.class.getResource("/images/sign.png")));
		lblNewLabel.setBounds(42, 132, 593, 542);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3_1 = new JLabel(" Opportunities Assistant");
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel_3_1.setBounds(56, 270, 414, 50);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("OODJ MINI PROJECT");
		lblNewLabel_1_1.setBounds(447, 270, 200, 24);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		JButton btnNewButton_1 = new JButton("LOG IN");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(82, 170, 255));
		btnNewButton_1.setBounds(368, 388, 168, 58);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				full_time_internship_0pportunities_assistant.loginpage o = new full_time_internship_0pportunities_assistant.loginpage();
				o.main(null);
			}
		});
		panel_2.add(btnNewButton_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(239, 246, 254));
		panel_1_1.setBounds(0, 0, 811, 816);
		frame.getContentPane().add(panel_1_1);
	}

}
