package com.epam.training.jbasic;

public class Train extends Transportation{

	private int numOfCars = 12;
	private int diesel = 1000;

	@Override
	public int getNumOfCars() {
		return numOfCars;
	}

	@Override
	public int getFlightHeight() {
		return 0;
	}
}
