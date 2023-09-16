package day08_scaner_logical_operators;

public class ageGroup {
    public static void main (String[] args){

        int age = 10; // We have initialized the age variable and assigned a value to it

        boolean isKid = age <= 13;
        boolean isSenior = age >= 65;

        System.out.println("You are a kid: " + isKid);
        System.out.println("You are a senior: " + isSenior);
    }
}
