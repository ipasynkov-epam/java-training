package com.epam.training.jbasic;

import java.util.Date;

public class MethodArgStringExample {

	public static void main(String[] args) {
		String myString = "AAA";
		System.out.println("Before method: " + myString);
		changeString(myString);
		System.out.println("After method: " + myString);

	}
	public static void changeString(String str) {
		System.out.println("	- before change: " + str);
		System.out.println("	- after change: " + str);
	}
}
