package com.yamaha.assignment4.Question6;

public class CustomException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CustomException(int num){
		super("Input number cannot be greater than "+num);
	}
}
