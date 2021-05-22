package com.epam.training.jbasic;

public class UsPerson extends Person{
	@Override
	public String getFullName() {
		return firstName + " " + middleName.charAt(0) + ". " + lastname;
	}
}
