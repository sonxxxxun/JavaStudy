package com.kh.poly.ex2;

public class BMW extends Car{

	public BMW(String color, String fuel, int year) {
		super(color, fuel, year);	
	}

	public void moveBMW() {
		System.out.println("move BMW");
	}
	
	@Override
	public void drive() {
		System.out.println("BMW ~ drive ~");
	}

}









