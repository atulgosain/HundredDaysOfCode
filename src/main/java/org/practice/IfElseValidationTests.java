package org.practice;
import org.junit.jupiter.api.Test;

public class IfElseValidationTests {
  //  private static final Scanner scanner = new Scanner(System.in);
    @Test
    public void IfElseTest() {
        /*Scanner scanner = new Scanner(System.in);*/

        int N = 20;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       // scanner.close();

        if (N % 2 != 0) {
            System.out.println("Weird");

        } else  {
            if (N <=5){
                if (N%2 ==0)
                    System.out.println("Not Weird");
            }

            else if ((N >= 6) && (N <= 20)){
                System.out.println("Weird");
            }
            else if(N > 20){
                System.out.println("Not Weird");
            }

        }


    }
}