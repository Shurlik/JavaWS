package com.gmail.alverill;

public class Square extends Shape {
	private Point p1 = new Point(0, 0);
	private Point p2 = new Point(0, 0);
	private Point p3 = new Point(0, 0);
	private Point p4 = new Point(0, 0);

	private double b;
	private double c;
	private double d;

	private double a = b = c = d = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));

	@Override
	public double getPerimetr() {
		double p = a * 4;
		return p;
	}

	@Override
	public double getArea() {
		double s = Math.pow(a, 2);
		return s;
	}

	@Override
	public String toString() {
		return "Square [Side b= " + b + ", side c= " + c + ", side d= " + d + ", side a= " + a + ", Perimetr = " + getPerimetr()
				+ ", Area = " + getArea() + "]";
	}
	
	

}