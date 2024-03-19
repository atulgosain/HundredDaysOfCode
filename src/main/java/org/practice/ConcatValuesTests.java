package org.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatValuesTests {
    @Test
    public  void concatValues(){

        String str1 = "include";
        String str2 = "help";
        String str3 = str1.concat(str2);
        String str4 = str1+str2;
        assertEquals(str3,str4);



    }
}
