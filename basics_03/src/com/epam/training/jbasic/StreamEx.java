package com.epam.training.jbasic;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamEx {
	public static void main(String[] args) throws IOException {
		Menu menu = new Menu();
		List<Dish> menuList = menu.getMenuList(1500);
		Stream<Dish> stream = menuList.stream();
//		stream.forEach(System.out::println);



		Map<DishType, Long> collect1 = stream.collect(groupingBy(Dish::getType, counting()));
//		Map<DishType, List<Dish>> collect = (Map<DishType, List<Dish>>) collect1;
		System.out.println(collect1);

		//		System.out.println(stream.map(dish -> 1).reduce(0, (i1, i2) -> i1 + i2));

//		Optional<Dish> collect1 = stream.collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCalories)));
//		Double collect2 = stream.collect(averagingInt(Dish::getCalories));
//		String collect = stream.map(Dish::getName).collect(joining("***"));
//		List<String> collect = stream.map(Dish::getName).distinct().collect(Collectors.toList());
//		System.out.println(collect);

//		System.out.println(collect1.isPresent() ? collect1.get().toString() : "none found");

		//		Stream<String> integerStream = Stream.of(new String[]{"1", "a", "v"});
		//
		//		Stream<String> stream1 = Arrays.stream(new String[]{"1", "a", "v"});
		//
		////				Stream<Integer> iterate = Stream.iterate(0, integer -> integer + 2);
		//		Stream<Dish> generate = Stream.generate(new Menu());
		//		generate.forEach(System.out::println);
		//
		//		IntStream.generate(new IntSupplier() {
		//			@Override
		//			public int getAsInt() {
		//				return 0;
		//			}
		//		});


		//		Predicate<Dish> pr100 = dish -> dish.getCalories() > 1000;
		//		Predicate<Dish> pr1000 = dish -> dish.getCalories() < 1500;
		//		Predicate<Dish> dishPredicate = pr100.and(pr1000).or(dish -> dish.isVegetarian());
		//
		//		Function<Dish, Dish> func1 = dish -> new Dish(dish.getCalories() / 2, dish.getName().substring(0, 3));
		//		Function<Dish, String> dishStringFunction = func1.andThen(dish -> dish.toString());
		//
		//		BinaryOperator<Dish> bo = (dish1, dish2) -> new Dish(dish1.getCalories() + dish2.getCalories(), "mixture");
		//
		//		Integer reduce1 = stream.filter(Dish::isVegetarian)
		//								//							   .map(dish -> Integer.valueOf(dish.getCalories()))
		//								.distinct()
		//								.limit(5)
		//								.map(Dish::getCalories)
		//								.reduce(0, (i1, i2) -> i1 + i2);
		//		Optional<Integer> reduce = reduce1;
		//		System.out.println(reduce.isPresent() ? reduce.toString() : "Empty optional");


		//			  .forEach(System.out::println);
		//System.out.println(any.isPresent() ? any.get().getName() : "Stream is empty");
		//			  .noneMatch(dish -> dish.getCalories() < 1200));
		//			  .forEach(System.out::println);


		//		stream.filter(dish -> dish.getName().startsWith("a")).skip(10).forEach(System.out::println);
		//
		//		stream.filter(range).forEach(System.out::println);
		//
		//		stream.filter(dish -> dish.isVegetarian()).forEach(System.out::println);


		//		Stream<Dish> stream = menu.getMenuList(100).stream();
		//		Predicate<Dish> p = dish -> dish.isVegetarian();
		//
		//		Stream<String> stringStream1 = Stream.of("1", "2");
		//		IntStream stream1 = Arrays.stream(new int[]{1, 3});
		//		//Stream<String> lines = Files.lines(Paths.get("data.txt"), Charset.defaultCharset());
		//
		//		Stream<Dish> generate = Stream.generate(new Menu());
		//		String collect = generate.limit(10)//.forEach(System.out::println);
		//								 //										 .collect(Collectors.summingInt(Dish::getCalories));
		//								 .map(Dish::toString).collect(Collectors.joining(","));
		//		System.out.println(collect);

		//NavigableSet

		//		Function<Dish, String> f = dish -> dish.getName() + " cals: " + dish.getCalories();
		//
		//		Optional<Dish> reduce = stream.reduce(Dish::maxCaloriesDish);
		//		System.out.println(reduce.isPresent() ? reduce.get().toString() : "none");
		//
		//		System.out.println(stream
		//				.map(Dish::getCalories)
		//				.reduce(0, (i1, i2) -> i1 + i2));
		//
		//		//		System.out.println(stream.noneMatch(dish -> dish.getCalories() < 50));
		//
		//		String s1 = stream.filter(range)
		//						  .map(dish -> dish.getName() + " cals: " + dish.getCalories())
		//						  .filter(s -> s.startsWith("a") || s.startsWith("b"))
		//						  .map(s -> s.split(" "))
		//						  .flatMap(Arrays::stream)
		//						  .filter(s -> !s.equals("cals:"))
		//						  .findAny().orElse("none");
		//		//.forEach(System.out::println);
		//		System.out.println(s1);
		//
		//
		//		Stream<String> stringStream = stream.map(dish -> dish.getName() + " cals: " + dish.getCalories());
		//		//stringStream.forEach(System.out::println);
		//
		//		stringStream.filter(s -> s.startsWith("a")).forEach(System.out::println);
		//

	}
}
