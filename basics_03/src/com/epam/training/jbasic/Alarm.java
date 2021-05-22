package com.epam.training.jbasic;

public interface Alarm {
	default String alarmOn(){
		return "Alarm is ON";
	}
	default String alarmOff(){
		return "Alarm is OFF";
	}
}
