package tpc.course.tasks9to13;

import java.io.IOException;
import java.util.Scanner;

public class T4{
	public static void main(String[] args) throws IOException{
		/*
		4. Write a simple calculator where the user chooses the operation (+-*\/) from the displayed menu,
		then inputs two numbers, and the program returns the correct result. After that, it asks for the
		next operation. For now, forget about floating-point numbers or problems related to dividing by zero.
		Base all calculations on the int type. There will be time for improvements.
		*/

		Scanner scanner = new Scanner(System.in);
		boolean isRunning = true;
		while(isRunning){
			System.out.println("Calculator");

			System.out.println("What operation do you want execute?(1-5)");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");

			System.out.println("Operation: ");
			byte operationCode = scanner.nextByte();

			if(operationCode != 5){
				System.out.println("Input the first number: ");
				int number1 = scanner.nextInt();

				System.out.println("Input the second number: ");
				int number2 = scanner.nextInt();

				int result;
				if(operationCode == 1){
					result = number1 + number2;
					System.out.println("Result: " + number1 + " + " + number2 + " = " + result + "\n\n");
				}
				else if(operationCode == 2){
					result = number1 - number2;
					System.out.println("Result: " + number1 + " - " + number2 + " = " + result + "\n\n");
				}
				else if(operationCode == 3){
					result = number1 * number2;
					System.out.println("Result: " + number1 + " * " + number2 + " = " + result + "\n\n");
				}
				else if(operationCode == 4){
					result = number1 / number2;
					System.out.println("Result: " + number1 + " / " + number2 + " = " + result + "\n\n");
				}
			}
			else{
				System.out.println("See you!");
				isRunning = false;
			}
		}
	}
}
