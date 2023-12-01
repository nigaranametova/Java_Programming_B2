package day10_if_statements;

import java.util.Scanner;

public class OverTime {
    public static void main(String[] args){

        /*

        day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a double variable for your hourly rate
        day38_a_abstraction_interface.create day36_inheritance.app.access.day36_inheritance.access.a.a double variable for the number of hours worked

        calculate your net pay, with consideration of overtime pay

            if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
                (if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */

        Scanner input = new Scanner (System.in);
        System.out.println("What is you hourly rate: ");
        double hourlyRate = 60.0;
        double numHours = 42;
        double netPay;
        double overtimeHours;
        String message;

        /*
        if numHours > 40
        overtimeHours = numHours - 40; // 42 -40
        netPay = (hourlyRate * 40) + (overtimeHours * hourlyRate * 1.5);
        message = You worked 42 hours at day36_inheritance.app.access.day36_inheritance.access.a.a rate of $60, but 2 of the hours were overtime, so you got an additional pay for those hours. Your net pay is
        $netPay


         */


    }
}
