package com.yamaha.assignment1;


//
//Q4. Write a boolean method called copyOf(), which an int Array and returns a copy of the given 
//array. The method's signature is as follows:
//public static int[] copyOf(int[] array)



public class Question4 {
	public static int [] copyOf(int a[]) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		return b;
		
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int b[]=copyOf(a);
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
