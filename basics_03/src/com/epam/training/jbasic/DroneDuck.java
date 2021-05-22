package com.epam.training.jbasic;

public class DroneDuck extends Duck{

	public DroneDuck(){
		fb = new PropellerFly();
		qb = new PropellerNoise();
	}

	@Override
	public String display() {
		return "Behold. I'm all plastic";
	}
}
