package day13_string;

import java.util.Scanner;

/*
declare and assign 2 number variables
declare and assign day36_inheritance.app.access.day36_inheritance.access.a.a char variable for an operator

day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other char: "invalid operator"
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day36_inheritance.app.access.day36_inheritance.access.a.a number1: ");
        int num1 = input.nextInt();
        System.out.println("Enter day36_inheritance.app.access.day36_inheritance.access.a.a number 2: ");
        int num2 = input.nextInt();
        System.out.println("Pick Operator: \n\t+\n\t-\n\t*\n\t/\n\t%");
        String operator = input.next();

        int result = 0;
        String message = "";
        boolean runOrNotRun = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                message = "Invalid Operator";
                runOrNotRun = true;
                break;


        }
        // if (if default is run, do not run this if statement)
        // (operator equals + || operator equals - || operator equals * || ........) ---> this will work as well
        if (runOrNotRun) {

            System.out.println("\nYou entered numbers which are " + num1 + " and " + num2 + "\nWith the " + operator + " operator you selected, the result is: " + result);
        } else {
            System.out.println(message);
        }
    }
}
