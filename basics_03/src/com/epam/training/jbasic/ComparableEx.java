package com.epam.training.jbasic;

import java.util.Arrays;

public class ComparableEx implements Comparable<ComparableEx> {

	private final int i;

	public ComparableEx(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "ComparableEx{" +
			   "i=" + i +
			   '}';
	}

	public int getI() {
		return i;
	}

	public static void main(String[] args) {
		Point[] arr = {new Point(), new Point(10), new Point(7, 5), new Point(-10)};
		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr, new PointComparatorX().reversed());

		System.out.println(Arrays.toString(arr));

		ComparableEx[] arr2 = {new ComparableEx(0),
				new ComparableEx(10),
				new ComparableEx(5),
				new ComparableEx(Integer.MAX_VALUE),
				new ComparableEx(Integer.MIN_VALUE)};

		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr2));

		Singleton instance = Singleton.getInstance();
	}

	@Override
	public int compareTo(ComparableEx o) {
		//return i - o.getI();
		return Integer.compare(this.i, o.i);
	}
}
