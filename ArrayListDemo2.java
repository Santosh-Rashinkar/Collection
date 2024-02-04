package com.prowings.arraylist;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		// Creating an ArrayList

		ArrayList<String> al = new ArrayList<>();

		// Adding elements to the ArrayList using add(E element)

		al.add("Java");
		al.add("C++");
		al.add("Python");
		al.add(".Net");
		al.add(" C ");

		// Displaying the ArrayList
		System.out.println("ArrayList after adding elements :" + al);

		// Accessing an element by index using get(int index)
		String elementAtIndex1 = al.get(1);
		System.out.println("Element at index 1 : " + elementAtIndex1);

		// Checking if the list contains a specific element using contains(Object o)
		boolean containsPython = al.contains("Python");
		System.out.println("Does the list contain 'python' ? : " + containsPython);

		// Removing an element using remove(Object o)
		al.remove("C++");
		System.out.println("ArrayList after removing 'c++' : " + al);

		// Checking the size of the ArrayList using size()
		int sizeOfList = al.size();
		System.out.println("Size of the ArrayList : " + sizeOfList);

		// Creating a new ArrayList for demonstration
		ArrayList<String> additionalList = new ArrayList<>();
		additionalList.add("JavaScript");
		additionalList.add("Ruby");

		// Adding all elements from another collection using addAll(Collection<? extends
		// E> c)
		al.addAll(additionalList);
		System.out.println("ArrayList after adding elements from another collection: " + al);

		// Clearing all elements from the ArrayList using clear()
		al.clear();
		System.out.println("Arraylist after clearing all elements : " + al);

	}
}