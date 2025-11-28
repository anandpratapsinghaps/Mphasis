package com.example.abstractfactory;
//Wild family
class TigerSound implements Sound {
	public void makeSound() {
		System.out.println("Tiger Roars");
	}
}

class WildType implements Type {
	public void showType() {
		System.out.println("Wild Animal");
	}
}
