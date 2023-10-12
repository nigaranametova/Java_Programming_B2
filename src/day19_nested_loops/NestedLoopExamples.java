package day19_nested_loops;

public class NestedLoopExamples {

    public static void main(String[] args) {
        // Outer Loop
        for (int i = 0; i < 5; i++) {      // i=0 ; 0 < 5 | i=1; 1 < 5

            System.out.println("A" + i);    // A0A1

            // Inner loop
            for (int j = 0; j < i; j++) {   // j=0 : 0 < 0 | 0 < 1

                System.out.println("B" + j);
            }
        }
    }
}
