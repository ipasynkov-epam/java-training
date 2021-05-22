package com.epam.training.jbasic;

public class DecoyDuck extends Duck{

	public DecoyDuck(){
		fb = new FlyNoWay();
		qb = new MuteQuack();
	}

	@Override
	public String display() {
		return "I'm a decoy duck";
	}

}
