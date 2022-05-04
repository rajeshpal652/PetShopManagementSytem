package com.bl.petshop;

import java.util.ArrayList;
import java.util.List;

public class PetRepository {
	private List petlist = new ArrayList();
	
	public List getPetList() {
		return petlist;
	}
	
	public void add(Pet pet) {
		petlist.add(pet);
	}
	
	public void remove(Pet pet) {
		petlist.remove(pet);
	}
}
