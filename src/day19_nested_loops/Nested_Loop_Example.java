package day19_nested_loops;

public class Nested_Loop_Example {
    public static void main(String[] args) {
        // outer loop
        for (int week = 1; week <= 4; week++) {

            System.out.println("Week: " + week);

            //inner loop
            for ( int day = 1; day <= 7; day++) {
                System.out.println("Day " + day);
            }

            System.out.println();
        }
    }
}
