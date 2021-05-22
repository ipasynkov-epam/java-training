package com.epam.training.jbasic;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveType {
	public static void main(String[] args) {

		//InitValues.printValuesStatic();

		InitValues v1 = new InitValues();
		v1.printValues();
		System.out.println("==============");
		InitValues v2 = new InitValues("12.0");
		v2.printValues();
		System.out.println("==============");
		InitValues v3 = new InitValues("12.0", 10);
		v3.printValues();
	}
}
