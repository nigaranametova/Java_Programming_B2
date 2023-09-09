package day06_Ariphmetic_operators;

public class differentTypes {
    public static void main(String [] args){

        //both of them is int ---> int and int ---> int
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println();

        // one side is double and another side is int ---> double ands int ---> double
        System.out.println(10.0 / 5);

        //both sides double is double ---> double and double ---> double
        System.out.println(10.0 / 5.0);
        System.out.println();

        System.out.println( 10.0 / 5);
        System.out.println( (int)10.0 / 5);
        System.out.println( (double)10 / 5);

       byte b1 = 10;
       byte b2 = 20;

        // byte sum =  b1 + b2; //This will not work because the values get changes to int during the calculation

    }
}
