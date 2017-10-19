package com.gmail.alverill;

public class Human {
	private String firstName;
	private String secondName;
	private int age;

	public Human(String firstName, String secondName, int age) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public int getAge() {
		return age;
	}

	public void getInfo() {
		System.out.println("First name: " + firstName + ".");
		System.out.println("Second name: " + secondName + ".");
		System.out.println("Age: " + age + ".");
	}

	@Override
	public String toString() {
		return "Human firstName= " + firstName + ", secondName= " + secondName + ", age= " + age;
	}

}
