package com.collect;

import java.util.ArrayList;
import java.util.List;

public class Ilist {
	List li = new ArrayList<>();

	private void m2() {
		li = new ArrayList<>();
		li.add("m2");

	}

	private void m1() {
		li.add(20);
		li.add("MK");
		li.add(this.li);
		System.out.print(li);
		int size = li.size();
		System.out.print(size);
		li.clear();
		System.out.print(li);
	}

	public static void main(String[] args) {
		Ilist l = new Ilist();
		l.m1();

	}

}
