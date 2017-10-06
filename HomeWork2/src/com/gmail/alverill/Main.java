package com.gmail.alverill;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(-3, 2, 4, 3, 5, -4, -2, -5);
		Triangle t = new Triangle(-2, 1, 3, 3, 1, 0);
		Square s = new Square(-3, 2, 4, 3, 5, -4, -2, -5);
		Doska d = new Doska();

		d.addForm(1, r);
		d.addForm(2, t);
		d.addForm(3, s);
		
		System.out.println(r);
		System.out.println(t);
		System.out.println(s);

		d.remForm(4);
		d.remForm(5);
		d.getInfo();
	
	}

}
