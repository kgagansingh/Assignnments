package com.yamaha.assignment1;

//Q3. Write a program called GradesAverage, which prompts user for the number of students, reads it
//from the keyboard, and saves it in an int variable called numStudents. It then prompts user for the 
//grades of each of the students and saves them in an int array called grades. Your program shall 
//check that the grade is between 0 and 100. A sample session is as follow:
//Enter the number of students: 3
//Enter the grade for student 1: 55
//Enter the grade for student 2: 108
//Invalid grade, try again...
//Enter the grade for student 2: 56
//Enter the grade for student 3: 57
//The average is: 56.0

import java.util.*;

public class Question3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		int sum=0;
		for (int i = 0; i < n; i++) {
			System.out.print("Enter the grade for student" + (i + 1) + ": ");
			int x=sc.nextInt();
			if(x<0 || x>100) {
				System.out.println("Invalid");
				i--;
			}
			else{
				a[i]=x;
				sum+=x;
			}
		}
		System.out.println("The average is: "+ (float)sum/n);
		

	}
}
