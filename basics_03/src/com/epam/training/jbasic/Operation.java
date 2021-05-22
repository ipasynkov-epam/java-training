package com.epam.training.jbasic;

public enum Operation {
	PLUS,
	MINUS,
	TIMES,
	DIVIDE;

	public double apply(double a, double b){
		switch (this){
			case PLUS:return a + b;
			case MINUS:return a - b;
			case TIMES:return a * b;
			case DIVIDE:return a / b;
			default:return 0;
		}
	}

	public String toString(){
		switch (this){
			case PLUS:return " + ";
			case MINUS:return " - ";
			case TIMES:return " * ";
			case DIVIDE:return " / ";
			default:return "Unknown";
		}
	}
}
