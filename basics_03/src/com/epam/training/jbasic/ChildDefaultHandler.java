package com.epam.training.jbasic;

public class ChildDefaultHandler extends DefaltHandler {

	@Override
	public boolean canProcess(EnumExample enumValue) {
		return enumValue != EnumExample.WINTER
			   && enumValue != EnumExample.SUMMER
			   && enumValue != EnumExample.AUTUMN;
	}
}
