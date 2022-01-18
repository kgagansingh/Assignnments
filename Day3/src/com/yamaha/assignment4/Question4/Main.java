//Write a program that will prompt user to input a number or enter -1 to quit the program. You will then
//read the value using the nextInt() method of Scanner object and display if the number is even or
//odd. If user enters anything other than integer number. nextInt() method will throw
//InputMismatchException. You have to catch the exception and display a message saying “You
//must enter an integer”.
//Sample output:
//“Please enter a number or enter ‘-1’ if you want to quit”
//3“
//You have entered an odd number”
//“Please enter a number or enter ‘-1’ if you want to quit”
//4“
//You have entered an even number”
//“Please enter a number or enter ‘-1’ if you want to quit”
//a“
//You must enter an integer.”
//“Please enter a number or enter ‘-1’ if you want to quit”
//4.5
//“You must enter an integer.”
//..
//“Please enter a number or enter ‘-1’ if you want to quit”
//-1



package com.yamaha.assignment4.Question4;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	private static Scanner in;

	public static void main(String[] args) {
		int num;
		in = new Scanner(System.in);
		do {
			num =0;
			try{
				System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
				num = in.nextInt();
				if (num % 2 == 0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch (InputMismatchException ex) {
				System.out.println("WARNING: You must enter an integer value!!");
				in.nextLine();
			}
		} while (num!=-1);
	}
}