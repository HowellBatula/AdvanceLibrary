package ClassLessons;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class AdminMain {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminMain window = new AdminMain();
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
	public AdminMain() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to NU Library System");
		lblNewLabel_1.setBounds(448, 26, 448, 49);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 212, 28));
		panel_2.setBounds(0, 418, 924, 86);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
	}
}
