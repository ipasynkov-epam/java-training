package com.epam.training.jbasic;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Menu implements Supplier<Dish> {
	List<Dish> menu = new ArrayList<>();

	public List<Dish> getMenuList(int numOfDishes) {
		if(menu.isEmpty()){
			menu = generateDishes(numOfDishes);
		}
		return menu;
	}

	public List<Dish> getNewMenuList(int numOfDishes) {
		menu = generateDishes(numOfDishes);
		return menu;
	}

	private List<Dish> generateDishes(int numOfDishes) {
		List<Dish> l = new ArrayList<>(numOfDishes);
		Random randomInt = new Random();
		Random randomStr = new Random();
		Random randomType = new Random();
		int a = 97;
		int z = 122;
		int len = 5;
		for (int idx = 0; idx < numOfDishes; idx++) {
			String s = randomStr.ints(a, z + 1)
								.limit(len)
								.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
								.toString();
//			byte[] barr = new byte[5];
//			randomStr.nextBytes(barr);
			DishType[] values = DishType.values();
			Dish d = new Dish(randomInt.nextInt(2000), s, values[randomType.nextInt(3)]);//new String(barr, Charset.forName("UTF-8")));
			l.add(d);
		}
		return l;
	}

	@Override
	public Dish get() {
		Random randomInt = new Random();
		Random randomStr = new Random();
		Random randomType = new Random();
		int a = 97;
		int z = 122;
		int len = 5;
		String s = randomStr.ints(a, z + 1)
							.limit(len)
							.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
							.toString();
		DishType[] values = DishType.values();
		return new Dish(randomInt.nextInt(2000), s, values[randomType.nextInt(3)]);
	}
}
