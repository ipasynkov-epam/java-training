package com.epam.training.jbasic;

public class SimpleAnnouncer implements Announcer {

	private Advertizer adv = ObjectFactory.getInstance().createObject(Advertizer.class);

	@Override
	public void announce(String message) {
		adv.adverize();
		System.out.println("A: " + message);
	}
}
