package com.epam.training.jbasic;

public class OverloadExample {

	public static void main(String[] args) {
		OverloadExample oe = new OverloadExample();
		oe.doSomething();
		oe.doSomething(1);
		oe.doSomething((int)1L);
		oe.doSomething(Integer.valueOf(1));
		oe.doSomething((Object)null);
		oe.doSomething("1");
		oe.doSomething("1", "2");
		oe.doSomething("0", new String[]{"1", "2", "3", "5", "10"});
	}

	public void doSomething(){
		System.out.println("void");
	}

	public void doSomething(int i){
		System.out.println("int i");
	}

	public void doSomething(String s1){
		System.out.println("String s1");
	}

	public void doSomething(String s1, String s2){
		System.out.println("String s1, String s2");
	}

	public void doSomething(Object o){
		System.out.println("Object o");
	}

	public void doSomething(String... args){
		System.out.println("String... args");
	}

	public void doSomething(String s, String... args){
		System.out.println("String s, String... args");
	}

	public void doSomething(int[] ints, String[] args){
		System.out.println("String s, String... args");
	}


}
