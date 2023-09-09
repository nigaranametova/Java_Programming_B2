package day05_recap.Boolean;

public class CellPhone {
    public static void main (String [] args){

        String brand = "Apple";
        String model = "Iphone 14 Pro Max";
        String color = "Purple";
        double price = 1099.99;
        int storage = 256;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println("I have an " + model + " from " + brand);
        System.out.println(" It case in the color of " + color + " and it has a " + storage + " GB ");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + ", the total price was $" + price);
        String fullMessage = "I have an " + model + " from " + brand + "\nIt came in the color of " + color + " and it has a " + storage + " GB " + "\nFor the sim type " + sim + " with a camera " + hasCamera + ", the total pricew was $" + price;

        System.out.println();
        System.out.println(fullMessage);
        System.out.println();
        System.out.println(fullMessage);
        System.out.println();
        System.out.println(fullMessage);

    }
}
