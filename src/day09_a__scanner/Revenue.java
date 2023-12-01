package day09_a__scanner;
import java.util.Scanner;


public class Revenue {
    public static void main( String[] args){
        // 1) First I need to import the package that has the Scanner class in it
        // 2) Then i need to day38_a_abstraction_interface.create an OBJECT of the Scanner class

        //*) If I want to use  day36_inheritance.app.access.day36_inheritance.access.a.a class from day36_inheritance.app.access.day36_inheritance.access.a.a different package, I need to import

        Scanner input = new Scanner(System.in); //key --> is day36_inheritance.app.access.day36_inheritance.access.a.a reference to the object
        System.out.println("Enter the price: $");
        double price = input.nextDouble();
        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        double revenue = price * quantity;

        System.out.println("Revenue: $" + revenue);

        String name = "Location";
    }

}
