package com.gmail.alverill;

public class Student extends Human {
	private String univer;
	private String faculty;

	public Student(String name, String sex, int age, String univer, String faculty) {
		super(name, sex, age);
		this.univer = univer;
		this.faculty = faculty;
	}

	public String getUniver() {
		return univer;
	}

	public void setUniver(String univer) {
		this.univer = univer;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public void getInfo() {

		super.getInfo();
		System.out.println("Faculty: " + faculty + ".");
		System.out.println("University: " + univer + ".");
	}

	@Override
	public String toString() {
		return "FirstName= " + getFirstName() + ", secondName= " + getSecondName() + ", age= " + getAge() + ", univer= " + univer + ", faculty= " + faculty+"." ;
	}
	
	

}
