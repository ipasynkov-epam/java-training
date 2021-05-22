package com.epam.training.jbasic;

import java.util.Date;

public class MethodArgExample {

	public static void main(String[] args) {
		Date myDate = new Date();
		myDate.setDate(6);
		System.out.println("Before method: " + myDate.getDate());
		changeDate(myDate);
		System.out.println("After method: " + myDate.getDate());

	}
	public static void changeDate(Date date) {
		System.out.println("	- before change: "+ date.getDate());
		date.setDate(12);
		System.out.println("	- after change: " + date.getDate());
	}


}
