package com.prowings.collectionInterface;

import java.util.ArrayList;
import java.util.List;

public class Library{
		
	     List<Book> books = new ArrayList<>();

	    public void addBook(String title, String author, String isbn) {
	        Book newBook = new Book(title, author, isbn);
	        books.add(newBook);
	        System.out.println("Book added successfully.");
	    }

	    public void removeBook(String title) {
	        boolean removed = false;
	        for (Book book : books) {
	            if (book.getTitle().equalsIgnoreCase(title)) {
	                books.remove(book);
	                removed = true;
	                System.out.println("Book removed successfully.");
	                break;
	            }
	        }
	        if (!removed) {
	            System.out.println("Book not found.");
	        }
	    }

	    public void searchByAuthor(String author) {
	        boolean found = false;
	        System.out.println("Books by " + author + ":");
	        for (Book book : books) {
	            if (book.getAuthor().equalsIgnoreCase(author)) {
	                System.out.println(book);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("No books found for author " + author);
	        }
	    }

	    public void displayBooks() {
	        System.out.println("Library Books:");
	        for (Book book : books) {
	            System.out.println(book);
	        }
	    }
	}