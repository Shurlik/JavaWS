package com.gmail.alverill;

public class Cat {
	private String name;
	private double age;
	private double weight;
	private boolean homeCat;
	
	public Cat(String name, double age, double weight, boolean homeCat) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.homeCat = homeCat;
	}

	public String getName() {
		return name;
	}

	
	public boolean isHomeCat() {
		return homeCat;
	}

	public void setHomeCat(boolean homeCat) {
		this.homeCat = homeCat;
	}

	public double getAge() {
		return age;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", weight=" + weight +" Kg" + ", homeCat=" + homeCat + "]";
	}
	
	
	

}
