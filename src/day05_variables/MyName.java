package day05_variables;

public class MyName {
    public static void main (String [] args){
        char first = 'N';
        char second = 'i';
        char three = 'g';
        char four = 'a';
        char five = 'r';
        char six = 'a';

        System.out.println(first);
        System.out.println(second);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);


        System.out.println(first + second + three + four + five + six);

        System.out.println("My name is: " + first + second + three + four + five + six);

        String myName = "" + first + second + three + four + five + six;
        System.out.println("My name is: " + myName);


    }
}
