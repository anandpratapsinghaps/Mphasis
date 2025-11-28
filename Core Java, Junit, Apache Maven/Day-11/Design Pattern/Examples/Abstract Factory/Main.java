package com.example.abstractfactory;

public class Main {
	public static void main(String[] args) {

		AnimalFactory factory = new PetFactory(); // change to new WildFactory()

		Sound sound = factory.createSound();
		Type type = factory.createType();

		sound.makeSound();
		type.showType();
	}
}
