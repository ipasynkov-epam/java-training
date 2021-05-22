package com.epam.training.jbasic;

public class Singleton {
	private static Singleton s;
	private Singleton(){
	}
	public static Singleton getInstance(){
		if(s == null){
			synchronized (Singleton.class) {
				if(s == null) {
					s = new Singleton();
				}
			}
		}
		return s;
	}
}
