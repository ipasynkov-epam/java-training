package com.epam.training.jbasic;

public enum OperationEnh {

	PLUS("+"){public double apply(double a, double b){return a + b;}},
	MINUS("-"){public double apply(double a, double b){return a - b;}},
	TIMES("*"){public double apply(double a, double b){return a * b;}},
	DIVIDE("/"){public double apply(double a, double b){return a / b;}},
	POW("^"){public double apply(double a, double b){return Math.pow(a, b);}};

	private final String symbol;

	OperationEnh(String symbol){
		this.symbol = symbol;
	}
	@Override
	public String toString(){
		return "Operation is: " + symbol;
	}

	public abstract double apply(double a, double b);
}
