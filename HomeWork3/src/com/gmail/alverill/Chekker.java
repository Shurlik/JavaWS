package com.gmail.alverill;

public interface Chekker {
	public int chek = 5;

	public static int chekker(Object a, Object b) {
		if (a == null && b != null) {
			return 1;
		}
		if (a != null && b == null) {
			return -1;
		}
		if (a == null && b == null) {
			return 0;
		}
		return chek;
	}

}
