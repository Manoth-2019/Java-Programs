package com.cons;

public class Reliance {

	String play = "GAME ";

	public Reliance() {
		System.out.println("SUPER CONST RELIANCE");

	}

	public Reliance(String network) {
		System.out.println(network);
	}

	public Reliance(int pin, int num) {
		System.out.println(pin * num);
	}

	public Reliance(int store, String place) {
		System.out.println(store);
		System.out.println(place);
	}
}
