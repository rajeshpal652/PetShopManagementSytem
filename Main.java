package com.bl.petshop;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Pet Shop");
		
		Cat cat = new Cat();
		cat.id = "C001";
		cat.price = 100;
		Dog dog = new Dog();
		dog.id = "Doo1";
		dog.price = 200;
		Duck duck = new Duck();
		duck.id = "D004";
		duck.price = 500;
		Mouse mouse = new Mouse();
		mouse.id = "M003";
		mouse.price = 50;
		Parrot parrot = new Parrot();
		parrot.id = "P007";
		parrot.price = 600;
		Pigeon pigeon = new Pigeon();
		pigeon.id = "Pi009";
		pigeon.price = 800;
		
		PetRepository petRepository = new PetRepository();
		petRepository.add(cat);
		petRepository.add(dog);
		petRepository.add(duck);
		petRepository.add(mouse);
		petRepository.add(parrot);
		petRepository.add(pigeon);
		
		UserInterface userInterface = new UserInterface();
		userInterface.printAllPets(petRepository.getPetList());
		
		petRepository.remove(pigeon);
		System.out.println("After removal of pigeon");
		userInterface.printAllPets(petRepository.getPetList());
	}
}
