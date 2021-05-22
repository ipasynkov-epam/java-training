package com.epam.training.jbasic;

import java.io.IOException;

public class ClassWException {


	public int division(int arg1, int arg2) {
		if(arg2 == 0){
		}
		return arg1 / arg2;
	}

	public String findString(String s) throws ClassNotFoundException {
		if (s.equals("abc")) {
			return "Found ABC";
		}
		if(s == null){

		}
		try {
			division(5, 0);
			System.exit(0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return "ArithmeticException";
		} finally {
			return "ArithmeticException. Finally";
		}


//		if (s.equals("ddd")) {
//			throw new IllegalArgumentException("Arg: " + s + " is not allowed");
//		}
//		if (s.equals("xyz")) {
//			throw new ClassNotFoundException("findString throws Exception. Args: " + s);
//			//return "Found XYZ";
//		}
//		return null;
	}
}
