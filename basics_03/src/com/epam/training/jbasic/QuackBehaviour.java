package com.epam.training.jbasic;

public interface QuackBehaviour {
	String quack();
	default void smth(){
		System.out.println("default void smth()");
	}
}
