package com.epam.training.jbasic;

public class RuPerson extends Person{
	@Override
	public String getFullName() {
		return lastname + " " + firstName + " " + middleName;
	}
}
