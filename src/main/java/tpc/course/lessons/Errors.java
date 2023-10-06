package tpc.course.lessons;

import java.util.Scanner;

public class Errors{
	public static void main(String[] args){

		// lack of ; , + () {} [] ""
		int age = 33;
		System.out.println("This is my age: " + age);

		if(age == age){

		}

		String ageText = String.valueOf(age);

		long views = 124210943124580L;
		short shortViews = (short)views;
		System.out.println(shortViews);

		Scanner scanner = new Scanner(System.in);
		//double temp = scanner.nextDouble();

		String s = "55";
		int a = Integer.parseInt(s);
		System.out.println("Parse int: " + a);

		int input0 = 15;
		int input1 = 3;

		if(input1 == 0) System.out.println("Cannot divide by 0.");
		else System.out.println(input0 / input1);

		int[] arr = {1, 2, 3, 4, 5};
		for(int i = 0; i <= arr.length; i++)
			System.out.println(arr[i]);
	}
}