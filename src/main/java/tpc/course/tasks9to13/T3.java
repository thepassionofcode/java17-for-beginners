package tpc.course.tasks9to13;

public class T3{
	public static void main(String[] args){
		/*
		3. Write a simple multiplication table from 0 to 9. Make sure that the result is displayed on the
		console in square 10x10, where the first row and the first column are the headers.
		Try to align the results as they are in the example.
		*/

		System.out.println("Multiplication table");
		for(int i = 0; i < 10; i++){
			System.out.print(i + "   ");
			for(int j = 1; j < 10; j++){
				if(i == 0) System.out.print(j + "   ");
				else{
					int result = i * j;
					if(result >= 10) System.out.print(result + "  ");
					else System.out.print(result + "   ");
				}
			}
			System.out.println();
		}
	}
}
