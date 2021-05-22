package com.epam.training.jbasic;

import com.epam.training.jbasic.Planet;

public class EnumAdvExample {

	public static final int CONST_BOLD = 1 << 0;// 0001 = 1
	public static final int CONST_ITALIC = 1 << 1;// 0010 = 2
	public static final int CONST_UNDERLINED = 1 << 2;// 0100 = 4
	public static final int CONST_UPPERCASE = 1 << 3;// 1000 = 8

	public static void main(String[] args) {
//		for (Planet p : Planet.values()){
//			System.out.println(p.surfaceGravity());
//			System.out.println(p.surfaceWeight(70));
//		}

//		for (Operation o : Operation.values()){
//			System.out.println(o.toString() + " : " + o.apply(10d, 2d));
//		}

		for (OperationEnh o : OperationEnh.values()){
			System.out.println(o.toString() + " = " + o.apply(10d, 2d));
		}

	}


}
