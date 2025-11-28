package com.example.bridge;

abstract class Remote {
	protected TV tv; // Bridge

	Remote(TV tv) {
		this.tv = tv;
	}

	abstract void turnOn();

	abstract void turnOff();
}
