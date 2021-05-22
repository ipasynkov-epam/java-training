package com.epam.training.jbasic;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ObjectFactory {
	private static ObjectFactory instance = new ObjectFactory();
	private Config config;
	private List<ObjectConfigurator> configurators = new ArrayList<>();

	@SneakyThrows
	private ObjectFactory(){
		HashMap<Class, Class> map = new HashMap<>();
		map.put(Policeman.class, AnotherPoliceman.class);
		config = new JavaConfig("com.epam.training.jbasic", map);
		for (Class<? extends ObjectConfigurator> aClass : config.getScanner().getSubTypesOf(ObjectConfigurator.class)) {
			configurators.add(aClass.getDeclaredConstructor().newInstance());
		}

	}
	public static ObjectFactory getInstance(){
		return instance;
	}

	@SneakyThrows
	public <T> T createObject(Class<T> type){
		Class<? extends T> implClass = type;
		if(type.isInterface()){
			implClass = config.getImplClass(type);
		}
		T t = implClass.getDeclaredConstructor().newInstance();

		for (ObjectConfigurator configurator : configurators) {
			configurator.configure(t);
		}

		return t;
	}
}
