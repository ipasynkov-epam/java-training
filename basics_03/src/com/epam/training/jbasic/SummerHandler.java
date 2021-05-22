package com.epam.training.jbasic;

public class SummerHandler implements EnumHandler{
	@Override
	public boolean canProcess(EnumExample enumValue) {
		return enumValue == EnumExample.SUMMER;
	}

	@Override
	public void process(EnumExample enumValue) {
		System.out.println("It's summer time");
	}
}
