package com.yamaha.assignment2.Question2;

import java.util.Scanner;

import com.yamaha.assignment2.Question2.BookStore;

public class BookStoreApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookStore store = new BookStore("Walmart");
		int flag = 1;
		while (flag == 1) {
			System.out.println("Enter “1”, to display the Books.\r\n" + "Enter “2”, to order new books.\r\n"
					+ "Enter “3”, to sell books.\r\n" + "Enter “0”, to exit the system.");
			int ch = sc.nextInt();
			if (ch == 1) {
				store.display();
				System.out.println();
			} else if (ch == 2) {
				System.out.println("Enter bookTitle, author, isbn, noOfCopies respectively");
				String bookTitle = sc.next();
				String author = sc.next();
				String isbn = sc.next();
				int noOfCopies = sc.nextInt();
				store.order(bookTitle, author, isbn, noOfCopies);
			} else if (ch == 3) {
				System.out.println("Enter bookTitle and  noOfCopies respectively");
				String bookTitle = sc.next();
				int noOfCopies = sc.nextInt();
				store.sell(bookTitle, noOfCopies);
			} else {
				flag = 0;
			}
		}

	}
}
