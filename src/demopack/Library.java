package demopack;

import java.util.ArrayList;
import java.util.Scanner;
public class Library 
{

	    private ArrayList<Book> books = new ArrayList<>();

	    // Add a new book to the library
	    public void addBook(String title, String author) {
	        books.add(new Book(title, author));
	        System.out.println("Book added successfully!");
	    }

	    // Remove a book by title
	    public void removeBook(String title) {
	        boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
	        if (removed) {
	            System.out.println("Book removed successfully!");
	        } else {
	            System.out.println("Book not found!");
	        }
	    }

	    // Search for a book by title or author
	    public void searchBook(String keyword) {
	        boolean found = false;
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(keyword) || book.getAuthor().equalsIgnoreCase(keyword)) {
	                System.out.println(book);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No books found matching the keyword.");
	        }
	    }

	    // Issue a book to a user
	    public void issueBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                if (book.isAvailable()) {
	                    book.setAvailable(false);
	                    System.out.println("Book issued successfully!");
	                } else {
	                    System.out.println("Sorry, this book is already issued.");
	                }
	                return;
	            }
	        }
	        System.out.println("Book not found!");
	    }

	    // Return a book
	    public void returnBook(String title) {
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                if (!book.isAvailable()) {
	                    book.setAvailable(true);
	                    System.out.println("Book returned successfully!");
	                } else {
	                    System.out.println("This book wasn't issued.");
	                }
	                return;
	            }
	        }
	        System.out.println("Book not found!");
	    }

	    // Display all books
	    public void displayBooks() {
	        if (books.isEmpty()) {
	            System.out.println("No books in the library.");
	        } else {
	            for (Book book : books) {
	                System.out.println(book);
	            }
	        }
	    }
	}
