package tpc.course.tasks4to8;

public class T2{
	public static void main(String[] args){
		/*
		2. Create a simple record in the medical clinic database.
		The record should contain the following data: patient ID, name, surname, age,
		gender, telephone number, address, registration date, temperature, and smoking status.
		Then display the data on the console.
		Remember to assign appropriate types and correct initialization.

		Console output:
		0, Jon, Smith, 44, M, +14842639696, 350 5th Ave. NY 10001, 03-12-2023, 36.6, true
		*/

		int patientId = 0;
		String name = "Jon";
		String surname = "Smith";
		int age = 44;
		char gender = 'M';
		String phoneNumber = "+14842639696";
		String address = "350 5th Ave. NY 10001";
		String regDate = "03-12-2023";
		float temperature = 36.6F;
		boolean isSmoking = true;

		String separator = ", ";

		System.out.println("The medical clinic database");
		System.out.println(patientId + separator +
								   name + separator +
								   surname + separator +
								   age + separator +
								   gender + separator +
								   phoneNumber + separator +
								   address + separator +
								   regDate + separator +
								   temperature + separator +
								   isSmoking);
	}
}
