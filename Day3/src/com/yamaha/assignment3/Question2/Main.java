package com.yamaha.assignment3.Question2;

import java.util.ArrayList;

import com.yamaha.assignment3.Question1.CommisionedEmployee;
import com.yamaha.assignment3.Question1.Company;
import com.yamaha.assignment3.Question1.Employee;
import com.yamaha.assignment3.Question1.HourlyEmployee;
import com.yamaha.assignment3.Question2.Invoice;
import com.yamaha.assignment3.Question1.Salaried;

public class Main {
	public static void main(String[] args) {
		Employee e1=new Salaried("Gagan","123",70);
		Salaried e=(Salaried)e1;
		e1.display();
		e.setWeeklySalary(80);
		System.out.println("Total Salary is: "+e1.salary());
		
		Employee e2=new HourlyEmployee("Gagan","123",160,2);
		e2.display();
		HourlyEmployee p=(HourlyEmployee)e2;
		p.setHourlyRate(200);
		System.out.println("Total Salary is: "+e2.salary());
		
		CommisionedEmployee e3=new CommisionedEmployee("Gagan","123",20,100000);
//		CommisionedEmployee r=(CommisionedEmployee)e3;
		e3.setPercent(30);
		e3.display();
		System.out.println("Total Salary is: "+e3.salary());
		ArrayList<Employee> ar=new ArrayList<>();
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		
		Company company =new Company("Yamaha",ar);
	 	                                                    
		company.changeSalary(20);              
		company.display();
		
		Invoice invoice = new Invoice("12345","Engine",10,25000);
		System.out.println(invoice + ",Cumulative Bill: "+invoice.salary());
                                                              
	}
}      
   	        