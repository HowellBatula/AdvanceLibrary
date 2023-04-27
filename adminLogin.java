package ClassLessons;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class adminLogin {

	private JFrame frame;
	private JTextField username;
	private JTextField textField_1;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					adminLogin window = new adminLogin();
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
	public adminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(53, 64, 142));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Library.class.getResource("/images/National_University_seal.png")));
		frame.setTitle("National University Library");
		frame.setBounds(100, 100, 938, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(138, 102, 306, 375);
		frame.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Library.class.getResource("/images/National_University_seal.png")));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 212, 28));
		panel.setBounds(0, 76, 924, 99);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 212, 28));
		panel_1.setBounds(0, 255, 924, 86);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		username = new JTextField();
		username.setBounds(555, 11, 196, 20);
		panel_1.add(username);
		username.setText("Phone, email, or username");
		username.setColumns(10);
		username.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                // Clear the text when the field is focused
            	username.setText("");
            	username.setForeground(Color.BLACK);
            }

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				if (username.getText().length() == 0) {
                   username.setText("Username");
			}
          	
			} });
		
		JLabel userLogo = new JLabel("");
		userLogo.setBounds(511, 0, 31, 39);
		panel_1.add(userLogo);
		userLogo.setIcon(new ImageIcon(adminLogin.class.getResource("/images/user (3).png")));
		
		JLabel passLogo = new JLabel("");
		passLogo.setIcon(new ImageIcon(adminLogin.class.getResource("/images/padlock (1).png")));
		passLogo.setBounds(511, 47, 31, 28);
		panel_1.add(passLogo);
		
		password = new JPasswordField();
		password.setToolTipText("Password");
		password.setText("Password");
		password.setBounds(454, 288, 140, 20);
		password.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                // Clear the text when the field is focused
                password.setText("");
                password.setForeground(Color.BLACK);
            }

            public void focusLost(FocusEvent e) {
                // Restore the prompt when the field loses focus and is empty
                if (password.getPassword().length == 0) {
                    password.setText("Enter password...");
                    password.setForeground(Color.GRAY);
                }
            } });

		password.setBounds(555, 55, 196, 20);
		panel_1.add(password);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 212, 28));
		panel_2.setBounds(0, 418, 924, 86);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel adminText = new JLabel("ADMIN LOGIN");
		adminText.setForeground(new Color(255, 255, 255));
		adminText.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		adminText.setBounds(547, 200, 234, 46);
		frame.getContentPane().add(adminText);
		
		JButton logoutButton = new JButton("");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(null);
				frame.setVisible(false);
			}
		});
		logoutButton.setBackground(new Color(53, 64, 142));
		logoutButton.setIcon(new ImageIcon(adminLogin.class.getResource("/images/logout.png")));
		logoutButton.setBounds(840, 531, 74, 52);
		frame.getContentPane().add(logoutButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = username.getText();
				char[] pass = password.getPassword();
				String passwordString = new String(pass);
				
				String[] users = {"Admin_01", "Admin_02","Admin_03"};
				String[] passwords = {"AdminOne", "AdminTwo","AdminThree"};
				
				//Admin 1 information is correct
				   if (user.contains(users[0]) && passwordString.contains(passwords[0])){
					   username.setText(null);
					   password.setText(null);
					   AdminMain.main(null);
					   frame.setVisible(false);
					}
				 //Admin 2 information is correct
					   else if (user.contains(users[1])& passwordString.contains(passwords[1])) {
						   username.setText(null);
						   password.setText(null);	
						   AdminMain.main(null);
						   frame.setVisible(false);
						 //Admin 3 information is correct
				   }   else if (user.contains(users[2])& passwordString.contains(passwords[2])) {
					   username.setText(null);
					   password.setText(null);	
					   AdminMain.main(null);
					   frame.setVisible(false); 
					   //IF user name is correct and password is not 		
				   } else {
					   JOptionPane.showMessageDialog(null, "Invalid Login Details", "Erorr Logging In", JOptionPane.ERROR_MESSAGE);
					  username.setText(null);
					  password.setText(null);
				   }			
				  }				
		});
		loginButton.setBounds(611, 352, 89, 23);
		frame.getContentPane().add(loginButton);
	}
}
