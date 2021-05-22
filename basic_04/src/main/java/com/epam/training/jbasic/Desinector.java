package com.epam.training.jbasic;

public class Desinector {

	private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
	private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

	public void start(Room room){
		announcer.announce("Please leave the room");
		policeman.makePeopleLeaveRoom();
		desinfect(room);
		announcer.announce("You may enter the room");
	}

	private void desinfect(Room room) {
		System.out.println("Disinfection is in process");
	}
}
