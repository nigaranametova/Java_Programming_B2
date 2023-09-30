package day15_string;

import java.util.Scanner;
import java.util.StringJoiner;

public class WebSite {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an URL: ");
        String url = input.next(); // www.google.com
        //                            012345678910..."

        String result = "" + url.charAt(4) + url.charAt(6) + url.charAt(7) + url.charAt(8) + url.charAt(9);
        System.out.println(result);

        // .substring(startIndex);
        // .substring(startIndex, endIndex);

        int startPoint = url.indexOf(".") + 1;
        System.out.println(startPoint);
        System.out.println(url.substring(startPoint));

        int endPoint = url.length()-4;
        System.out.println(url.substring(startPoint, endPoint));
    }
}
