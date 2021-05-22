package com.epam.training.jbasic.generic;

import java.util.Arrays;

public class JArrayList implements JList{
	private Object[] arr;
	private int size;

	public JArrayList(){
		this(JList.INITIAL_CAPACITY);
	}

	public JArrayList(int initialCapacity) {
		arr = new Object[initialCapacity];
		size = 0;
	}

	public boolean add(Object o){
		ensureCapacity(size + 1);
		arr[size++] = o;
		return true;
	}

	private void ensureCapacity(int i) {
		if(arr.length < i){
			arr = Arrays.copyOf(arr, i * 2);
		}
	}
}
