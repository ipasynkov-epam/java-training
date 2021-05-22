package com.epam.training.jbasic;

public class CoffeeBrewBuilder {

	private CoffeeBrew brew;

	public CoffeeBrewBuilder(){
		brew = new CoffeeBrew();
	}
	public CoffeeBrewBuilder addCream(double cream){
		brew.setCream(cream);
		return this;
	}
	public CoffeeBrewBuilder addSugar(double sugar){
		brew.setSugar(sugar);
		return this;
	}
	public CoffeeBrewBuilder addCinnamon(double cinnamon){
		brew.setCinnamon(cinnamon);
		return this;
	}
	public CoffeeBrewBuilder addMarshmallow(double marshmallow){
		brew.setMarshmallow(marshmallow);
		return this;
	}
	public CoffeeBrewBuilder addEspresso2(double espresso2){
		brew.setEspesso2(espresso2);
		return this;
	}
	public CoffeeBrew brewCoffee(){
		return brew;
	}
}
