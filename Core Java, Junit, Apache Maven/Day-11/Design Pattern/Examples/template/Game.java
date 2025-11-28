package com.example.template;

abstract class Game {
	// template method
	public final void play() {
		start();
		playTurn();
		end();
	}

	abstract void start();

	abstract void playTurn();

	abstract void end();
}
