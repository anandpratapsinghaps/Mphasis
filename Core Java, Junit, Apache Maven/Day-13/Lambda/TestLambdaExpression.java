package com.examples.lambda;

interface Person2 {
	abstract void eat();
}

class TestLambdaExpression {
	public static void main(String args[]) {
		// Person p = new Person() {
		Person2 e = () -> {
			System.out.println("nice fruits");

		};

		e.eat();
	}
}