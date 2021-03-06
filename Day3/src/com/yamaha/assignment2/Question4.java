package com.yamaha.assignment2;

class Student {
	private String name;
	private String id;
	private double grade;

	public Student(String id) {
		this.id = id;
	}

	public Student(String name, String id) {
		this(id);
		this.name = name;
	}

	public Student(String name, String id, double grade) {
		this(name, id);
		this.grade = grade;

	}

	public void display() {
		if (name != null)
			System.out.println("Name: " + name);
		if (id != null)
			System.out.println("ID: " + id);
		System.out.println("Grade: " + grade);
	}

	public void display(int n) {
		this.display();
		System.out.println("Year: " + n);
	}

}

public class Question4 {
	public static void main(String[] args) {
		Student s1=new Student("gagan","123",50);
		s1.display();
		Student s2=new Student("golu","1234");
		s2.display();
		s2.display(2004);
	}
}
