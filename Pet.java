package com.bl.petshop;

public class Pet {
	enum Colour {
		RED, BROWN, BLACK, GREEN, WHITE, BLACK_WHITE, GREY 
	}
	String id;
	String name;
	Colour colour;
	int price;
	
	public void eat() {
		System.out.println(getClass().getSimpleName()+"eats");
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
}
