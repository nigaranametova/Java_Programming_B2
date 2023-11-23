package day21_arrays;

import java.util.Scanner;

public class SelectWeekDays {
    public static void main(String[] args) {
        String [] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //                        0        1            2            3         4          5          6

        Scanner input = new Scanner(System.in);
        System.out.print("Enter day36_inheritance.app.access.day36_inheritance.access.a.a number that represents day36_inheritance.app.access.day36_inheritance.access.a.a week day: ");

        int userNum = input.nextInt();


        if (userNum >= 1 && userNum <= 7){

            System.out.println(weekDays[userNum - 1]);

        } else {
            System.out.println("Sorry, invalid input");
        }


        // Ask day36_inheritance.app.access.day36_inheritance.access.a.a user to enter the valid input until it is actually valid.
    }
}