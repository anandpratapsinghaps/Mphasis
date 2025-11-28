package com.example.template;

class Chess extends Game {
	void start() {
		System.out.println("Chess: Setup board");
	}

	void playTurn() {
		System.out.println("Chess: Move piece");
	}

	void end() {
		System.out.println("Chess: Checkmate");
	}
}

class Football extends Game {
	void start() {
		System.out.println("Football: Kickoff");
	}

	void playTurn() {
		System.out.println("Football: Players running");
	}

	void end() {
		System.out.println("Football: Full Time");
	}
}
