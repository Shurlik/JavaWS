package com.gmail.alverill;

public class Rectangle extends Shape {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x4;
	private double y4;
	private double a;
	private double b;
	private double c;
	private double d;

	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;

	public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;
		this.x4 = x4;
		this.y4 = y4;
		
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		this.p4 = new Point(x4, y4);
		
		this.a = this.c = getSide(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
		this.b = this.d = getSide(this.p4.getX(), this.p4.getY(), this.p1.getX(), this.p1.getY());
	}

	private double getSide(double a, double b, double c, double d) {
		double side = Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2));
		return side;
	}

	
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
		return "Rectangle [Side c= " + c + ", side d= " + d + ", side a= " + a + ", side b= " + b + ", Perimetr = "
				+ getPerimetr() + ", Area = " + getArea() + "]";
	}

}
