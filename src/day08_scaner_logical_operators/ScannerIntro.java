package day08_scaner_logical_operators;

import java.util.Scanner;

public class ScannerIntro {

    public static void main (String [] args){

        String name = "Tom";
        System.out.println("Hello " + name);
        System.out.println("---------");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = input.nextInt();  // 78
        System.out.println("If I add 3 to you number, it will be: " + (num + 3));
    }
}
