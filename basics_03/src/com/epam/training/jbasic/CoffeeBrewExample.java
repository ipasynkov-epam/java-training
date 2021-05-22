package com.epam.training.jbasic;

public class CoffeeBrewExample {

	public static void main(String[] args) {
		CoffeeBrew brew1 = new CoffeeBrew(10, 0, 5, 10);

		CoffeeBrewBuilder cbb = new CoffeeBrewBuilder();
		CoffeeBrew coffeeBrew = cbb.addSugar(5)
								   .addCream(10)
								   .addMarshmallow(10)
								   .addEspresso2(5)
								   .brewCoffee();
		cbb.addCream(10);
		cbb.addMarshmallow(5);
		cbb.addCinnamon(1);
	}
}
