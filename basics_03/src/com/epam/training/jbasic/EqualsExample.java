package com.epam.training.jbasic;

public class EqualsExample {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point(3, 5);

		if (p1 == p2){
			System.out.println("== true");
		}else{
			System.out.println("== false");
		}
		System.out.println("================");

		if(p1.equals(p2)){
			System.out.println("equals true");
		}else{
			System.out.println("equals false");
		}
	}
}
