package com.epam.training.jbasic;

public class AutumnHandler implements EnumHandler{

	@Override
	public boolean canProcess(EnumExample enumValue) {
		return enumValue == EnumExample.AUTUMN;
	}

	@Override
	public void process(EnumExample enumValue) {
		System.out.println("it's sad and boring time");
	}
}
