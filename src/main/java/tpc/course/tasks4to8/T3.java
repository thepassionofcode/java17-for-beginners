package tpc.course.tasks4to8;

public class T3{
	public static void main(String[] args){
		/*
		3. Write a program that converts text written in lowercase letters into text written in uppercase letters.
		Then display the original text and then the transformed one.
		*/

		//the text comes from: https://www.lipsum.com/
		String lowerCase = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur varius a felis vel " +
				"rhoncus. Ut imperdiet placerat risus, eu malesuada massa aliquet vel. Duis euismod ornare " +
				"malesuada. Duis ac ex nisl. Vivamus quis est a nisl congue varius. Donec mattis nulla lacus, id " +
				"consectetur leo ornare eget. Aenean enim enim, malesuada non facilisis sit amet, sagittis in leo" +
				". Ut nibh erat, condimentum id tempor vitae, porttitor in diam. In lobortis non lacus sed " +
				"finibus. Phasellus enim dolor, aliquet elementum ornare eu, mollis ut tellus. Etiam efficitur " +
				"eget massa mattis suscipit. Fusce arcu mauris, malesuada ac elit vel, pellentesque varius orci. " +
				"Duis quam dui, viverra eu tellus ut, accumsan vestibulum odio. Sed nec enim at erat ultricies " +
				"facilisis. Phasellus auctor enim vitae est tempor commodo. Praesent eu est non neque sollicitudin " +
				"ullamcorper. Etiam ornare dignissim dapibus. Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
				"Fusce et nisl pretium, faucibus enim eu, tincidunt metus. Etiam commodo lorem leo, vitae mollis ipsum" +
				" porttitor eget. Phasellus at arcu et velit varius auctor dignissim ut neque. Morbi blandit eget" +
				" velit sit amet vestibulum.";

		String upperCase = lowerCase.toUpperCase();

		System.out.println("Lower case:");
		System.out.println(lowerCase);

		System.out.println("\nUpper case:");
		System.out.println(upperCase);
	}
}
