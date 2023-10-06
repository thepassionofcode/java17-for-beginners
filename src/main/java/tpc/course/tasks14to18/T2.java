package tpc.course.tasks14to18;

public class T2{
	public static void main(String[] args){
		/*
		2. Implement a bubble sort algorithm based on arrays of integers.
		*/

		final int[] numbers = {4, 55, -9, 22, 100, -2};

		System.out.println("Unsorted");
		for(int number : numbers) System.out.print(number + " ");

		boolean swapped;
		for(int i = numbers.length - 1; i >= 0; i--){
			swapped = false;
			for(int j = 1; j <= i; j++)
				if(numbers[j - 1] > numbers[j]){
					int tmp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = tmp;
					swapped = true;
				}
			if(!swapped) break;
		}

		System.out.println("\n\nSorted");
		for(int number : numbers) System.out.print(number + " ");
	}
}
