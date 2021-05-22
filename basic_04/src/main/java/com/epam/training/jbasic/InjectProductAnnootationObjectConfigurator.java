package com.epam.training.jbasic;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class InjectProductAnnootationObjectConfigurator implements ObjectConfigurator{

	public InjectProductAnnootationObjectConfigurator(){

	}


	@Override
	@SneakyThrows
	public void configure(Object t) {
		Class<?> implClass = t.getClass();
		for (Field field : implClass.getDeclaredFields()) {
			InjectProduct annotation = field.getAnnotation(InjectProduct.class);
			String path = ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
			String s = new BufferedReader(new FileReader(path)).readLine();
			String[] split = s.split("=");
			Map<String, String> props = new HashMap<>();
			props.put(split[0], split[1]);
			if (annotation != null){
				String value;
				if (annotation.product().isEmpty()){
					value = props.get(field.getName());
				}else{
					value = props.get(annotation.product());
				}
				field.setAccessible(true);
				field.set(t, value);
			}
		}
	}
}
