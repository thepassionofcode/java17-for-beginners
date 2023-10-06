package tpc.course.tasks9to13;

import java.util.Scanner;

public class T1{
	public static void main(String[] args){
		/*
		1. Write the program that takes standard input (by the Scanner class) data of the student,
		like name, surname, number on a list, grade from math, grade from history, grade from a foreign language,
		then calculates the average of grades and displays all details on the console.
		*/

		//create a scanner object to be able to fetch input from the user
		Scanner scanner = new Scanner(System.in);

		System.out.println("What is your name?: ");
		String name = scanner.nextLine();

		System.out.println("What is your surname?: ");
		String surname = scanner.nextLine();

		System.out.println("What is your number on a list?: ");
		int numberOnList = Integer.parseInt(scanner.nextLine());

		System.out.println("What is your math grade?: ");
		int mathGrade = Integer.parseInt(scanner.nextLine());

		System.out.println("What is your history grade?: ");
		int historyGrade = Integer.parseInt(scanner.nextLine());

		System.out.println("What is your foreign language grade?: ");
		int foreignLangGrade = Integer.parseInt(scanner.nextLine());

		//one of the factors has to be floating-point to make sure the result will also be floating-point and correct
		float avg = (mathGrade + historyGrade + foreignLangGrade) / 3.0F;

		System.out.println("Student " + name + " " + surname);
		System.out.println("Number on a list: " + numberOnList);
		System.out.println("Math grade: " + mathGrade);
		System.out.println("History grade: " + historyGrade);
		System.out.println("Foreign language grade: " + foreignLangGrade);
		System.out.println("Average grade: " + avg);
	}
}
