package tpc.course.tasks14to18;

public class T3{
	public static void main(String[] args){
		/*
		3. Write a program called 'The Email Name Generator' that takes an array of names and surnames and creates an
		email array based on a template. The single email should be created using the following template:
			a) beginning of the email based on the first three letters of the name
			b) then the last two letters of the surname
			c) duplicates are not allowed. In that case, generate some number and append it after the surname part.
			d) remember to append the '@tpc.com' suffix
			e) all in lowercase

		Input:
		{
			"Chelsea Valentine",
			"Laurence Miranda",
			"Laurence Miranda",
			"Clementine Lara",
			"Tiago Blackburn",
		};

		Output:
			chene@mycompany.com
			lauda@mycompany.com
			lauda1@mycompany.com
			clera@mycompany.com
			tiarn@mycompany.com
		*/

		//records generated by https://www.name-generator.org.uk/
		final String[] records = {
				"Chelsea Valentine",
				"Laurence Miranda",
				"Laurence Miranda",
				"Clementine Lara",
				"Tiago Blackburn"
		};

		final String[] emails = new String[records.length];
		final String suffix = "@tpc.com";
		int id = 0;

		for(int i = 0; i < records.length; i++){
			String namePart = records[i].substring(0, 3);
			String surnamePart = records[i].substring(records[i].length() - 2);

			String newEmail = (namePart + surnamePart + suffix).toLowerCase();

			boolean exists = false;
			for(String email : emails)
				if(newEmail.equals(email)){
					exists = true;
					break;
				}

			if(exists){
				++id;
				String[] splits = newEmail.split("@");
				emails[i] = splits[0] + id + suffix;
			}
			else emails[i] = newEmail;
		}

		System.out.println("The Email Name Generator");
		for(String email : emails) System.out.println(email);
	}
}
