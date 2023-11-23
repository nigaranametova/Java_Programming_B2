package day12_switch_statements;

import java.util.Scanner;

/*
    Declare and assign these variables: Citizenship(boolean), resident (boolean), and has high school diploma (boolean), and age(int). Determine if the day35_inheritance.day35_inheritance.person.person is qualified to join the army.

        - The day35_inheritance.day35_inheritance.person.person must be day36_inheritance.app.access.day36_inheritance.access.a.a citizen or day36_inheritance.app.access.day36_inheritance.access.a.a resident
                    - Their age must be between 18 and 35
                        -> If not print: Your age must be between 18 to 35 years old (inclusive)
                    - They must have day36_inheritance.app.access.day36_inheritance.access.a.a high school diploma
                        -> If not print: You must have day36_inheritance.app.access.day36_inheritance.access.a.a high school diploma

                    > If all the criteria is met print: You are qualified for the Army

        - If not print: You must be day36_inheritance.app.access.day36_inheritance.access.a.a citizen or day36_inheritance.app.access.day36_inheritance.access.a.a resident
 */
public class ArmyQualify {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Are you day36_inheritance.app.access.day36_inheritance.access.a.a citizen? true/false: ");
        boolean isCitizen = input.nextBoolean();
        System.out.print("Are you day36_inheritance.app.access.day36_inheritance.access.a.a resident? true/false: ");
        boolean isResident = input.nextBoolean();
        System.out.print("Do you have day36_inheritance.app.access.day36_inheritance.access.a.a high school diploma? true/false: ");
        boolean hasDiploma = input.nextBoolean();
        System.out.print("How old are you? ");
        int age = input.nextInt();


        if (isCitizen || isResident) {
            System.out.println("You passed first qualification");

            if (age >= 18 && age <= 35) {
                System.out.println("You passed 2nd qualification as well.");


                if (hasDiploma) {
                    System.out.println("You have passed final qualification. Congrats!");
                } else {
                    System.out.println("You must have day36_inheritance.app.access.day36_inheritance.access.a.a diploma.");
                }



            } else {
                System.out.println("You must be between 18 and 35 years old");
            }








        } else {
            System.out.println("You must be day36_inheritance.app.access.day36_inheritance.access.a.a citizen or resident");
        }
    }
}




