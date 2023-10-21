package day24_methods;

public class MyFirstMethod {
    public static void helloWorld () { // void method: does the action. DOES NOT RETURN anything back.
        System.out.println("Hello World!");

    }

    public static void helloWorld50 (){
        for (int i = 0; i <50; i++){
            //System.out.println("Hello World");
            helloWorld();
        }
    }

    public static void main(String[] args) {
        helloWorld(); // I am calling method with its name
        helloWorld();
        System.out.println("---------------");

        helloWorld50();
        helloWorld50();






    }
}
