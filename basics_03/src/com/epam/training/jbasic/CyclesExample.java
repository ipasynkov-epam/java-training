package com.epam.training.jbasic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CyclesExample {

	public static void main(String[] args) {
		int[] arr = {0, 1, 2, 3, 4, 5, 6};

//		for(int i = arr.length - 1; i >= 1 ; i -= 3){
//
//			System.out.println(arr[i]);
//		}

		for(int i = 0; checkFor(i); incrementCounter(i)){
			if(i >= arr.length){
				break;
			}

			if(arr[i] == 5){
				break;
			}
			if(arr[i] < 2){
				continue;
			}
			System.out.println(arr[i]);
		}

		while(true){
			break;
		}


//
//		System.out.println("==================");
//
//		List<Integer> list = new ArrayList();
//		list.add(0);
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		for (Integer i : list){
//			System.out.println(i);
//		}
//
//		System.out.println("====================");
//
//		Iterator<Integer> iterator = list.iterator();


//		String value = "";
//		Scanner scanner = new Scanner(System.in);
//		do{
//			System.out.println("Enter value:");
//			value = scanner.next();
//
//		} while (!"15".equals(value));

//		System.out.println("123" == "123");
//		System.out.println("123" == "1" + "2" + "3");
//		System.out.println("123" == new String("123"));
//		System.out.println("123" == new String("123").intern());

	}

	private static int incrementCounter(int i) {
		return i += 2;
	}

	private static boolean checkFor(int i) {
		return i < 5;
	}
}
