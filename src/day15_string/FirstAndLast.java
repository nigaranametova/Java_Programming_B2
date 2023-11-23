package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day36_inheritance.app.access.day36_inheritance.access.a.a sentence");
        String sentence = input.nextLine();

        //Get the first character
        System.out.println("First character: " + sentence.charAt(0)); // "day36_inheritance.app.access.day36_inheritance.access.a.a" -----charArt(0); --->day36_inheritance.app.access.day36_inheritance.access.a.a

        // Get the last character
        System.out.println("Last character: " + sentence.charAt( sentence.length() - 1 )); // "day36_inheritance.app.access.day36_inheritance.access.a.a"  ---- charAt(0); -- > day36_inheritance.app.access.day36_inheritance.access.a.a
        // 0   ---- charAt("day36_inheritance.app.access.day36_inheritance.access.a.a".length()-1) -- > 0 -- > "day36_inheritance.app.access.day36_inheritance.access.a.a"

        // If user press enter, we get empty string which is -- > ""; --- > That means there is nt character so there is index.

    }
}
