package com.epam.training.jbasic;

public class InitValues {

	private int i1;
	private float f1;
	private Object o1;

	public int getI1(){
		return i1;
	}
	public void setI1(int i1){
		this.i1 = i1;
	}


	public InitValues(){
		Math.abs(-10);
	}
	public InitValues(String arg){
		i1 = 10;
		f1 = Float.parseFloat(arg);
		o1 = new Object();
	}
	public InitValues(String arg, int arg2){
		i1 = arg2;
		f1 = Float.parseFloat(arg);
		o1 = new Object();
	}

	public void printValues(){
		System.out.println(i1);
		System.out.println(f1);
		System.out.println(o1);
	}

//	public static void printValuesStatic(){
//		System.out.println(i1);
//		System.out.println(f1);
//		System.out.println(o1);
//	}
}
