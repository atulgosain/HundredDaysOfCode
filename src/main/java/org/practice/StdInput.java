package main.java.org.practice;

import java.util.*;
public class StdInput {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
 System.out.print("Enter 3 numbers with space: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        scan.close();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }
}
