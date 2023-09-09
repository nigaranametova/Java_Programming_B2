package day06_Ariphmetic_operators;

public class TypeCasting {
    public static void main(String [] args){

        byte b = 40;
        int i = b; // the byte value is automatically CONVERTED to int, because byte is smaller than int

        System.out.println(b);
        System.out.println(i);

        int i2 = 100;
        byte b2 = (byte)i2; // int is bigger than byte, so we MUST CAST it. We can the int type - i2 to a byte type using (byte)


        System.out.println(i2);
        System.out.println(b2);

        int i3 = 500;
        long l1 = i3; //I am going from small --> big. Int is smaller than long, so it will AUTOMATICALLY CAST

        long l2 = 200;
        int i4 = (int)l2;

        System.out.println(l2);
        System.out.println(i4);

        double d = 50; //System.out.println(d); //50.0
        int i5 = (int)d;
        System.out.println(d);
        System.out.println(i5);

        double d2 = 40;
        byte b3 = (byte)d2;
        System.out.println(d2);
        System.out.println(b3);

        //with the numbers outside the range. DATA LOSS
        int i6 = 200;
        byte b4 = (byte)i6;
        System.out.println(i6);
        System.out.println(b4);
    }


}
