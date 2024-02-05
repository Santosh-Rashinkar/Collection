package com.prowings.vector;

import java.util.ListIterator;
import java.util.Vector;

public class VectorUsingListIterator {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("java");
		vector.add("is");
		vector.add("awesome");

		ListIterator<String> listIterator = vector.listIterator();

		while (listIterator.hasNext()) {
			String element = listIterator.next();

			System.out.println(element);
		}
	}
}
