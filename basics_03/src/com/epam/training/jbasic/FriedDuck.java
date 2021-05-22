package com.epam.training.jbasic;

public class FriedDuck extends Duck{

	public FriedDuck(){
		fb = new FlyNoWay();
		qb = new MuteQuack();
	}

	@Override
	public String display() {
		return "Fried duck";
	}
}
