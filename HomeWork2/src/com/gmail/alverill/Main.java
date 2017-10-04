package com.gmail.alverill;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Square s = new Square();
		Doska d = new Doska();
		
		d.addForm(1, r);
		d.addForm(2, t);
		d.addForm(3, s);
		
		d.remForm(4);
		d.remForm(3);
		d.getInfo();
		

	}

}
