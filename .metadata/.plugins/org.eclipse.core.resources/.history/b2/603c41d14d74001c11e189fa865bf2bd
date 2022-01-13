package com.yamaha.assignment2.Question2;

import com.yamaha.assignment2.Question2.Book;

public class BookStore {
	private String name;
	private final int size = 10;
	private int i = 0;
	private Book book[] = new Book[size];

	BookStore(String name) {
		this.name = name;
	}

	public void sell(String bookTitle, int noOfCopies) {
		for (int j = 0; j < i; j++) {
			if (book[j].getBookTitle().contentEquals(bookTitle)) {
				if (book[j].getNumOfCopies() >= noOfCopies) {
					book[j].setNumOfCopies(book[j].getNumOfCopies() - noOfCopies);
					System.out.println("Copies Sold");
					return;
				} else {
					System.out.println("Book Quantity is unavailable");
					return;
				}
			}
		}
		System.out.println("Book is unavailable");
	}

	public void order(String bookTitle, String author, String isbn, int noOfCopies) {
		for (int j = 0; j < i; j++) {
			if (book[j].getISBN().contentEquals(isbn)) {
				book[j].setNumOfCopies(book[j].getNumOfCopies() + noOfCopies);
				System.out.println("Copies Added");
				return;
			}
		}
		if (i < size) {
			book[i] = new Book(bookTitle, author, isbn, noOfCopies);
			i++;
			System.out.println("Copies Added");
			return;
		} else {
			System.out.println("Book STore is Already full");
		}
	}

	public void display() {
		if (i == 0) {
			System.out.println("BookStore is Empty");
			return;
		}
		System.out.println("Name of the Book Store: " + name + "\n Books are: \n");
		for (int j = 0; j < i; j++) {
			book[j].display();
		}
	}
}

