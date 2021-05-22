package com.epam.training.jbasic;

public class PersonExample {

	public static void main(String[] args) {

		Person p1 = new RuPerson();
		p1.setFirstName("Иван");
		p1.setLastname("Иванов");
		p1.setMiddleName("Иванович");

		Person p2 = new UsPerson();
		p2.setFirstName("John");
		p2.setLastname("Deer");
		p2.setMiddleName("Steve");

		System.out.println(p1.getFullName());
		System.out.println(p2.getFullName());
	}
}
