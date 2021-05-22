package com.epam.training.jbasic;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.Map;
import java.util.Set;

public class JavaConfig implements Config {

	@Getter
	private Reflections scanner;
	private Map<Class, Class> ifc2ImplClass;

	public JavaConfig(String packagesToScan, Map<Class, Class> ifc2ImplClass){
		this.scanner = new Reflections(packagesToScan);
		this.ifc2ImplClass = ifc2ImplClass;
	}

	@Override
	public <T> Class<? extends T> getImplClass(Class<T> ifc) {
		return ifc2ImplClass.computeIfAbsent(ifc, aClass -> {
			Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
			if (classes.size() != 1) {
				throw new RuntimeException("0 or more than 1 implementations");
			}
			return classes.iterator().next();
		});
	}
}
