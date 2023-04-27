package ClassLessons;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class inventory {
	private String title;
	private String author;
    public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	private int copiesAvailable;

    public inventory(String title,String author,int copiesAvailable) {
    	this.author = author;
    	this.title = title;
        this.copiesAvailable = copiesAvailable;
    }

    public void setTitle(String title) {
		this.title = title;
	}

	public void setCopiesAvailable(int copiesAvailable) {
		this.copiesAvailable = copiesAvailable;
	}

	public String getTitle() {
        return title;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void borrowBook(JLabel label) {
    
         if(copiesAvailable > 0) {
            copiesAvailable--;
            label.setText("You rented  \"" + title +" by " + author + "\". Enjoy your reading!");
		
        } else {
        	label.setText("No copies of the selected book are available.");
        	
        }
    }
}

