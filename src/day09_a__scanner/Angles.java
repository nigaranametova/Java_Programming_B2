package day09_a__scanner;

import java.util.Scanner;

public class Angles {
    /*
    Write day36_inheritance.app.access.day36_inheritance.access.a.a program that asks thue user to enter 3 angles numbers ( can be floating
    numbers/decimal)

     */
    public static void main (String[] args){
        System.out.println("Enter three angle degree/number: ");

        Scanner input = new Scanner(System.in);
        double angleOne = input.nextDouble();
        double anglesTwo = input.nextDouble();
        double anglesThree = input.nextDouble();

        double total = angleOne + anglesTwo + anglesThree;

        boolean isTriangle = total == 180;
        boolean isCircle = total == 360;

        System.out.println("It is day36_inheritance.app.access.day36_inheritance.access.a.a triangle: " + isTriangle);
        System.out.println("It is day36_inheritance.app.access.day36_inheritance.access.a.a circle: " + isCircle);
    }

}
