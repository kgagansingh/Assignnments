package com.yamaha.assignment3.Question2;

public class Salaried extends Employee{
	private int weeklySalary;
	
	public Salaried(String name, String id, int weeklySalary) {
		super(name, id);
		this.weeklySalary = weeklySalary;
	}

	public int getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(int weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	public int salary() {
		
		return weeklySalary;
	}

	public void display() {
		super.display();
		System.out.println(" weeklySalary: "+weeklySalary);
	}

	

}
