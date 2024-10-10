package com.cdac;

enum Laptop{
	MAC(2000),
	HP(2200),
	DELL,
	INTEL(5000);
	
	
	private int price;

	private Laptop(int price) {
		this.price = price;
	}

	private Laptop() {
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}


public class BasicDemo {

	public static void main(String[] args) {
		for(Laptop l : Laptop.values()) {
			System.out.println("The enum elements are: " + l + " and the value is :" + l.getPrice());
		}
		}
		
	}