package org.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseTheOrderTests {

static List<Integer> ReverseOrder(List<Integer> source){

    List<Integer> result = new ArrayList<>(source);
    Collections.reverse(result);
    return result;

}
@Test
public void ReverseTheOrder(){

    List<Integer> numbers = Arrays.asList(7,14,21,28,35);
    List<Integer> numberReversed = ReverseTheOrderTests.ReverseOrder(numbers);

    System.out.println(numberReversed);


}

}
