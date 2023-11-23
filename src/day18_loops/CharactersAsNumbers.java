package day18_loops;
/*
            Characters in String
                Given day36_inheritance.app.access.day36_inheritance.access.a.a String print the ascii value codes for each character
                Ex:
                Input:
                java
                Output:
                106 97 118 97
 */
public class CharactersAsNumbers {
    public static void main(String[] args) {
        String str = "loop";  // length(); --- > 4
        //            0123

        for (int i = 0; i < str.length(); i++) {
            System.out.print((int)str.charAt(i) + " ");
        }



    }

}