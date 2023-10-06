package tpc.course.lessons;

public class Conversions{
	public static void main(String[] args){
        /*
        //implicit
        byte b = 10;
        short s = b;

        long l = b;

        double d = s;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("long: " + l);
        System.out.println("double: " + d);

        //explicit
        int i = 129;
        short s2 = (short)i;
        byte b2 = (byte)i; // range: -128 to 127

        System.out.println("int: " + i);
        System.out.println("short2: " + s2);
        System.out.println("byte2: " + b2);
        */

		//string into numbers
		String s0 = "123";
		String s1 = "326.567";

		int i = Integer.parseInt(s0);
		double d = Double.parseDouble(s1);
		double d1 = Double.parseDouble(s0);

		System.out.println("s0: " + s0);
		System.out.println("i: " + i);
		System.out.println("s1: " + s1);
		System.out.println("d: " + d);
		System.out.println("d1: " + d1);

		//numbers into string
		int int0 = 56;
		String num0 = String.valueOf(int0);
		String num1 = String.valueOf(45.33f);
		String num2 = String.valueOf(true);
		String num3 = String.valueOf('$');

		System.out.println("int0: " + int0);
		System.out.println("num0: " + num0);
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
	}
}