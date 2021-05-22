package com.epam.training.jbasic;

import java.io.*;

public class SerializableEx implements Serializable {

	private static final int a = 20;
	private final int b = 10;
	private transient final Point p = new Point(10, 5);

	public SerializableEx(){
		System.out.println("constructor is called");
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializableEx s = new SerializableEx();

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream outputStream = new ObjectOutputStream(baos);
		outputStream.writeObject(s);

		System.out.println("out");

		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream inputStream = new ObjectInputStream(bais);
		SerializableEx o = (SerializableEx) inputStream.readObject();


		System.out.println(s == o);
		System.out.println("in");
	}
}
