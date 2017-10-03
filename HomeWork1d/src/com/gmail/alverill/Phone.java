package com.gmail.alverill;

public class Phone {
	private String company;
	private String model;
	private String owner;
	private int number;
	
	public Phone(int number, String company, String model, String owner) {
		super();
		this.company = company;
		this.model = model;
		this.owner = owner;
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public void reg(Network network) {
		network.phoneAdd(this);
		
	}
	public void call(Network network, int number) {
		String s = network.phoneInNetwork(number);
		if (s != "") {
			System.out.println("Calling " + s + "...");
		} else {
			System.out.println("Wrong number!");
		}
		 
	 }
	

	@Override
	public String toString() {
		return "Phone [company=" + company + ", model=" + model + ", owner=" + owner + ", number=" + number + "]";
	}
	
	

}
