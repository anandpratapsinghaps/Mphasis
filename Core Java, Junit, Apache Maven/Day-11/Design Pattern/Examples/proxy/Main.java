package com.example.proxy;

public class Main {
	public static void main(String[] args) {
		Internet net = new InternetProxy();

		net.connectTo("google.com");
		net.connectTo("facebook.com");
	}
}
