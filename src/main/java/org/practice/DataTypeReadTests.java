package org.practice;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class DataTypeReadTests {


    @Test
    public  void getDataTypes(){

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
