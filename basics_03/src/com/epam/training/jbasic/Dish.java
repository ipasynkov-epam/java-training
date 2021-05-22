package com.epam.training.jbasic;

import java.util.Objects;

public class Dish {
	private int calories;
	private String name;
	private DishType type;

	public Dish(int calories, String name, DishType type){
		this.calories = calories;
		this.name = name;
		this.type = type;
	}

	public boolean isVegetarian(){
		return calories < 300;
	}

	public int getCalories() {
		return calories;
	}

	public String getName() {
		return name;
	}

	public Dish maxCaloriesDish(Dish d){
		return this.calories > d.getCalories() ? this : d;
	}

	@Override
	public String toString() {
		return "Dish name: " + name + " {cal.= " + calories + " type= " + type + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Dish dish = (Dish) o;
		return calories == dish.calories;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calories);
	}

	public DishType getType() {
		return type;
	}
}
