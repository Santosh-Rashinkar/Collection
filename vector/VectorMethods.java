package com.prowings.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorMethods {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		vector.add(10);
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
//		vector.add(60);
//		vector.add(70);
//		vector.add(80);
//		vector.add(90);
//		vector.add(100);
		
		
		System.out.println("Original Vector :"+ vector);
		
		vector.add(1, 110);
		System.out.println("Adding element at index 1 :" + vector);
		
		int size = vector.size();
		System.out.println("Size of the vector :"+size);
		
		int capacity = vector.capacity();
		System.out.println("Capacity of the vector :"+capacity);
		
		// Ensuring capacity
		vector.ensureCapacity(capacity);
		
		vector.removeElementAt(1);
		System.out.println("After removing element At index 1 :" + vector);
		
		int elementAtIndex2 = vector.elementAt(2);
        System.out.println("Element at index 2 :" + elementAtIndex2);
        
        // Enumeration to iterate over elements
        Enumeration<Integer> enumeration = vector.elements();
        System.out.print("Elements in the vector (using Enumeration): ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // Checking if the vector contains an element
        boolean contains = vector.contains(10);
        System.out.println("Does the vector contain '10'? " + contains);

        // Getting the first element
        int firstElement = vector.firstElement();
        System.out.println("First element in the vector: " + firstElement);

        // Getting the last element
        int lastElement = vector.lastElement();
        System.out.println("Last element in the vector: " + lastElement);

        // Index of an element
        int indexOf = vector.indexOf(50);
        System.out.println("Index of '50': " + indexOf);

        // Last index of an element
        int lastIndexOf = vector.lastIndexOf(50);
        System.out.println("Last index of '50': " + lastIndexOf);

        // Clearing the vector
        vector.clear();
        System.out.println("Vector after clearing: " + vector);

        // Checking if the vector is empty
        boolean isEmpty = vector.isEmpty();
        System.out.println("Is the vector empty ? " + isEmpty);

		
		
		
		
	}
	
}
