package com.epam.training.jbasic;

public class DuckApplExample {
	public static void main(String[] args) {
		Duck d1 = new MandarinDuck();
		Duck d2 = new GogolDuck();
		Duck d3 = new RubberDuck();
		Duck d4 = new DecoyDuck();
		Duck d5 = new DroneDuck();

		System.out.println(d1.performFly());
		System.out.println(d5.performFly());
		System.out.println(d3.performFly());
		System.out.println(d4.performFly());

		System.out.println("==============");

		System.out.println(d1.performQuack());
		System.out.println(d5.performQuack());
		System.out.println(d3.performQuack());
		System.out.println(d4.performQuack());
	}
}
