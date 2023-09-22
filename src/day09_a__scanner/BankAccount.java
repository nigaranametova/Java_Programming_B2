package day09_a__scanner;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance? ");
        double balance = input.nextDouble();

        System.out.println("How much do you want to withdraw? "); // 10_000
        double withdraw = input.nextDouble();
        balance -= withdraw; // balance = balance -

        if(balance < 0) {

        }


    }
}
