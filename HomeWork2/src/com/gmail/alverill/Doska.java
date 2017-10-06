package com.gmail.alverill;

import java.util.Arrays;

public class Doska {

	private Shape[] sh = new Shape[4];

	public void addForm(int a, Shape s) {
		if (1 < a && a > 4) {
			System.out.println("Please, enter the number from 1 to 4 next time.");
		} else {
			a -= 1;
			sh[a] = s;
			System.out.println(s + " added to part " + (a + 1));
		}
	}

	public void remForm(int i) {
		if (1 < i && i > 4) {
			System.out.println("Please, enter the number from 1 to 4 next time.");
		} else {
			i -= 1;
			if (sh[i] != null) {
				sh[i] = null;
				System.out.println("Figure from part " + (i + 1) + " removed.");
			} else {
				System.out.println("Empty place.");
			}
		}

	}

	public void getInfo() {
		double sumS = 0;
		System.out.println("Details:");

		for (int i = 0; i < sh.length; i += 1) {
			if (sh[i] != null) {
				sumS += sh[i].getArea();
			} else {
				continue;
			}
		}
		for (int i = 0; i < sh.length; i += 1) {

			if (sh[i] != null) {
				System.out.println("Info about part " + (i + 1) + ": " + sh[i]);
			} else {
				System.out.println("Info about part " + (i + 1) + ": Empty place.");
			}

		}

		System.out.println("Total S = " + sumS);
	}

	@Override
	public String toString() {
		return "Doska [sh=" + Arrays.toString(sh) + "]";
	}

}
