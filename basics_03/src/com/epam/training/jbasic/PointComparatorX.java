package com.epam.training.jbasic;

import java.util.Comparator;

public class PointComparatorX implements Comparator<Point> {
	@Override
	public int compare(Point o1, Point o2) {
		if (Math.abs(o1.getX() - o2.getX()) < 0.001) {
			return 0;
		}
		if (o1.getX() - o2.getX() > 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
