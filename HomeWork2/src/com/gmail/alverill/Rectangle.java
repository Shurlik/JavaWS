package com.gmail.alverill;

public class Rectangle extends Shape {
	
	
	Point p1 = new Point(0, 0);
	Point p2 = new Point(0, 0);
	Point p3 = new Point(0, 0);
	Point p4 = new Point(0, 0);
	
	

	private double c;
	private double d;
	private double a = c = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
	private double b = d = Math.sqrt(Math.pow((p1.x - p4.x), 2) + Math.pow((p1.y - p4.y), 2));

	@Override
	public double getPerimetr() {
		double p = 2 * (a + b);
		return p;
	}

	@Override
	public double getArea() {
		double s = a * b;
		return s;

	}

	@Override
	public String toString() {
		return "Rectangle [Side c= " + c + ", side d= " + d + ", side a= " + a + ", side b= " + b + ", Perimetr = " + getPerimetr()
				+ ", Area = " + getArea() + "]";
	}
	
	

}
