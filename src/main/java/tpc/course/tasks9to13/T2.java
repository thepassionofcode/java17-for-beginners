package tpc.course.tasks9to13;

import java.util.Scanner;

public class T2{
	public static void main(String[] args){
		/*
		2. Write a program that takes user information, such as age and cash balance,
		and checks whether the person is eligible to purchase a PC game and prints the result.
		The criteria are age and cash.
		You can use your own game or implement the one proposed below.
		The Witcher 3, age: 16+, price: $49.99
		*/

		//game on the shelf
		String title = "The Witcher 3";
		int ageReq = 16;
		float price = 49.99F;

		//solution
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to my shop.");
		System.out.println("I've got the perfect game for you. " + title);

		System.out.println("Please tell me, what is your age?: ");
		int age = Integer.parseInt(scanner.nextLine());

		System.out.println("ok, and your balance?: ");
		float cash = Float.parseFloat(scanner.nextLine());

		System.out.println("Hmm....\nIn that case....");

		//I age - OK cash - OK
		//II age - OK cash - NOT
		//III age - NOT cash - OK
		//IV age - NOT cash - NOT

		if(age >= ageReq && cash >= price) System.out.println("you can buy it. " + title + " is yours. Have a fun!");
		else if(age >= ageReq)
			System.out.println("I'm sorry. Your age is ok, but you do not have enough money.");
		else if(cash >= price)
			System.out.println("I'm sorry. You have cash, but you are too young.");
		else System.out.println("Sorry, you do not have cash, and you are too young.");
	}
}
