package org.practice;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class CountNumberOfCharactersTests {

    @Test
    public void countNumberOfChars(){

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
