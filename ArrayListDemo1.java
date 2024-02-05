package com.prowings.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		int i = 123;
		float j = 123.54f;
		
		MyStudent s1 = new MyStudent(10,"Ram");
 
	    al.add(i);
		al.add("hello");
		al.add(j);
		al.add(s1);
		al.add(null);
		al.add("hello");


		
		System.out.println("Size : "+al.size());

		System.out.println(al);

	}

}
