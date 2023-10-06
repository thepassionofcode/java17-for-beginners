package tpc.course.lessons;

public class Arrays{
    public static void main(String[] args) {

        //1st way
        System.out.println("Grades");
        int[] grades = new int[4];

        grades[0] = 4;
        grades[1] = 3;
        grades[2] = 2;
        grades[3] = 5;

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);

        //2nd way
        System.out.println("\n Temps");
        double[] temps = {36.4D, 37.0, 38.9};

        for(int i = 0; i < temps.length; i++){
            System.out.println(temps[i]);
        }

        System.out.println("\nBooleans");
        boolean[] booleans = new boolean[5];

        booleans[0] = true;
        booleans[1] = true;
        booleans[3] = true;

        for(boolean element : booleans){
            System.out.println(element);
        }
    }
}