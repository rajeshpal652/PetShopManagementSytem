package com.bl.petshop;

public class Duck extends Pet implements Swimable, Flyable {
	
	public Duck() {
		this.name = "DUCK";
		this.colour = colour.WHITE;
	}

	@Override
	public void swim() {
		System.out.println("Duck swims.");
	}

	@Override
	public void fly() {
		System.out.println("Duck flies.");
	}
}
