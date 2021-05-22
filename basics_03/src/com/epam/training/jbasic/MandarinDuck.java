package com.epam.training.jbasic;

public class MandarinDuck extends Duck{

	public MandarinDuck(){
		fb = new FlyWithWings();
		qb = new Quack();
	}

	@Override
	public String display() {
		return "I look like a mandarin";
	}
}
