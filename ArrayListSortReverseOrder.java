package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSortReverseOrder {

	public static void main(String[] args) {
		
		// create an ArrayList
		ArrayList<String> al = new ArrayList<>();
		
		// add elements to ArrayList
	     al.add("Python");
	     al.add("Swift");
	     al.add("C");
	     al.add("JavaScript");
	     
	    System.out.println("Unsorted ArrayList: " +  al );
		
	    // sort the ArrayList in ascending order
		al.sort(Comparator.reverseOrder());
		System.out.println(" Sorted ArrayList : " + al);
		
		
		
	}
	
}
