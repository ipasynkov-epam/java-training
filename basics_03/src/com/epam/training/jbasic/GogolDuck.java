package com.epam.training.jbasic;

public class GogolDuck extends Duck{

	public GogolDuck(){
		fb = new FlyWithWings();
		qb = new Quack();
	}
	@Override
	public String display() {
		return "I'm gogol duck";
	}
}
