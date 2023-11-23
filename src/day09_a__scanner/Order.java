package day09_a__scanner;
import java.util.Scanner;

public class Order {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter day36_inheritance.app.access.day36_inheritance.access.a.a product name:");
        String productName = key.nextLine();

        System.out.println("Enter day36_inheritance.app.access.day36_inheritance.access.a.a price for day36_inheritance.app.access.day36_inheritance.access.a.a " + productName + "; ");
        double price = key.nextDouble();

        System.out.println("How many " + productName + " do you want to buy? ");
        int quantity = key.nextInt();

        System.out.println("What should put on your order name: ");
        String orderName = key.nextLine();

        double totalPrice = price * quantity;

        //"$orderName, your order for $quantity $productName



    }
}
