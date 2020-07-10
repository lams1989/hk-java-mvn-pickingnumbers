package com.lams1989.pickingnumbers;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {

		List<Integer> c = Arrays.asList(1, 2, 2, 3, 1, 2);

		PickingNumbers.countNumbers(c);

		System.out.println(PickingNumbers.countNumbers(c));
	}
}
