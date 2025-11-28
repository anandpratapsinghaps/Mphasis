package com.example.bridge;

class BasicRemote extends Remote {
	BasicRemote(TV tv) {
		super(tv);
	}

	void turnOn() {
		tv.on();
	}

	void turnOff() {
		tv.off();
	}
}
