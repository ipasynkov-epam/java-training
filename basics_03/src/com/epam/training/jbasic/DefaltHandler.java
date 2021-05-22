package com.epam.training.jbasic;

public class DefaltHandler implements EnumHandler{
	@Override
	public boolean canProcess(EnumExample enumValue) {
		return enumValue != EnumExample.WINTER
			   && enumValue != EnumExample.SUMMER;
	}

	@Override
	public void process(EnumExample enumValue) {
		System.out.println("some season");
	}
}
