package com.epam.training.jbasic;

public class SimpleAdvertizer implements Advertizer{

	@InjectProduct
	private String product;

	@Override
	public void adverize() {
		System.out.println("AV: advertizing: " + product);
	}
}
