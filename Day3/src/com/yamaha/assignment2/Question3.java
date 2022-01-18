//Problem#1: A Banking System
//Create a Banking System, where a user can create new account, deposit money, withdraw money and
//check the balance. For Simplicity, we will create the system for one customer. First the application will
//require the user to create an account. After creating the account, he should have options to deposit,
//withdraw money, and check balance as many times as he wants (until he exits the system).
//When a user opens/creates an account, he has the option to open a �Saving Account� or a �Current Account�.
//See below for the requirements of Current and Savings account.

package com.yamaha.assignment2;

import java.util.Scanner;

abstract class Account {
	private String memberName, accountNumber;
	protected double accountBalance;

	public Account(String name, double initBal) {
		accountNumber = 10000 + (int) (Math.random() * 89999) + "";
		memberName = name;
		accountBalance = initBal;
	}

	public void deposit(double amount) {
		accountBalance += amount;
	}

	abstract public double getBalance();

	abstract public void withdraw(double amount);
}

class Savings extends Account {
	private double interest = 5;
	private double withdrawLimit = 10000;

	public Savings(String name, double initBal) {
		super(name, initBal);
	}

	public double getBalance() {
		return (accountBalance + (accountBalance * interest * 0.01));
	}

	public void withdraw(double amount) {
		if (amount <= withdrawLimit && accountBalance >= amount) {
			accountBalance -= amount;
			System.out.println("Debited amount:" + amount);
		} else if (amount >= withdrawLimit)
			System.out.println("Requested amount exceeds withdrawal limit !!");
		else if (accountBalance <= amount)
			System.out.println("Not sufficient balance !!");
	}
}

class Current extends Account {
	private String tradeLicenseNumber;

	public Current(String name, double initBal, String licenseNo) {
		super(name, initBal);
		this.tradeLicenseNumber = licenseNo;
	}

	public double getBalance() {
		return accountBalance;
	}

	public void withdraw(double amount) {
		if (accountBalance >= amount) {
			accountBalance -= amount;
			System.out.println("Debited amount:" + amount);
		} else if (accountBalance <= amount)
			System.out.println("Not sufficient balance !!");
	}
}

public class Question3 {
	static Scanner in = new Scanner(System.in);

	public static void prompt(Account acc) {
		System.out.print("See Balance: [Yes/No]:  ");
		in.nextLine();
		String choice = in.nextLine();
		if (choice.equalsIgnoreCase("Yes"))
			System.out.println("Updated Balance: " + acc.getBalance());
		else
			return;
	}

	public static void bankOp(Account acc) {
		int choice;
		double amount;
		do {
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			choice = in.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter amount to deposit: ");
				amount = in.nextDouble();
				acc.deposit(amount);
				prompt(acc);
				break;
			case 2:
				System.out.print("Enter amount to withdraw: ");
				amount = in.nextDouble();
				acc.withdraw(amount);
				prompt(acc);
				break;
			case 3:
				System.out.println("Available Balance: " + acc.getBalance());
				break;
			case 4:
				System.out.println("******* THANK YOU FOR USING OUR PORTAL *****");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice !!");
			}
		} while (true);
	}

	public static void main(String[] args) {
		String name, accountType, licenseNo;
		double initBal;
		Account acc = null;
		System.out.println("*******CREATE ACCOUNT********");
		System.out.print("Name: ");
		name = in.nextLine();
		System.out.print("Account Type [Savings/Current]: ");
		accountType = in.nextLine();
		System.out.print("Opening Balance: ");
		initBal = in.nextDouble();
		if (accountType.equalsIgnoreCase("Savings"))
			acc = new Savings(name, initBal);
		else if (accountType.equalsIgnoreCase("Current")) {
			System.out.print("Trading License Number: ");
			in.nextLine();
			licenseNo = in.nextLine();
			acc = new Current(name, initBal, licenseNo);
		} else
			System.out.println("Invalid account type");
		bankOp(acc);
	}

}
