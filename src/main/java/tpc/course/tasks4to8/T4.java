package tpc.course.tasks4to8;

public class T4{
	public static void main(String[] args){
		/*
		4. You work as a programmer for a company that translates documents written in English into Italian.
		The company bills for its services based on the number of characters in the original document.
		Write a program that will count the number of characters in the given text. Note: spaces are not
		counted as characters for translation.
		For test purposes, use https://www.randomtextgenerator.com/.
		*/

		String originalText = "Is education residence conveying so so. Suppose shyness say ten behaved morning had. " +
				"Any unsatiable assistance compliment occasional too reasonably advantages. Unpleasing has ask acceptance " +
				"partiality alteration understood two. Worth no tiled my at house added. Married he hearing am it totally " +
				"removal. Remove but suffer wanted his lively length. Moonlight two applauded conveying end direction old " +
				"principle but. Are expenses distance weddings perceive strongly who age domestic.";

		int numberOfCharsInText = originalText.replace(" ", "").length();

		System.out.println("Number of characters in the text without spaces: " + numberOfCharsInText);
	}
}
