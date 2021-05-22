package com.epam.training.jbasic;

import java.util.Arrays;

public class DefaultInterfaceExample {
	public static void main(String[] args) {
		Vehicle v = new Car("LADA");
		System.out.println(v.speedUp());
		System.out.println(v.slowDown());
		System.out.println(v.alarmOn());
		System.out.println(v.alarmOff());
		System.out.println(Vehicle.getHorsePower(2500, 15));
		Arrays a;

	}
}
