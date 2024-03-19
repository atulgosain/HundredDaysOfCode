package org.practice;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class FactorialOfNumberTests {

    @Test
    public  void getFactorial(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to get Factorial");

        int i = 5;      //sc.nextInt();
        int k, fact=1;
        for( k=1;k<=i;k++){
            fact= fact*k;


        }
System.out.println("Factorial Is: "+fact);


    }

}
