//Write a program to Read from file in byte format and Write to command prompt in both byte format and using
//formatted output(System.out.print or println)


package com.yamaha.assignment4.Question1;

import java.io.File;
import java.io.FileInputStream;

public class Main {
	
	private static byte[] readContent(File file)
	{
		byte[] arr = new byte[(int)file.length()];
		try(FileInputStream input = new FileInputStream(file)){
			input.read(arr);
			for(byte a: arr) {
				System.out.print(a);
			}
			System.out.println();
			for(byte a: arr) {
				System.out.print((char)a);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		File file = new File("hello");
		readContent(file);
	}
}


