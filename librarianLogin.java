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

public class librarianLogin {

	private JFrame frame;
	private JTextField username;
	private JPasswordField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					librarianLogin window = new librarianLogin();
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
	public librarianLogin() {
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
		userLogo.setBounds(519, 0, 24, 40);
		userLogo.setIcon(new ImageIcon(librarianLogin.class.getResource("/images/user (3).png")));
		panel_1.add(userLogo);
		
		JLabel passwordLogo = new JLabel("");
		passwordLogo.setBounds(519, 44, 24, 31);
		passwordLogo.setIcon(new ImageIcon(librarianLogin.class.getResource("/images/padlock (1).png")));
		panel_1.add(passwordLogo);
		

		Password = new JPasswordField();
		Password.setToolTipText("Password");
		Password.setText("Password");
		Password.setBounds(454, 288, 140, 20);
		Password.addFocusListener(new FocusListener() {
            public void focusGained(FocusEvent e) {
                // Clear the text when the field is focused
                Password.setText("");
                Password.setForeground(Color.BLACK);
            }

            public void focusLost(FocusEvent e) {
                // Restore the prompt when the field loses focus and is empty
                if (Password.getPassword().length == 0) {
                    Password.setText("Enter password...");
                    Password.setForeground(Color.GRAY);
                }
            } });

		Password.setBounds(555, 55, 196, 20);
		panel_1.add(Password);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 212, 28));
		panel_2.setBounds(0, 418, 924, 86);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("LIBRARIAN LOGIN");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(528, 205, 321, 44);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton logoutButton = new JButton("");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(null);
				frame.setVisible(false);
			}
		});
		logoutButton.setBackground(new Color(53, 64, 142));
		logoutButton.setIcon(new ImageIcon(librarianLogin.class.getResource("/images/logout.png")));
		logoutButton.setBounds(815, 515, 81, 52);
		frame.getContentPane().add(logoutButton);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = username.getText();
				char[] pass = Password.getPassword();
				String passwordString = new String(pass);
				
				String[] users = {"Librarian_01", "Librarian_02","Librarian_03"};
				String[] passwords = {"LibOne", "LibTwo","LibThree"};
				
				//Admin 1 information is correct
				   if (user.contains(users[0]) && passwordString.contains(passwords[0])){
					   username.setText(null);
					   Password.setText(null);
					   LibrarianMain.main(null);
					   frame.setVisible(false);
					}
				 //Admin 2 information is correct
					   else if (user.contains(users[1])& passwordString.contains(passwords[1])) {
						   username.setText(null);
						   Password.setText(null);	
						   LibrarianMain.main(null);
						   frame.setVisible(false);
						 //Admin 3 information is correct
				   }   else if (user.contains(users[2])& passwordString.contains(passwords[2])) {
					   username.setText(null);
					   Password.setText(null);	
					   LibrarianMain.main(null);
					   frame.setVisible(false); 
					   //IF user name is correct and password is not 		
				   } else {
					   JOptionPane.showMessageDialog(null, "Invalid Login Details", "Erorr Logging In", JOptionPane.ERROR_MESSAGE);
					  username.setText(null);
					  Password.setText(null);
				   }			
				  }
				
		});
		loginButton.setBounds(604, 352, 89, 23);
		frame.getContentPane().add(loginButton);
		
	}
	}

