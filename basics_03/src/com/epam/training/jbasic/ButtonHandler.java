package com.epam.training.jbasic;

public class ButtonHandler implements ButtonListener{
	@Override
	public void onButtonClick(Button btn, String str) {
		System.out.println("Button Handler" + str);
	}
}
