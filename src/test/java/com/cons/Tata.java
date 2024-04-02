package com.cons;

public class Tata extends Reliance {

	public Tata() {
		super();
		System.out.println("THIS CONST TATA");
		System.out.println("SUPER CONST RELIANCE");
	}

	public Tata(String network) {
		this(5, "jio");
		System.out.println(network);
	}

	public Tata(int pin, int num) {
		this(50, "");
		System.out.println(pin * num);
		System.out.println();
	}

	public Tata(int store, String place) {
		System.out.println(store);
		System.out.println(place);
		System.out.println(super.play);
	}

	public static void main(String[] args) {
		Tata t = new Tata();
		Tata t1 = new Tata("airtel");
		Tata t3 = new Tata(10, "   1");
	}
}
