package com.epam.training.jbasic;

import java.awt.*;

public class Line {

	private Point startPoint;
	private Point endPoint;
	private Color color;

	public Line(Point start, Point end){
		startPoint = start;
		endPoint = end;
		color = new Color(255, 255, 255);
	}

	public Point getEndPoint() {
		Point p = new Point(endPoint.getX(), endPoint.getY());
		return p;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public Color getColor() {
		return color;
	}

	public double lineLength(){
		return startPoint.distanceTo(endPoint);
	}
}
