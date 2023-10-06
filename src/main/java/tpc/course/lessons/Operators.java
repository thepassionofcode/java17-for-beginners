package tpc.course.lessons;

public class Operators{
	public static void main(String[] args){

		// arithmetical
		int sum = 12 + 5;
		int sub = 30 - 10;
		int mul = 11 * 5;
		float div = (float)15 / 2;
		int mod = 17 % 3;

		System.out.println("12 + 5 = " + sum);
		System.out.println("30 - 10 = " + sub);
		System.out.println("11 * 5 = " + mul);
		System.out.println("15 / 2 = " + div);
		System.out.println("17 % 3 = " + mod);

		//logical
		boolean lc0 = true && true;
		boolean lc1 = true && false;
		boolean lc2 = false && true;
		boolean lc3 = false && false;

		System.out.println("\nlogical AND");
		System.out.println("lc0: " + lc0);
		System.out.println("lc1: " + lc1);
		System.out.println("lc2: " + lc2);
		System.out.println("lc3: " + lc3);

		boolean ld0 = true || true;
		boolean ld1 = true || false;
		boolean ld2 = false || true;
		boolean ld3 = false || false;

		System.out.println("\nlogical OR");
		System.out.println("ld0: " + ld0);
		System.out.println("ld1: " + ld1);
		System.out.println("ld2: " + ld2);
		System.out.println("ld3: " + ld3);

		boolean ln0 = !true;
		boolean ln1 = !false;

		System.out.println("\nlogical NOT");
		System.out.println("ln0: " + ln0);
		System.out.println("ln1: " + ln1);

		//comparatives

		System.out.println("\ncomparatives");
		System.out.println("greater than: " + (5 > 4)); // true
		System.out.println("greater than: " + (5 > 7)); // false
		System.out.println("greater than or equal to: " + (15 >= 15)); // true
		System.out.println("greater than or equal to: " + (5 >= 2)); // true
		System.out.println("greater than or equal to: " + (5 >= 12)); // false

		System.out.println("\nless than: " + (2 < 4)); // true
		System.out.println("less than: " + (8 < 4)); // false
		System.out.println("less than or equal to: " + (3 <= 4)); // true
		System.out.println("less than or equal to: " + (3 <= 3)); // true
		System.out.println("less than or equal to: " + (13 <= 3)); // false

		System.out.println("\nequal to: " + (2 == 2)); // true
		System.out.println("equal to: " + (11 == 2)); // false

		System.out.println("\nnot equal: " + (11 != 2)); // true
		System.out.println("not equal: " + (11 != 11)); // false
	}
}