package tpc.course.lessons;

import java.util.Scanner;

public class ScannerPractice{
	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please put your name: ");
		String name = scanner.nextLine();

		System.out.println("Please put your age: ");
		int age = scanner.nextInt();

		System.out.println("Are you smoking: ");
		boolean isSmoking = scanner.nextBoolean();

		System.out.println("Hello " + name);
		System.out.println("Your age is: " + age);
		System.out.println("Your smoking status is: " + isSmoking);
	}
}