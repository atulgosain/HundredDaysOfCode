package main.java.org.practice;

import java.util.Scanner;

public class dataTypeRead {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        double d = scn.nextDouble();
        scn.nextLine();
        String s = scn.nextLine();

        System.out.println("String: "+s);
        System.out.println("Double: "+d);
        System.out.println("Int: "+i);


    }
}