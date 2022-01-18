package com.yamaha.assignment4.Question6;
//
//Now create your own exception named “InputException” which will take an integer (let’s say n) as
//parameter and set the exception message to “Number can’t be greater than [n]”. Modify the
//program in #1 to throw InputException when the number is greater than 100. So, the exception
//message will be “Number can’t be greater than 100”. Catch the exception and display the
//exception message.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	private static Scanner in;

	public static void main(String[] args) {
		int num;
		in = new Scanner(System.in);
		do {
			num = 0;
			try {
				System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
				num = in.nextInt();
				if (num == -1)
					System.exit(0);
				if (num > 100)
					throw new CustomException(100);
				if (num % 2 == 0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch (InputMismatchException ex) {
				System.out.println("WARNING: You must enter an integer value!!");
				in.nextLine();
			} catch (CustomException ex) {
				System.out.println(ex.getMessage());
			}
		} while (true);
	}
}
