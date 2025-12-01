package com.examples.lambda;
interface Persons {
	abstract void eat();
}

class TestAbstractClass implements Persons {
	
	@Override
	public void eat() {
		System.out.println("Nice fruits");
	}

	public static void main(String args[]) {
		
		Persons p1= new TestAbstractClass();
		p1.eat();
		
	}

	
}