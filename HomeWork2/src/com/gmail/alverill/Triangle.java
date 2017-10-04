package com.gmail.alverill;

public class Triangle extends Shape {
	Point p1 = new Point(0, 0);
	Point p2 = new Point(0, 0);
	Point p3 = new Point(0, 0);

	private double a = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	private double b = Math.sqrt(Math.pow((p1.x - p3.x), 2) + Math.pow((p1.y - p3.y), 2));
	private double c = Math.sqrt(Math.pow((p2.x - p3.x), 2) + Math.pow((p2.y - p3.y), 2));

	@Override
	public double getPerimetr() {
		double p = (a + b + c) / 2.0;
		return p;
	}

	@Override
	public double getArea() {
		double p = getPerimetr();
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return s;

	}

	@Override
	public String toString() {
		return "Triangle [Side a= " + a + ", side b= " + b + ", side c= " + c + ", Perimetr = " + getPerimetr() + ", Area = "
				+ getArea() + "]";
	}
	
	
}