package com.gmail.alverill;

public class FullGroupException extends Exception {
	@Override
	public String getMessage() {
		return " The group is full!";
	}

}
