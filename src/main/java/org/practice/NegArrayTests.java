package org.practice;

import org.junit.jupiter.api.Test;

public class NegArrayTests {
    @Test
    public  void TestArrayNeg(){
        int ar[] = new int[-5];
        for (int i = 0;i<ar.length;i++){
            System.out.println(ar[i]);
        }
    }
}
