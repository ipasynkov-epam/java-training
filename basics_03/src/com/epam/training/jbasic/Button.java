package com.epam.training.jbasic;

import java.util.ArrayList;
import java.util.List;

public class Button {
	private String btnText = "Button class text";
	private static String staticBtnText = "Static field text";
	private List<ButtonListener> listenerList = new ArrayList<>();

	public void registerDefaultListener(){
		DefaultButtonListener defaultButtonListener = new DefaultButtonListener();
		defaultButtonListener.changeListenerMessage("change message", true);
		//defaultButtonListener.message = "It's a default outer listener implementation";
		System.out.println(DefaultButtonListener.DEFAULT_MSG);
		listenerList.add(defaultButtonListener);

		class InsideTheMethod{

			public InsideTheMethod(){
				System.out.println("InsideTheMethod object was created");
			}
		}

		new InsideTheMethod();
		new InsideTheMethod();

//		DefaultButtonListener defaultButtonListener2 = new DefaultButtonListener();
//		defaultButtonListener2.changeListenerMessage("It's another default outer listener implementation");
//		listenerList.add(defaultButtonListener2);

	}

	public void registerListener(ButtonListener buttonListener){
		listenerList.add(buttonListener);
	}

	public void clickOnButton(){
		for (ButtonListener buttonListener : listenerList) {
			buttonListener.onButtonClick(this, "someString");
		}
	}

	public static class NestedListener{
		public String str = "nested";
		public void someMethod(){
			Button b = new Button();
			System.out.println(b.btnText);
			System.out.println(Button.staticBtnText);
		}
		public static void soutMethod(){
			System.out.println("this is soutMethod");
		}
	}

	public class DefaultButtonListener implements ButtonListener{

		private String message = "It's a default listener implementation";
		public static final String DEFAULT_MSG = "Listener's DEFAULT_MSG";

		public DefaultButtonListener(String message){
			this.message = message;
		}

		public DefaultButtonListener(){
			this("Default constructor is used");
		}

		public void changeListenerMessage(String message){
			this.message = message;
		}
		public void changeListenerMessage(String message, boolean outer){
			if(outer){
				this.message = Button.this.btnText;
			}else {
				this.message = message;
			}
		}

		@Override
		public void onButtonClick(Button btn, String str) {
			System.out.println(message);
			System.out.println("Button text is: " + btn.btnText);
		}
	}
}
