package tpc.course.lessons;

public class FinalKeyword{
    public static void main(String[] args) {

        final int unmodifiable = 4;
        int modifiable = 5;

        System.out.println(unmodifiable);
        System.out.println(modifiable);

        //unmodifiable = 9;
        modifiable = 15;

        System.out.println(unmodifiable);
        System.out.println(modifiable);

        //array context
        //final int[] INTS = new int[4];
        final int[] ints = new int[4];
        ints[0] = 5;
        ints[0] = 10;
        //ints = new int[6];

        final String TWO_WORDS = "two words";
    }
}