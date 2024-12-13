package demopack;

import java.util.Scanner;

public class LibraryManagementSystem 
{
	

	    public static void main(String[] args) {
	        Library library = new Library();
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        System.out.println("=== Welcome to the Library Management System ===");

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add Book");
	            System.out.println("2. Remove Book");
	            System.out.println("3. Search Book");
	            System.out.println("4. Issue Book");
	            System.out.println("5. Return Book");
	            System.out.println("6. Display All Books");
	            System.out.println("7. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1 -> {
	                    System.out.print("Enter book title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter book author: ");
	                    String author = scanner.nextLine();
	                    library.addBook(title, author);
	                }
	                case 2 -> {
	                    System.out.print("Enter book title to remove: ");
	                    String title = scanner.nextLine();
	                    library.removeBook(title);
	                }
	                case 3 -> {
	                    System.out.print("Enter title or author to search: ");
	                    String keyword = scanner.nextLine();
	                    library.searchBook(keyword);
	                }
	                case 4 -> {
	                    System.out.print("Enter book title to issue: ");
	                    String title = scanner.nextLine();
	                    library.issueBook(title);
	                }
	                case 5 -> {
	                    System.out.print("Enter book title to return: ");
	                    String title = scanner.nextLine();
	                    library.returnBook(title);
	                }
	                case 6 -> library.displayBooks();
	                case 7 -> System.out.println("Exiting the system. Goodbye!");
	                default -> System.out.println("Invalid choice! Please try again.");
	            }
	        } while (choice != 7);

	        scanner.close();
	    }
	}
