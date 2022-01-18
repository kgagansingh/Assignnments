package com.yamaha.assignment3.Question2;

public class CommisionedEmployee extends Employee {
	private int percent;
	private int sales;
	public CommisionedEmployee(String name, String id, int percent, int sales) {
		super(name, id);
		this.percent = percent;
		this.sales = sales;
	}
	
	public int getPercent() {
		return percent;
	}
	
	public void setPercent(int percent) {
		this.percent = percent;
	}
	
	public int getSales() {
		return sales;
	}
	
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int salary() {
		return (this.sales*this.percent)/100;
	}
	
	public void display() {
		super.display();
		System.out.println(" percent: "+percent+" sales:  "+sales);
	}
	
}
