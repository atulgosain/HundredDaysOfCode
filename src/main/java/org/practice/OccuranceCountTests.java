package main.java.org.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class OccuranceCountTests {

    static int cntOccurances(String source, String word)
    {
        String cleanedUpString= source.replace("\\.", "");
        return (int)Arrays.stream(cleanedUpString.split(" ")).filter(w -> w.equalsIgnoreCase(word)).count();


    }
    //Driver code
    @Test
     public  void OccCnt(){
        String str = "Geeks taking to geeks as Geeks tell geeks me who is best geeks in all Geeks";
        String word = "Geeks";

        System.out.println(cntOccurances(str, word));

    }
}
