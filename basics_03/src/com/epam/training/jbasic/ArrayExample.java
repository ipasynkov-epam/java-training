package com.epam.training.jbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayExample {
	public static void main(String[] args) {

		int i = 0;
		int[] iA = {10, 20};
		int[] clone = iA.clone();
		System.out.println(iA);
		System.out.println(clone);
		iA[i] = i = 30;
		System.out.println("" + iA[0] + " " + iA[1] + " " + i);

		Object[] oo = new Integer[3];
		oo[0] = "1";

		List<Integer> integers = Arrays.asList(4, 3, 1, 5, 8, 10, 2);
		integers.add(1);
		Integer s = integers.get(0);

		LinkedList l;
		ArrayList a;



//		int[] arr;
//		arr = new int[6];
//		Object[] o = new Object[10];
//		int[] arr2 = {4, 3, 1, 5, 8, 10, 2};
//
//		System.out.println(arr2[1]);
//
//		//int[][] arr = {{1, 2, 5}, {3, 4}};
//
//		int[][] a3 = new int[3][];
//		a3[0] = new int[10];
//		a3[1] = new int[2];
//		a3[2] = new int[3];
//
//		int[] a4;
//		int a5[];
//		int[] a6[];
//
//		System.out.println(arr2.length);
//		System.out.println(arr2);
//
//		System.out.println(Arrays.toString(arr2));
//
//		List<Integer> integers = Arrays.asList(4, 3, 1, 5, 8, 10, 2);
//		System.out.println(integers.get(10));
//
//		//System.out.println(integers.getClass().getName());
//		//integers.add(10);
//
//		Arrays.sort(arr2, 2, 7);
//
//		System.out.println(Arrays.toString(arr2));
//
//		System.out.println(Arrays.binarySearch(arr2, 7));
//
//		int[] ints1 = Arrays.copyOf(arr2, arr2.length - 2);
////
////		System.out.println(Arrays.toString(clone));
//		System.out.println(Arrays.toString(ints1));
//
//		//Arrays.tos
	}
}
