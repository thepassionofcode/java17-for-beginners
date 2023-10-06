package tpc.course.tasks9to13;

import java.util.Scanner;

public class T5{
	public static void main(String[] args){
		/*
		5. Rewrite the task 2 from the Set of tasks 1 but this time add a menu with 3 choices:
		Display records, Add patient, Exit. Make sure that the medical clinic can dynamically input
		another patient and print them all. Also, implement a simple patient ID generator, like changing an integer
		for instance. As a challenge, wonder how it can be transformed into a regular table with bounds and aligned.
		*/

		Scanner scanner = new Scanner(System.in);

		int patientId = 0;
		String name;
		String surname;
		int age;
		char gender;
		String phoneNumber;
		String address;
		String regDate;
		float temperature;
		boolean isSmoking;

		String header = "| Id | Name | Surname | Age | Gender | Phone number | Address | Reg. date  | Temperature" +
				" | Smoking status |";

		String records = "";
		String separator = ", ";

		boolean isRunning = true;
		while(isRunning){
			System.out.println("The medical clinic database");

			System.out.println("What would you like to do?");
			System.out.println("1. Display records");
			System.out.println("2. Add patient");
			System.out.println("3. Exit");

			System.out.println("Choose the operation (1-3): ");
			byte operation = Byte.parseByte(scanner.nextLine());

			if(operation == 1){
				System.out.println(header);
				System.out.println(records);
			}
			else if(operation == 2){
				String tmpRecord = "";

				// Auto-generating patient ID
				++patientId;
				tmpRecord += patientId + separator;

				System.out.println("Put a name: ");
				name = scanner.nextLine();
				tmpRecord += name + separator;

				System.out.println("Put a surname: ");
				surname = scanner.nextLine();
				tmpRecord += surname + separator;

				System.out.println("Put an age: ");
				age = Integer.parseInt(scanner.nextLine());
				tmpRecord += age + separator;

				System.out.println("Put a gender: ");
				gender = scanner.nextLine().charAt(0);
				tmpRecord += gender + separator;

				System.out.println("Put a phone number: ");
				phoneNumber = scanner.nextLine();
				tmpRecord += phoneNumber + separator;

				System.out.println("Put an address: ");
				address = scanner.nextLine();
				tmpRecord += address + separator;

				System.out.println("Put a registration date: ");
				regDate = scanner.nextLine();
				tmpRecord += regDate + separator;

				System.out.println("Put a temperature: ");
				temperature = Float.parseFloat(scanner.nextLine());
				tmpRecord += temperature + separator;

				System.out.println("Put a smoking status: ");
				isSmoking = Boolean.parseBoolean(scanner.nextLine());
				tmpRecord += isSmoking;

				records += tmpRecord + "\n";
			}
			else isRunning = false;
		}
	}
}
