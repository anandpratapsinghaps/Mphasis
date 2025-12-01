package com.examples.lambda;

interface Person {
	abstract void eat();
}

class TestAnonymousInner {
	public static void main(String args[]) {
		
		Person p = new Person() {
			public void eat() {
				System.out.println("nice anonymous fruits");
			}
		};
		p.eat();
	}
}