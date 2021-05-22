package com.epam.training.jbasic;

import java.lang.reflect.Field;

public class AnnEx {
	@FieldAnn(value = "Hello")
	private String annotatedField;

	@FieldAnn()
	private String annotatedField2;

	private String notAnnotatedField;

	public String getAnnotatedField() {
		return annotatedField;
	}

	public String getNotAnnotatedField() {
		return notAnnotatedField;
	}

	public String getAnnotatedField2() {
		return annotatedField2;
	}

	public static void main(String[] args) throws IllegalAccessException {
		AnnEx annEx = new AnnEx();

		Class<AnnEx> annExClass = AnnEx.class;
		for (Field field : annExClass.getDeclaredFields()) {
			FieldAnn a = field.getAnnotation(FieldAnn.class);
			if(a != null){
				String value = a.value().isEmpty() ? "Nothing" : a.value();
				field.setAccessible(true);
				field.set(annEx, value);
			}
		}

		System.out.println("annField: " + annEx.getAnnotatedField());
		System.out.println("annField2: " + annEx.getAnnotatedField2());
		System.out.println("notAnnField: " + annEx.getNotAnnotatedField());

	}
}
