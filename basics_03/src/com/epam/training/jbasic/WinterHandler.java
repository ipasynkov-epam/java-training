package com.epam.training.jbasic;

public class WinterHandler implements EnumHandler{
	@Override
	public boolean canProcess(EnumExample enumValue) {
		return enumValue == EnumExample.WINTER;
	}

	@Override
	public void process(EnumExample enumValue) {
		System.out.println("Long dark winter nights");
	}
}
