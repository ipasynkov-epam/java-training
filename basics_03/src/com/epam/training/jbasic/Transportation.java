package com.epam.training.jbasic;

public abstract class Transportation {

	protected double speed;

	public double getSpeed(){
		return speed;
	}
	public abstract int getNumOfCars();

	public abstract int getFlightHeight();
}
