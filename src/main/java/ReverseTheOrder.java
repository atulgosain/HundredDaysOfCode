import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseTheOrder {

static List<Integer> ReverseOrder(List<Integer> source){

    List<Integer> result = new ArrayList<>(source);
    Collections.reverse(result);
    return result;

}

public static void main(String[] args){

    List<Integer> numbers = Arrays.asList(7,14,21,28,35);
    List<Integer> numberReversed = ReverseTheOrder.ReverseOrder(numbers);

    System.out.println(numberReversed);




}

}
