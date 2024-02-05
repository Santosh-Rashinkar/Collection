package com.prowings.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorUsingEnumeration {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<>();

		vector.add("java");
		vector.add("is");
		vector.add("awesome");

		Enumeration<String> enumeration = vector.elements();
		
		while (enumeration.hasMoreElements()) {

			String element = enumeration.nextElement();

			System.out.println(element);
		}
	}
}
