package day07_relational_operators;

public class OperatorPractice3 {
     public static void main (String[] args){

         int h = 5; // i declared an int variable called h and assign a value 5 to it.
         int p = h; // i declare an int variable called p and assigned a value from variable h

         h++;
         System.out.println("h: " + h); // Output: 6
         System.out.println(p); //Output: 5 or 6

         int k = h++; // k: 6
         System.out.println("h: " +h); // h: 7
         System.out.println("k: " + k); //

         int g = ++h;
         System.out.println("h: " +h);
         System.out.println("g: " + g);
     }
}
