package com.example.abstractfactory;

//PetFactory
class PetFactory implements AnimalFactory {
	public Sound createSound() {
		return new DogSound();
	}

	public Type createType() {
		return new PetType();
	}
}

//WildFactory
class WildFactory implements AnimalFactory {
	public Sound createSound() {
		return new TigerSound();
	}

	public Type createType() {
		return new WildType();
	}
}
