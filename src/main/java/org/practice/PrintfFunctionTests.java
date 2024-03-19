package main.java.org.practice;

import org.junit.jupiter.api.Test;

public class PrintfFunctionTests {

    @Test
    public  void checkPrint() {
        String sc= "I am writing a line, it will not make any sense. So Please Ignore. So extending the line";

        System.out.println("================================");


        for(int i=0;i<3;i++){
            int x=5;
            System.out.printf("%-15s%03d%n", sc, x);
            //Complete this line
        }

        System.out.println("================================");

    }
}



