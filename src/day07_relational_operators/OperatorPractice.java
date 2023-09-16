package day07_relational_operators;

public class OperatorPractice {

    public static void main(String[] args){

        int num = 10;
        num++; // post-increment | no other code, just increment by 1 |
        System.out.println(num); //

        num--; // post-decrement
        System.out.println(num); //10
        System.out.println(num++);// post-increment --> we get the value first, then we update it.
        System.out.println(num++); // output --> 11 | num = 12;
        System.out.println(++num); // pre-increment ---> we update first,  then user it --> num =13; | print 13



    }
}
