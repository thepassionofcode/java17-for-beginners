package tpc.course.lessons;

public class Loops{
	public static void main(String[] args){

		//for
		                                 // counter = counter + 1
        /*
        for(int counter = -100; counter <= 10; counter = counter + 3){
            System.out.println("number of iteration: " + counter);
        }*/

		//while
		int c = 0;
		while(c < 10){
			System.out.println("number " + c);
			c++;
		}

		System.out.println("\n do while");

		int v = 10;
		do{
			System.out.println("number " + v);
		} while(v > 100);

		int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for(int e : ints) System.out.println(e);

		ints[2] = 444;

		for(int e : ints) System.out.println(e);

		//        ints.length;
		////index  0  1  2  3  4  5  6  7  8  9
		//        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	}
}