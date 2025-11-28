package com.example.bridge;

class SonyTV implements TV {
	public void on() {
		System.out.println("Sony TV ON");
	}

	public void off() {
		System.out.println("Sony TV OFF");
	}
}

class SamsungTV implements TV {
	public void on() {
		System.out.println("Samsung TV ON");
	}

	public void off() {
		System.out.println("Samsung TV OFF");
	}
}
