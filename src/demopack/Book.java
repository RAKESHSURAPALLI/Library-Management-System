package demopack;

public class Book 
{
	    private String title;
	    private String author;
	    private boolean isAvailable;

	    // Constructor
	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true; // Books are available by default
	    }

	    // Getters
	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    // Setters
	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    // Display book details
	    @Override
	    public String toString() {
	        return "Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No");
	    }
	}
