package com.yamaha.assignment2;

abstract class Vehicle {
	private int noOfWheels;
	private int noOfPassangers;
	private int model;
	private String make;

	public Vehicle(int noOfWheels, int noOfPassangers, int model, String make) {
		this.noOfWheels = noOfWheels;
		this.noOfPassangers = noOfPassangers;
		this.model = model;
		this.make = make;
	}

	public void display() {
		System.out.println("MAke: " + make);
		System.out.println("model: " + model);
		System.out.println("noOfWheels: " + noOfWheels);
		System.out.println("noOfPassangers: " + noOfPassangers);
	}
}

abstract class Car extends Vehicle {
	private int noOfDoors;

	public Car(int noOfWheels, int noOfPassangers, int model, String make, int noOfDoors) {
		super(noOfWheels, noOfPassangers, model, make);
		this.noOfDoors = noOfDoors;
	}

	public void display() {
		super.display();
		System.out.println("noOfDoors: " + noOfDoors);
	}
}

class Convertible extends Car{
	private boolean isHoodOpen;

	public Convertible(int noOfWheels, int noOfPassangers, int model, String make, int noOfDoors, boolean isHoodOpen) {
		super(noOfWheels, noOfPassangers, model, make, noOfDoors);
		this.isHoodOpen = isHoodOpen;
	}
	public void display() {
		super.display();
		System.out.println("isHoodOpen: " + isHoodOpen);
	}
}

class SportCar extends Car{
	public SportCar(int noOfWheels,int  noOfPassangers,int  model,String make) {
		super(noOfWheels, noOfPassangers, model, make,2);
	}
	
	public void display() {
		super.display();
	}
}

public class Question5 {
	public static void main(String[] args) {
		 Car c1=new SportCar(4,2,123,"Honda");
		 c1.display();
		 Vehicle c2=new Convertible(4,3,111,"lambo", 4,true);
		 c2.display();
	}
}
