package com.gmail.alverill;

import java.util.ArrayList;

public class Network {
	private String name;
	private ArrayList<Phone> phoneArray = new ArrayList<Phone>();

	public Network(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void phoneAdd(Phone phone) {
		phoneArray.add(phone);
		

	}

	public String phoneInNetwork(int number) {
		String s = "";
		for (Phone p : phoneArray) {
			if (number == p.getNumber()) {
				s = p.getOwner();
				break;
			}
		}
		return s;

	}

	public void listPhones() {
		for (Phone p : phoneArray) {
			System.out.println(p);
		}
		;
	}

}
