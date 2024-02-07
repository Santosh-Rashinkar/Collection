package com.prowings.collectionInterface;
/**
 *  Let's create a program that manages a list of students enrolled in a course.
 *   We'll use a HashSet to store the student names and perform operations such as
 *   adding students, removing students, and displaying the list of students.
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement {

	public static void main(String[] args) {

		Set<String> students = new HashSet<>();

		students.add("Ram");
		students.add("Sanjay");
		students.add("Santosh");

		Scanner scan = new Scanner(System.in);

		int choice;

		do {
			System.out.println(" \nStudent Management System ");
			System.out.println("1. Add a student ");
			System.out.println("2. Remove a student ");
			System.out.println("3. View all students ");
			System.out.println("4. Exit");
			System.out.println("Enter your choice : ");
			choice = scan.nextInt();

			scan.nextLine(); // Consume newline

			switch (choice) {

			case 1:

				System.out.print("Enter student name to add : ");
				String newstudent = scan.nextLine();

				if (students.add(newstudent)) {
					System.out.println(newstudent + " "+ "added successfully.");
				} else {
					System.out.println(newstudent + " "+ "is already enrolled.");

				}
				break;

			case 2:
				System.out.print("Enter student name to remove : ");
				String removedstudent = scan.nextLine();

				if (students.remove(removedstudent)) {

					System.out.println(removedstudent +" "+ "removed successfully.");
				} else {
					System.out.println(removedstudent +" "+ "is not enrolled.");

				}
				break;

			case 3:
				System.out.println("List of enrolled students :");
				for (String Students : students) {
					System.out.println(Students);

				}
				break;
			case 4:
				System.out.println("Exiting....");

				break;

			default:
				System.out.println("Invalid choice . Please try again .");

			}
		} while (choice != 4);

		scan.close();
	}

}
