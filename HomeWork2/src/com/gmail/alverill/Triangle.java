package com.gmail.alverill;

public class Triangle extends Shape {

	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double a;
	private double b;
	private double c;

	private Point p1;
	private Point p2;
	private Point p3;

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.x3 = x3;
		this.y3 = y3;

		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);

		this.a = getSide(this.p1.getX(), this.p1.getY(), this.p2.getX(), this.p2.getY());
		this.b = getSide(this.p3.getX(), this.p3.getY(), this.p1.getX(), this.p1.getY());
		this.c = getSide(this.p3.getX(), this.p3.getY(), this.p2.getX(), this.p2.getY());

	}

	private double getSide(double a, double b, double c, double d) {
		double side = Math.sqrt(Math.pow((c - a), 2) + Math.pow((d - b), 2));
		return side;
	}

	public void getNums() {
		System.out.println(x1 + " " + y1 + " " + x2 + " " + y2 + " " + x3 + " " + y3);
	}

	public void getPoints() {
		System.out.println("P1 = x:" + this.p1.getX() + " y:" + this.p1.getY());
		System.out.println("P2 = x:" + this.p2.getX() + " y:" + this.p2.getY());
		System.out.println("P3 = x:" + this.p3.getX() + " y:" + this.p3.getY());
	}

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
		return "Triangle [Side a= " + a + ", side b= " + b + ", side c= " + c + ", Perimetr = " + getPerimetr()
				+ ", Area = " + getArea() + "]";
	}

}