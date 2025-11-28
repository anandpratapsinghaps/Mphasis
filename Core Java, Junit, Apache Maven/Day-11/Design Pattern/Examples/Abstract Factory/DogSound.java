package com.example.abstractfactory;

//Pet family
class DogSound implements Sound {
	public void makeSound() {
		System.out.println("Dog Barks");
	}
}

class PetType implements Type {
	public void showType() {
		System.out.println("Pet Animal");
	}
}
