package com.epam.training.jbasic;

public class CoffeeBrew {

	private double espresso = 0d;
	private double cream = 0d;
	private double sugar = 0d;
	private double cinnamon = 0d;
	private double marshmallow = 0d;
	private double cookie = 0d;
	private double espesso2 = 0d;

	public CoffeeBrew(){
		this.espresso = 10d;
	}
	public CoffeeBrew(double cream){
		this();
		this.cream = cream;
	}

	public CoffeeBrew(double cream, double cinnamon){
		this(cream);
		this.cinnamon = cinnamon;
	}

	public CoffeeBrew(double cream, double cinnamon, double sugar){
		this(cream, cinnamon);
		this.sugar = sugar;
	}

	public CoffeeBrew(double cream, double cinnamon, double sugar, double marshmallow){
		this(cream, cinnamon, sugar);
		this.marshmallow = marshmallow;
	}

	public CoffeeBrew(String brewName){
		switch (brewName){
			case ("espresso"):
		}
	}

	public void setEspresso(double espresso) {
		this.espresso = espresso;
	}

	public void setCream(double cream) {
		this.cream = cream;
	}

	public void setSugar(double sugar) {
		this.sugar = sugar;
	}

	public double getCinnamon() {
		return cinnamon;
	}

	public void setMarshmallow(double marshmallow) {
		this.marshmallow = marshmallow;
	}

	public void setCinnamon(double cinnamon) {
		this.cinnamon = cinnamon;
	}

	public void setEspesso2(double espesso2) {
		this.espesso2 = espesso2;
	}

}
