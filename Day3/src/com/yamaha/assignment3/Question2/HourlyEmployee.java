package com.yamaha.assignment3.Question2;

public class HourlyEmployee extends Employee {
	private int hourlyRate;
	private int hours;
	
	public HourlyEmployee(String name, String id, int hourlyRate, int hours) {
		super(name, id);
		this.hourlyRate = hourlyRate;
		this.hours = hours;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public int salary() {
		return this.hours*this.hourlyRate;
	}
	
	public void display() {
		super.display();
		System.out.println(" hourlyRate: "+hourlyRate+" noOfHours:  "+hours);
	}
	
}
