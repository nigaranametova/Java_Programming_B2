package day08_scaner_logical_operators;

public class LogicalOperators {

    public static void main(String [] args){

        int n = 20;

        System.out.println(n > 5); // true
        System.out.println(n < 10); // false

        System.out.println(n > 5 && n < 10);  // 5 < n < 10;
        //                  true     false   ---> false
        // 20 is more than 5 AND 20 is less than 10

        System.out.println(n > 5 || n < 10);
        //                  true    false
        // 20 is more than 5 OR 20 is less than 10 --- > true


        // with || ---> is both sides are false, only then output is false
        System.out.println(4 > 3 || false);  // true
        System.out.println(3 > 4 || false);  // true
        System.out.println(3 > 4 || false);  // false

        System.out.println(4 !=4); // false

    }
}
