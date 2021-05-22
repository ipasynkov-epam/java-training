package com.epam.training.jbasic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AnnotationEx {

	@StringValueAnnotation(var = "Value1")
	private String variable;

	@StringValueAnnotation
	private String s;


	public void doSomething(String value){

	}

	@Override
	public String toString() {
		return "AnnotationEx{" +
			   "variable='" + variable + " s='" + s + '\'' +
			   '}';
	}
}
