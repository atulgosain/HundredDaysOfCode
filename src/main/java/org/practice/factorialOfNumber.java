package main.java.org.practice;

import java.util.Scanner;

public class factorialOfNumber {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to get Factorial");

        int i = sc.nextInt();
        int k, fact=1;
        for( k=1;k<=i;k++){
            fact= fact*k;


        }
System.out.println("Factorial Is: "+fact);


    }

}
