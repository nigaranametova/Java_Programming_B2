package day09_a__scanner;
import java.util.Scanner;

public class UsingNext {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is today of week? ");
        String day = input.nextLine();

        System.out.println("Enter your first name: ");
        String name = input.next();

        System.out.println("Today: " + day);
        System.out.println("First Name: " + name);

        System.out.println("Enter your last name: ");
        String lastName = input.next();

        input.nextLine();
        System.out.println("Enter your address: ");
        String address = input.nextLine();

        System.out.println("Enter your bank username");
        String userName= input.nextLine(); //Since the one BEFORE is also same as nextLine(), we do not need to

        System.out.println("Lastname " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Your bank username:" + userName);
    }
}
