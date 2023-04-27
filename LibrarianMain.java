package ClassLessons;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class  LibrarianMain {

	private JFrame frame;
	private JTextField txtNoOfBook;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarianMain window = new LibrarianMain();
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
	public LibrarianMain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		inventory book1 = new inventory("System Analysis and Design","Gary B. Shelly", 2);
		inventory book2 = new inventory("Android Application","Corinne Hoisington", 3);
		inventory book3 = new inventory("Programming Concepts and Logic Formulation","Rosauro E. Manuel", 4);
		
		inventory[] books = { book1, book2, book3 };
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(53, 64, 142));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Library.class.getResource("/images/National_University_seal.png")));
		frame.setTitle("National University Library");
		frame.setBounds(100, 100, 938, 631);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Logo = new JLabel("");
		Logo.setBounds(138, 102, 306, 375);
		frame.getContentPane().add(Logo);
		Logo.setIcon(new ImageIcon(Library.class.getResource("/images/National_University_seal.png")));
		
		JPanel yellow1 = new JPanel();
		yellow1.setBackground(new Color(255, 212, 28));
		yellow1.setBounds(0, 76, 924, 99);
		frame.getContentPane().add(yellow1);
		yellow1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Books Available");
		lblNewLabel_1.setBounds(450, 39, 448, 49);
		yellow1.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		
		JPanel yellow2 = new JPanel();
		yellow2.setBackground(new Color(255, 212, 28));
		yellow2.setBounds(0, 255, 924, 86);
		frame.getContentPane().add(yellow2);
		yellow2.setLayout(null);
			
		JPanel yellow3 = new JPanel();
		yellow3.setBackground(new Color(255, 212, 28));
		yellow3.setBounds(0, 418, 924, 86);
		frame.getContentPane().add(yellow3);
		yellow3.setLayout(null);
		
		txtNoOfBook = new JTextField();
		txtNoOfBook.setBounds(608, 28, 46, 20);
		yellow3.add(txtNoOfBook);
		txtNoOfBook.setColumns(10);
		
		JLabel rentText = new JLabel("No. Book To Rent");
		rentText.setFont(new Font("Yu Gothic", Font.PLAIN, 11));
		rentText.setBounds(582, 11, 120, 26);
		yellow3.add(rentText);
		
		JLabel textOutput = new JLabel("");
		textOutput.setForeground(new Color(255, 255, 255));
		textOutput.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
		 textOutput.setBounds(90, 537, 787, 55);
			frame.getContentPane().add(textOutput);
		//Rent Button
			JButton rentButton = new JButton("Rent");
		rentButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userChoice = txtNoOfBook.getText();
			
				    int num = Integer.parseInt(userChoice); // change the text in text field into Integer
				    
					 if (num < 0 ) { 
						 textOutput.setText("NO COPIES AVAILABLE");							
			         } else if (num >= books.length) { 
			        	 textOutput.setText("INDEX DOES NOT EXIST. TRY AGAIN"); // if the input is less than the number of index
			         }
			         else {  
			        	 //borrow method
			             books[num].borrowBook(textOutput);
			         }			 
			}
		}
								
		);
		rentButton.setBounds(584, 52, 89, 23);
		yellow3.add(rentButton);
		
		// Book 1
		JLabel Book1 = new JLabel("0 " +book1.getTitle()+" by "+book1.getAuthor());
		Book1.setForeground(new Color(255, 255, 255));
		Book1.setBounds(454, 205, 443, 37);
		frame.getContentPane().add(Book1);
		Book1.setFont(new Font("Yu Gothic", Font.PLAIN, 18));
		
		// Book 2
				JLabel Book2 = new JLabel("1 " +book2.getTitle()+" by "+book2.getAuthor());
				Book2.setForeground(new Color(0, 0, 0));
				Book2.setFont(new Font("Yu Gothic Light", Font.PLAIN, 18));
				Book2.setBounds(455, 31, 386, 28);
				yellow2.add(Book2);
		
		// Book 3
		JLabel Book3 = new JLabel("2 " +book3.getTitle()+" by "+book3.getAuthor());
		Book3.setForeground(new Color(255, 255, 255));
		Book3.setBackground(new Color(255, 255, 255));
		Book3.setBounds(454, 361, 458, 29);
		frame.getContentPane().add(Book3);
		Book3.setFont(new Font("Yu Gothic Light", Font.PLAIN, 15));
		
		
		
		
	}
    	
	}

