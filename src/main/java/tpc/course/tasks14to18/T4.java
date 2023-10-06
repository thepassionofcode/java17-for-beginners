package tpc.course.tasks14to18;

import java.util.Locale;
import java.util.Scanner;

public class T4{
	public static void main(String[] args){
		/*
		4. Extend the calculator project from Set of Tasks 2 as follows:
			a) rewrite the decision-making process from if to switch statement
			b) add floating-point calculations
			c) validate division by zero
			d) add the exponentiation option
			e) add the extraction of a square root option
			f) add the possibility of setting a precision for the calculations
		*/

		final Scanner scanner = new Scanner(System.in);

		byte precision = 2;
		String precisionFormat = "%." + precision + "f";
		double number1;
		double number2;
		double result;
		byte operationCode;

		boolean isRunning = true;
		while(isRunning){
			System.out.println("Calculator");
			System.out.println("\nWhat operation do you want execute?(1-8)");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exponentiation");
			System.out.println("6. Extraction of a square root");
			System.out.println("7. Set precision");
			System.out.println("8. Exit");

			System.out.println("Operation: ");
			operationCode = Byte.parseByte(scanner.nextLine());

			switch(operationCode){
				case 1 -> {
					System.out.println("Input the first number: ");
					number1 = Double.parseDouble(scanner.nextLine());
					System.out.println("Input the second number: ");
					number2 = Double.parseDouble(scanner.nextLine());
					result = number1 + number2;
					System.out.println(
							"Result: " + number1 + " + " + number2 + " = " +
							String.format(Locale.US, precisionFormat, result) + "\n\n");
				}
				case 2 -> {
					System.out.println("Input the first number: ");
					number1 = Double.parseDouble(scanner.nextLine());
					System.out.println("Input the second number: ");
					number2 = Double.parseDouble(scanner.nextLine());
					result = number1 - number2;
					System.out.println(
							"Result: " + number1 + " - " + number2 + " = " +
							String.format(Locale.US, precisionFormat, result) + "\n\n");
				}
				case 3 -> {
					System.out.println("Input the first number: ");
					number1 = Double.parseDouble(scanner.nextLine());
					System.out.println("Input the second number: ");
					number2 = Double.parseDouble(scanner.nextLine());
					result = number1 * number2;
					System.out.println(
							"Result: " + number1 + " * " + number2 + " = " +
							String.format(Locale.US, precisionFormat, result) + "\n\n");
				}
				case 4 -> {
					System.out.println("Input the first number: ");
					number1 = Double.parseDouble(scanner.nextLine());
					System.out.println("Input the second number: ");
					number2 = Double.parseDouble(scanner.nextLine());
					if(number2 == 0){
						System.out.println("Cannot divide by zero.\n\n");
						continue;
					}
					result = number1 / number2;
					System.out.println(
							"Result: " + number1 + " / " + number2 + " = " +
							String.format(Locale.US, precisionFormat, result) + "\n\n");
				}
				case 5 -> {
					System.out.println("Input the first number: ");
					number1 = Double.parseDouble(scanner.nextLine());
					System.out.println("Input the second number: ");
					number2 = Double.parseDouble(scanner.nextLine());
					result = Math.pow(number1, number2);
					System.out.println(
							"Result: " + number1 + " ^ " + number2 + " = " +
							String.format(Locale.US, precisionFormat, result) + "\n\n");
				}
				case 6 -> {
					System.out.println("Input the number: ");
					number1 = Double.parseDouble(scanner.nextLine());
					result = Math.sqrt(number1);
					System.out.println(
							"Result: √ " + number1 + " = " +
							String.format(Locale.US, precisionFormat, result) + "\n\n");
				}
				case 7 -> {
					System.out.println("Input the precision number: ");
					precision = Byte.parseByte(scanner.nextLine());
					precisionFormat = "%." + precision + "f";
					System.out.println("Result: precision set to " + precision + "\n\n");
				}
				default -> {
					System.out.println("See you!");
					isRunning = false;
				}
			}
		}
	}
}
