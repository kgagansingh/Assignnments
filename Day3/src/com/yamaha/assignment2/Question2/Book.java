package com.yamaha.assignment2.Question2;

public class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;

	public Book() {
	}

	public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}

	public String getISBN() {
		return ISBN;
	}

	public void display() {
		System.out.println(bookTitle + " -- " + author + " -- " + ISBN + " -- " + numOfCopies);
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

}
