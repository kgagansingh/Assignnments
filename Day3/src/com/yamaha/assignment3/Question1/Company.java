package com.yamaha.assignment3.Question1;
import java.util.*;
public class Company {
	private String name;
	private ArrayList<Employee> list=new ArrayList<Employee>();
	public Company(String name, ArrayList<Employee> list) {
		this.name = name;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Employee> getList() {
		return list;
	}
	public void setList(ArrayList<Employee> list) {
		this.list = list;
	}
	public void display() {
		System.out.println("Company Name: "+ name+"\nEmployees are: ");
		for(Employee e: list) {
			e.display();
		}
		
	}
	public void changeSalary(int percent) {
		double x=1+(percent/100d);
		for(Employee e: list) {
			if(e instanceof Salaried) {
				Salaried t=(Salaried)e;
				t.setWeeklySalary((int)(t.getWeeklySalary()*x));
			}
			else if(e instanceof HourlyEmployee) {
				HourlyEmployee t=(HourlyEmployee)e;
				t.setHourlyRate((int)(t.getHourlyRate()*x));
			}
			else {
				CommisionedEmployee t=(CommisionedEmployee)e;
				t.setPercent((int)(t.getPercent()*x));
			}
		}
	}
	

}
