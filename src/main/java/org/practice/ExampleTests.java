package org.practice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTests {
@Test
    public void test() {

        System.out.println("Hi");
        String expectedString = "woofs";
        try {
            assertEquals(expectedString, "woof");
        }
        catch(AssertionError e)
        {
            String message = e.getMessage();
            System.out.println("message: "+message);
        }

    }
}
