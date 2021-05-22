package com.epam.training.jbasic;

public interface Vehicle {
	int HP_FACTOR = 2;

	String speedUp();

	String slowDown();

	default String alarmOn() {
		return "Vehicle Alarm is ON";
	}

	default String alarmOff() {
		return "Vehicle Alarm is OFF";
	}

	static double getHorsePower(int rpm, int torque) {
		return (rpm * torque) / 5252d * HP_FACTOR;
	}
}
