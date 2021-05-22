package com.epam.training.jbasic;

import java.math.BigInteger;

import static java.lang.Math.pow;

public class VariableDeclaration {

	private static int staticVar = 1;
	public int objVar = 2;

	public static void main(String[] args) {

		int i=3;
		i = -i++ + i++ + -i;

		System.out.println(i);


		System.out.println(Boolean.parseBoolean("true") == true);
		System.out.println(Boolean.TRUE == true);


	}

	public static void calculate(Number n){
		if(n instanceof Integer){
			System.out.println("integer");
			return;
		}
		if(n instanceof Double){
			System.out.println("double");
			return;
		}
		System.out.println("number");
	}

	public static boolean trueMethod(){
		System.out.println("trueMethod");
		return true;
	}
	public static boolean falseMethod(){
		System.out.println("falseMethod");
		return false;
	}
}
