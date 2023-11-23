package day08_scaner_logical_operators;

public class SignType {
    /*
         Task:
            Declare and assign day36_inheritance.app.access.day36_inheritance.access.a.a number

            I want to know the sign of the number
                if the number positive
                is the number negative
                is the number 0
     */
    public static void main(String [] args){
        int num = 4;

        boolean isNegative = num <= 0;
        boolean isPositive = num >= 0;
        boolean isZero = num != 0;

        System.out.println(num + " is negative: " + isNegative);
        System.out.println(num + " is positive: " + isPositive);
        System.out.println(num + " is zero: " + isZero);

    }
}
