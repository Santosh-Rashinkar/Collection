package com.prowings.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Define a class representing a Student
class Student {

	String name;
	int age;

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {

		return Integer.compare(s1.age, s2.age);
	}
}

public class ComparatorExample {

	public static void main(String[] args) {

		// Create a list to store Student objects
		List<Student> studentList = new ArrayList<>();

		// Add three Student objects to the list
		studentList.add(new Student("Sanjay", 23));
		studentList.add(new Student("Santosh", 22));
		studentList.add(new Student("Ram", 20));
		studentList.add(new Student("Charlie", 18));

		// Display the original list
		System.out.println("Original List :");

		for (Student student : studentList) {

			System.out.println("Name :" + student.name + ",Age :" + student.age);
			
			// Create a copy of the list for sorting
			List<Student> sortedList = new ArrayList<>(studentList);

			// Sorting the list using a custom Comparator (AgeComparator)
			Collections.sort(sortedList, new AgeComparator());

			// Display the sorted list
			System.out.println("\nSorted List (based on age):");
		}
		for (Student student : studentList) {

			System.out.println("Name :" + student.name + ",Age :" + student.age);
		}
	}
}
	

