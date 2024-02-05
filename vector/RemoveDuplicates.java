package com.prowings.vector;

import java.util.HashSet;
import java.util.Vector;

public class RemoveDuplicates {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		vector.add(5);
		vector.add(10);
		vector.add(5);
		vector.add(20);
		vector.add(10);

		// Removing duplicates in-place
		removeDuplicates(vector);

		System.out.println("Vector after removing duplicates: " + vector);
	}

	// Function to remove duplicates from a Vector in-place
	public static void removeDuplicates(Vector<Integer> vector) {

		// Using HashSet to keep track of unique elements
		HashSet<Integer> uniqueSet = new HashSet<>();

		// Indices for traversing the vector
		int i = 0;
		int j = 0;

		while (j < vector.size()) {
			if (uniqueSet.add(vector.get(j))) {

				// Element is unique, keep it and move to the next index
				vector.set(i, vector.get(j));
				i++;
			}
			j++;
		}

		// Truncate the vector to remove the duplicates
		vector.setSize(i);
	}
}