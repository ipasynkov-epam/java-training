package com.epam.training.jbasic;

import java.awt.*;
import java.io.Serializable;
import java.util.Objects;

public final class Point implements Comparable<Point>, Serializable {

	public static final String POINT_CONST = "Point static final field";
	private final double x;
	private final double y;
	private Color color;

	public Point() {
		this(0d, 0d, Color.BLACK);
	}

	public Point(double x, double y) {
		this(x, y, Color.BLACK);
	}

	public Point(double x, double y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public Point(double x) {
		this(x, 0d);
	}

	public static String getStaticConst() {
		return POINT_CONST;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Point point = (Point) o;
		return Double.compare(point.x, x) == 0 &&
			   Double.compare(point.y, y) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public String toString() {
		return "Point with coords: x = " + x + " , y = " + y;
	}

	public double distanceTo(Point p) {
		return Math.sqrt(Math.pow(p.getX() - x, 2) + Math.pow(p.getY() - y, 2));
	}

	public double distanceTo() {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	@Override
	public int compareTo(Point o) { // -int, 0, +int
		double o1 = this.distanceTo();
		double o2 = o.distanceTo();
		if (Math.abs(o1 - o2) < 0.001) {
			return 0;
		}
		if (o1 - o2 > 0) {
			return 1;
		} else {
			return -1;
		}
	}
}
