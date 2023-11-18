package day09_a__scanner;
import java.util.Scanner;
public class YourInfo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        byte age = input.nextByte();

        System.out.println("Enter your favourite number: ");
        long favouriteNumber = input.nextLong();

        input.nextLine(); //this one handles the ENTER key that comes from previous
        System.out.println("Enter your favourite day35_inheritance.book: ");
        String book = input.next();

        System.out.println("Your age: " + age);
        System.out.println("Your favourite number: " + favouriteNumber);
        System.out.println("your day35_inheritance.book name: " + book);
    }

}
