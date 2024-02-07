package com.prowings.collectionInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMethods {

	public static void main(String[] args) {

		Collection<String> collection = new ArrayList<>();

		System.out.println("Is collection empty :" + collection.isEmpty());

		collection.add("apple");
		collection.add("banana");
		collection.add("orange");

		System.out.println("Size of collection : " + collection.size());

		System.out.println("Does collection contain 'banana' ? :" + collection.contains("banana"));

		// Creating an iterator to iterate through the collection
		Iterator<String> itr = collection.iterator();

		System.out.println("Elements in the collection : ");

		while (itr.hasNext()) {

			System.out.print(itr.next() + " ");
		}
		System.out.println();

		// Converting the collection to an array
		String[] array = collection.toArray(new String[0]);

		System.out.println("Array from collection : ");

		for (String element : array) {

			System.out.print(element + " ");
		}
		System.out.println();

		collection.remove("banana");
		System.out.println("Collection after removing 'banana' : " + collection);

		Collection<String> anotherCollection = new ArrayList<>();

		anotherCollection.add("grape");
		anotherCollection.add("pineapple");
		collection.addAll(anotherCollection);

		System.out.println("Collection after adding another collection : " + collection);

		collection.removeAll(anotherCollection);

		System.out.println("Collection after removing another collection : " + collection);

		collection.clear();

		System.out.println("Collection after clearing : " + collection);

	}
}
