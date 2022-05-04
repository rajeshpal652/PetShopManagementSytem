package com.bl.petshop;

public class Dog extends Pet implements Swimable {
	
	public Dog() {
		name = "DOG";
		colour = colour.BROWN;
	}

	@Override
	public void swim() {
		System.out.println("Dog swims.");
	}
}
