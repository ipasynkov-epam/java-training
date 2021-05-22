package com.epam.training.jbasic;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverrideExample {

	// (default) -> protected -> public

	public static void main(String[] args) {
		Animal a = new Dog();
		System.out.println(a.whoAmI());
		//System.out.println(a.methodPublic());
		System.out.println(a.methodProtected());
		System.out.println(a.methodDefault());
		//System.out.println(a.methodPublicFinal());
		//System.out.println(Animal.methodPublicStatic());

		Dog.methodPublicStatic();
		Animal.methodPublicStatic();

		System.out.println("=========================");

		Dog d = new Dog();
		//System.out.println(d.methodPublicFinal());
		//System.out.println(Dog.methodPublicStatic());
	}
}
