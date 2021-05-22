package com.epam.training.jbasic;

import java.util.ArrayList;

public class InnerClassEx {
	public static void main(String[] args) {
		Button button = new Button();
		button.registerDefaultListener();
		button.clickOnButton();

		System.out.println(Button.DefaultButtonListener.DEFAULT_MSG);

		Button.NestedListener.soutMethod();

//		System.out.println("--------------------");
//		Button button1 = new Button();
//		Button.DefaultButtonListener dblst = new Button().new DefaultButtonListener();
//		System.out.println(dblst.getClass());
//		dblst.changeListenerMessage("Changed message");
//
//		button1.registerListener(dblst);
//		button1.clickOnButton();
//
//		System.out.println("========================");
//
		Button button2 = new Button();
		int[] lmbdArr = new int[]{0, 0};
		ButtonListener bl = (bu, str) -> {lmbdArr[0]=5;System.out.println("it's lambda" + bu.toString());
		throw new RuntimeException("hello from lambda");};
		ButtonListener bl2 = (bu, str) -> System.out.println("it's lambda2" + bu.toString());
		button2.registerListener((bu, str) -> System.out.println("it's lambda" + bu.toString()));
		button2.registerListener(new ButtonListener() {
			@Override
			public void onButtonClick(Button btn, String str) {
				System.out.println("It's anonymous class");
			}
		});
		button2.clickOnButton();

		ArrayList<String> arrayList = new ArrayList<String>() {
			@Override
			public boolean add(String s) {
				System.out.println("Inside overridden method ADD. Added string: " + s);
				return super.add(s);
			}
		};
		arrayList.add("abc");
		arrayList.add("xyz");

	}
}
