package tpc.course.tasks14to18;

import java.util.Scanner;

public class T5{
	public static void main(String[] args){
		/*
		5. Rewrite task 5 from Set of Tasks 2, but this time improve the following things:
			a) persist patients data in an array
			b) update the printing table for the array, but do not print null values
			c) add a variable to control an array size
			d) rewrite the decision-making process from if to switch statement
			e) all data in the pseudo-database has to be uppercase.
			f) provide an age validation between 0 and 150
			g) provide gender validation; there are 2 options: 'M' or 'F'.
			h) provide temperature validation between 30.0 and 47.0 degrees Celsius
		*/

		final Scanner scanner = new Scanner(System.in);
		final int size = 10;

		int patientId = 0;
		String name;
		String surname;
		int age;
		String gender;
		String phoneNumber;
		String address;
		String regDate;
		float temperature;
		boolean isSmoking;

		final String header = "| Id | Name | Surname | Age | Gender | Phone number | Address | Reg. date  | " +
				"Temperature | Smoking status |";

		final String[] records = new String[size];
		final String separator = ", ";

		boolean isRunning = true;
		while(isRunning){
			System.out.println("\nThe medical clinic database");

			System.out.println("What would you like to do?(1-3)");
			System.out.println("1. Display records");
			System.out.println("2. Add patient");
			System.out.println("3. Exit");

			System.out.println("Operation: ");
			byte operation = Byte.parseByte(scanner.nextLine());

			switch(operation){
				case 1 -> {
					System.out.println(header);
					for(String record : records) if(record != null) System.out.println(record);
				}
				case 2 -> {
					String tmpRecord = "";

					//auto-generating patient ID
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
					if(age > 0 && age < 150) tmpRecord += age + separator;
					else{
						System.out.println("The provided age seems to be out of the human range. Try again.\n");
						continue;
					}

					System.out.println("Put a gender (M or F): ");
					gender = scanner.nextLine();
					if(!gender.equals("M") && !gender.equals("F")){
						System.out.println("The provided gender seems not to match. Try again.\n");
						continue;
					}
					else tmpRecord += gender + separator;

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
					if(temperature < 30.0 || temperature > 47.0){
						System.out.println(
								"The stated temperature appears to be beyond human capabilities. Try again.\n");
						continue;
					}
					else tmpRecord += temperature + separator;

					System.out.println("Put a smoking status: ");
					isSmoking = Boolean.parseBoolean(scanner.nextLine());
					tmpRecord += isSmoking;

					//you can create a new variable to store and manipulate the index, but it takes additional memory
					//instead, use an existing variable like patientId

					//toUpperCase() method can appear in each stage where the new data is added, but this is a
					//redundancy and is not desired. A good idea is to write the code only once to reduce
					//the amount of code as much as possible and make it more flexible.
					records[patientId - 1] = tmpRecord.toUpperCase();
				}
				default -> isRunning = false;
			}
		}
	}
}
