package com.epam.training.jbasic;

public class RubberDuck extends Duck{

	public RubberDuck(){
		fb = new FlyNoWay();
		qb = new Squeak();
	}

	@Override
	public String display() {
		return "I' just a toy";
	}
}
