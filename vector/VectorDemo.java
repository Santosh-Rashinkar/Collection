package com.prowings.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("Java");
		vector.add("Python");
		vector.add("C++");
		vector.add(".Net");

		System.out.println("Original vector : " + vector);

		System.out.println("Element at index 1 : " + vector.elementAt(1));

		vector.remove("Python");

		System.out.println("After removing elements vector : " + vector);

		System.out.println("size of the vector : " + vector.size());
		System.out.println("Capacity of the vector : " + vector.capacity());

		Enumeration<String> enumeration = vector.elements();

		System.out.println("Elements in the vector (using Enumeration) :  ");
		while (enumeration.hasMoreElements()) {

			System.out.print(enumeration.nextElement() + " ");

		}
		System.out.println();
	}

}
