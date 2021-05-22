package com.epam.training.jbasic;

public class Car implements Vehicle, Alarm {
	private final String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public String speedUp() {
		return "speedUp";
	}

	@Override
	public String slowDown() {
		return "slowDown";
	}

	@Override
	public String alarmOn() {
		return Vehicle.super.alarmOn();
	}

	@Override
	public String alarmOff() {
		return Alarm.super.alarmOff();
	}
}
