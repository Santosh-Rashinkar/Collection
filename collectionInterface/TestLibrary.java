package com.prowings.collectionInterface;
/**
 *  Let's consider a scenario where we need to manage a list of books in a library application.
 *   We'll use an ArrayList to store information about books such as title, author, and ISBN. 
 *   We'll implement methods to add books, remove books by title, search for books by author, and display the list of books.
 */
import java.util.Scanner;

public class TestLibrary {

	  public static void main(String[] args) {
		  		  
	        Library library = new Library();
	        
	        Scanner scanner = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\nLibrary Management System");
	            System.out.println("1. Add a book");
	            System.out.println("2. Remove a book");
	            System.out.println("3. Search books by author");
	            System.out.println("4. Display all books");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter book title: ");
	                    String title = scanner.nextLine();
	                    System.out.print("Enter author name: ");
	                    String author = scanner.nextLine();
	                    System.out.print("Enter ISBN: ");
	                    String isbn = scanner.nextLine();
	                    library.addBook(title, author, isbn);
	                    break;
	                case 2:
	                    System.out.print("Enter title of the book to remove: ");
	                    String removeTitle = scanner.nextLine();
	                    library.removeBook(removeTitle);
	                    break;
	                case 3:
	                    System.out.print("Enter author name to search: ");
	                    String searchAuthor = scanner.nextLine();
	                    library.searchByAuthor(searchAuthor);
	                    break;
	                case 4:
	                    library.displayBooks();
	                    break;
	                case 5:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (choice != 5);

	        scanner.close();
	    }
}
