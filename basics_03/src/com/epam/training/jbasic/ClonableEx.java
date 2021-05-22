package com.epam.training.jbasic;

import java.util.Arrays;

public class ClonableEx implements Cloneable{
	private String s1 = "abc";
	private String[] arr = {"1", "2"};

	public static void main(String[] args) throws CloneNotSupportedException {
		ClonableEx c1 = new ClonableEx();
		//ClonableEx c2 = (ClonableEx) c1.clone();
		ClonableEx c2 = new ClonableEx(c1);

		System.out.println(c1 == c2);
		System.out.println(c1.s1 == c2.s1);
		System.out.println(c1.arr == c2.arr);
	}

	public ClonableEx(){
		System.out.println("constructor is called");
	}

	public ClonableEx(ClonableEx clonableEx){
		this.arr = Arrays.copyOf(clonableEx.arr, clonableEx.arr.length);
		this.s1 = clonableEx.s1.substring(0);
		System.out.println("constructor is called");
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		ClonableEx c = new ClonableEx();
		c.arr = Arrays.copyOf(this.arr, this.arr.length);
		c.s1 = this.s1.substring(0);
		return c;
	}
}
