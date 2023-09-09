package day04_variables;

public class PrintData {

    /*

    Task
    declare and assign 3 variables
    the month number, the day number, and year number

    print the date in the following format:
    month/day/year

     */
    public static void main (String[] args) {

        int month = 9;
        int day = 06; // if you start your number with 0, it will not show it in output
        int year = 2023;

        //int month, day, year;
        System.out.println(month + "/" + day + "/" + year);
        System.out.println(month + "." + day + "." + year);
        System.out.println(month + "_" + day + "_" + year); // -> hyphen, dash
        System.out.println(month + "|" + day + "|" + year); // -> pipe, vertical bar
    }
}
