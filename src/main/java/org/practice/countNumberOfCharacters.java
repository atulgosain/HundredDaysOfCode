package main.java.org.practice;

import java.util.Scanner;

public class countNumberOfCharacters {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Add the comments for getting size ");
        String text = sc.nextLine();


        System.out.println(text.length());

        // create character array
        char[] charArr = new char[10];


        text.getChars(0,7, charArr, 0);

        System.out.println("Value of Array: " + String.valueOf(charArr));

    }
}
