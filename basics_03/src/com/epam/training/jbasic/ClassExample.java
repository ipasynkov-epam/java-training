package com.epam.training.jbasic;

public class ClassExample {

	public static void main(String[] args) {

		System.out.println(Point.POINT_CONST);
		System.out.println(Point.getStaticConst());

		Point p1 = new Point();
		Point p2 = new Point();
		p1.distanceTo(p2);
		System.out.println(p1);
		System.out.println(p2);

	}
}
