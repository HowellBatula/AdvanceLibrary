package ClassLessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Library {

	private JFrame frmNationalUniversityLibrary;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Library window = new Library();
					window.frmNationalUniversityLibrary.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Library() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNationalUniversityLibrary = new JFrame();
		frmNationalUniversityLibrary.getContentPane().setBackground(new Color(53, 64, 142));
		frmNationalUniversityLibrary.setIconImage(Toolkit.getDefaultToolkit().getImage(Library.class.getResource("/images/National_University_seal.png")));
		frmNationalUniversityLibrary.setTitle("National University Library");
		frmNationalUniversityLibrary.setBounds(100, 100, 938, 631);
		frmNationalUniversityLibrary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNationalUniversityLibrary.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(138, 102, 306, 375);
		frmNationalUniversityLibrary.getContentPane().add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(Library.class.getResource("/images/National_University_seal.png")));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 212, 28));
		panel.setBounds(0, 76, 924, 99);
		frmNationalUniversityLibrary.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 212, 28));
		panel_1.setBounds(0, 255, 924, 86);
		frmNationalUniversityLibrary.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 212, 28));
		panel_2.setBounds(0, 418, 924, 86);
		frmNationalUniversityLibrary.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminLogin.main(null);
				frmNationalUniversityLibrary.setVisible(false);
			}
		});
		btnNewButton.setBounds(569, 191, 183, 53);
		frmNationalUniversityLibrary.getContentPane().add(btnNewButton);
		
		JButton btnLibrarianLogin = new JButton("LIBRARIAN");
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				librarianLogin.main(null);
				frmNationalUniversityLibrary.setVisible(false);
				
			}
		});
		btnLibrarianLogin.setBounds(569, 352, 183, 53);
		frmNationalUniversityLibrary.getContentPane().add(btnLibrarianLogin);
	}
}
