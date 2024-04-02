package com.types;

public class E extends F {

	int i = 20;

	public void m13() {

		System.out.println();

	}

	public void m14(int a) {
		this.i = 20;
		System.out.println(i * a);
	}

	public void m15() {
		super.vijay();
		System.out.println();
	}

	@Override
	public void vijay() {
		super.vijay();
		System.out.println("leo");

	}

	public static void main(String[] args) {

		E e = new E();
		e.vijay();

	}
}
