package com.epam.training.jbasic;

public class Airplane extends Transportation{

	private int height;
	private int kerosine = 10000;

	@Override
	public int getNumOfCars() {
		return 0;
	}

	@Override
	public int getFlightHeight() {
		return height;
	}
}
