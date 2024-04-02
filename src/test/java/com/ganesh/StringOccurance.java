package com.ganesh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class StringOccurance {

	private void occurence() {

		String given = "JaVA123@oracle.com*ismyDefaultemailIdforGIT&jirainMYproJect9840";

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < given.length(); i++) {
			char single = given.charAt(i);

			if (map.containsKey(single)) {
				Integer integer = map.get(single);
				map.put(single, integer + 1);
			} else {
				map.put(single, 1);

			}

		}
		System.out.println(map);

	}

	private void removeduplicateFromArray() {

		int[] given = { 1, 2, 1, 3, 2, 4 };
		int[] ans = new int[given.length];

		Arrays.sort(given);// 1,1,2,2,3,4
		int count = 0;
		for (int i = 0; i < given.length - 1; i++) {
			if (given[i] != given[i + 1]) {

				ans[count] = given[i];
				count++;

			}
			ans[count] = given[given.length - 1];
			System.out.println("");

		}

		for (int i = 0; i <= count; i++) {
			System.out.println(ans[i]);
		}

	}

	private void dubStringArray() {

		String[] given = { "dog", "cat", "camel", "dog", "tiger", "lion" };
		String[] ans = new String[given.length];

		Arrays.sort(given);// 1,1,2,2,3,4
		int count = 0;
		for (int i = 0; i < given.length - 1; i++) {
			if (given[i] != given[i + 1]) {

				ans[count] = given[i];
				count++;

			}
			ans[count] = given[given.length - 1];
			System.out.println("");

		}

		for (int i = 0; i <= count; i++) {
			System.out.println(ans[i]);
		}
	}

	private void dubsetArrayString() {
		String[] given = { "dog", "cat", "camel", "dog", "tiger", "lion" };

		Set s = new TreeSet<>();

		for (String object : given) {
			s.add(object);

		}

		System.out.println(s);

	}
	

	public static void main(String[] args) {

		StringOccurance scc = new StringOccurance();
		scc.occurence();
		scc.removeduplicateFromArray();
		scc.dubStringArray();
		scc.dubsetArrayString();
	}

}
