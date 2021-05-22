package com.epam.training.jbasic;

import java.lang.reflect.Field;

public class AnnotationMain {

	public static void main(String[] args) throws IllegalAccessException {
		AnnotationEx annotationEx = new AnnotationEx("Test1", "Test2");
		Class<AnnotationEx> annotationExClass = AnnotationEx.class;
		for (Field field : annotationExClass.getDeclaredFields()) {
			StringValueAnnotation annotation = field.getAnnotation(StringValueAnnotation.class);
			if(annotation != null){
				String s = annotation.var().isEmpty() ? "EmptyReplace" : annotation.var();
				field.setAccessible(true);
				field.set(annotationEx, s);
			}
		}
		System.out.println(annotationEx);
	}
}
