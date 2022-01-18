//Create a class and a method named throwException which will throw 2 exceptions 1)
//InputException and 2) IOExcception. Now from the main method call this throwException
//method; notice what the IDE suggest to fix the error. Choose the try/catch solution. How many
//catch blocks have been added and why?


package com.yamaha.assignment4.Question7;

import java.io.IOException;
import java.util.InputMismatchException;

public class Main {
	
	public static void throwException() {
		throw new InputMismatchException();
	}
	
	public static void main(String[] args) {
		throwException();
	}
}