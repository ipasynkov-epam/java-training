package com.epam.training.jbasic;

import java.util.Objects;

public abstract class Person {

	protected String firstName;
	protected String lastname;
	protected String middleName;

	/**
	 *
	 * @return something
	 */
	public String getFirstName() {
		return firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public abstract String getFullName();

	/**
	 *
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		Objects.requireNonNull(firstName);
		this.firstName = firstName;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
}
