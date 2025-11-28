package com.example.bridge;

public class Main {
	public static void main(String[] args) {

		Remote remote1 = new BasicRemote(new SonyTV());
		remote1.turnOn();
		remote1.turnOff();

		Remote remote2 = new BasicRemote(new SamsungTV());
		remote2.turnOn();
		remote2.turnOff();
	}
}
