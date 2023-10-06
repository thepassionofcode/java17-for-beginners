package tpc.course.tasks14to18;

public class T1{
	public static void main(String[] args){
		/*
		1. The Text Analyzer. Write a program that analyzes an inserted text. The result should include the total
		number of characters (without spaces), the number of uppercase letters, the number of lowercase letters,
		the number of numbers, the number of words, and the number of special characters like !.-?""'' etc., except
		" ".
		*/

		final String text = "Lor4em @ipsum dolor Sit amet, $$ consectetur '' \" adipi1scing! elit. ";

		int totalNumberOfChars;
		int numberOfUppercase = 0;
		int numberOfLowercase = 0;
		int numberOfNumbers = 0;
		int numberOfSpecials = 0;
		int numberOfWords;

		//totalNumberOfChars
		final String textWithoutSpaces = text.replace(" ", "");
		totalNumberOfChars = textWithoutSpaces.length();

		//numberOfUppercase, numberOfLowercase, numberOfNumbers, numberOfSpecials
		//The numbers, like 65, 90, etc., correspond with characters from the ASCII
		//(American Standard Code for Information Interchange) table, which is a character encoding standard
		//for electronic communication. So we can use it to set a range to check if any character is contained within.
		//https://en.wikipedia.org/wiki/ASCII
		for(int i = 0; i < totalNumberOfChars; i++){
			if(textWithoutSpaces.charAt(i) >= 65 && textWithoutSpaces.charAt(i) <= 90) ++numberOfUppercase;
			else if(textWithoutSpaces.charAt(i) >= 97 && textWithoutSpaces.charAt(i) <= 122) ++numberOfLowercase;
			else if(textWithoutSpaces.charAt(i) >= 48 && textWithoutSpaces.charAt(i) <= 57) ++numberOfNumbers;
			else ++numberOfSpecials;
		}

		//numberOfWords
		int spaces = 1;
		final String trimmed = text.trim(); //method trim() removes all leading and trailing spaces
		for(int i = 0; i < trimmed.length(); i++)
			if(trimmed.charAt(i) == ' ') ++spaces;

		numberOfWords = spaces;

		System.out.println("Analyzed text: " + text);
		System.out.println("Result:");
		System.out.println("Total number of characters: " + totalNumberOfChars);
		System.out.println("Number of uppercase: " + numberOfUppercase);
		System.out.println("Number of lowercase: " + numberOfLowercase);
		System.out.println("Number of numbers: " + numberOfNumbers);
		System.out.println("Number of special characters: " + numberOfSpecials);
		System.out.println("Number of words: " + numberOfWords);
	}
}
