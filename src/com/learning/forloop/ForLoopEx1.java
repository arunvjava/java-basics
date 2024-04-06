package com.learning.forloop;

/**
 * Sample class to explain basic for loop
 */
public class ForLoopEx1 {

	public static void iterateItems() {

		String[] arrayofStrings = { "A", "B", "C" };

		/**
		 * Example of indexed based access
		 */
		for (int i = 0; i < arrayofStrings.length; i++) {
			System.out.println(arrayofStrings[i]);
		}

		/**
		 * Advanced for loop example no need to create an index
		 */
		for (String s : arrayofStrings) {
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		iterateItems();
	}

}
