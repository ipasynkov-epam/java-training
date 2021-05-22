package com.epam.training.jbasic;

import java.util.ArrayList;
import java.util.List;

public class SwitchExample {

	public static void main(String[] args) {
		// SOLID
		// O - open for extension, closed for modification
		example(new SummerHandler());


		List<EnumHandler> handlerList = new ArrayList<>();
		handlerList.add(new SummerHandler());
		handlerList.add(new WinterHandler());
		handlerList.add(new ChildDefaultHandler());
		handlerList.add(new AutumnHandler());

		EnumExample randomEnum = EnumExample.SPRING;
		for (EnumHandler handler : handlerList){
			if (handler.canProcess(randomEnum)){
				handler.process(randomEnum);
				break;
			}
		}
//		if (!handlerFound){
//			// TODO
//			new DefaltHandler().process(randomEnum);
//		}

		//		switch(getRandomEnum()){
//			case SUMMER:{
//				System.out.println("Summer");
//				break;}
//			case WINTER:
//				System.out.println("Winter");
//				break;
//			case AUTUMN:
//			case BETWEEN_SPRING_AND_SUMMER:
//			case SPRING:
//				System.out.println("Mud");
//				break;
//			default:
//				System.out.println("default");
//		}
//		switch(getRandom()){
//			case 1:
//				System.out.println("1");
//				break;
//			case 2:
//				System.out.println("2");
//				break;
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("Group 3 - 5");
//				break;
//			default:
//				System.out.println("default");
//		}
	}

	private static void example(EnumHandler handler){
		
	}

	private static EnumExample getRandomEnum() {
		EnumExample[] values = EnumExample.values();
		int idx = (int) (Math.random() * (values.length - 1));
		System.out.println("generated value is: " + values[idx]);
		return values[idx];
	}

	private static int getRandom() {
		int rand = (int) (Math.random() * 6);
		System.out.println("getRandom: " + rand);
		return rand;

	}
}
