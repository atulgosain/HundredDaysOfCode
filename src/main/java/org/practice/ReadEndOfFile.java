package main.java.org.practice;

import java.util.Scanner;

public class ReadEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        //System.out.println("Enter the text here");
        int line_number = 1;
        while (scn.hasNext()){
            System.out.println(line_number +" "+ scn.nextLine());
            line_number++;
        }

scn.close();
    }
}
