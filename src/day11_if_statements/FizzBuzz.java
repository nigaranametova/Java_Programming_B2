package day11_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();

        String result = "";

        if (number % 5 == 0 && number % 3 != 0) {
            result = "FizzBuzz";

        }
        if (number % 3 == 0) {
            result = "Fizz";

        }
        if (number % 5 == 0){
            result = "Buzz";

        }

        System.out.println(result);
    }
}
