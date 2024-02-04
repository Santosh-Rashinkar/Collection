package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListSort {

	public static void main(String[] args) {
		
		// create an ArrayList
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(7);
		al.add(5);
		al.add(9);
		al.add(-33);
		al.add(3);
		
		System.out.println(" Unsorted Arraylist : " + al);
		
		al.sort(Comparator.naturalOrder());
		System.out.println(" Sorted Arraylist : " + al);
		
		
		
	}
	
}
