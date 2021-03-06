/*
 * Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where 
F(n)=F(n?1)+F(n?2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
 * */

package com.yamaha.assignment1;

public class Question1 {
	public static void main(String[] args) {
		int sum = 0;
		int slast = 0, last = 1;
		System.out.print(last + " ");
		for (int i = 0; i < 19; i++) {
			int curr = last + slast;
			System.out.print(curr + " ");
			sum += curr;
			slast = last;
			last = curr;
		}
		System.out.println("\n" + (float) sum / 20);
	}

}
