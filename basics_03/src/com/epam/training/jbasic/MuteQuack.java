package com.epam.training.jbasic;

public class MuteQuack implements QuackBehaviour{
	@Override
	public String quack() {
		return "<Silence>";
	}
}
