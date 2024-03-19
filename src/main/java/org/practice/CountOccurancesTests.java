package org.practice;
import org.junit.jupiter.api.Test;

class CountOccurancesTests {

    static int cntOccurrences(String str, String word)
    {
        String a[]= str.split(" ");

        System.out.println(a.length);

//Search word for pattern

        int count = 0;
        for (int i = 0; i < a.length;i++)
        {
            //if match found count
            if (word.equalsIgnoreCase(a[i])) {
                System.out.println(a[i]);
                count++;
            }
        }
        return count;
    }




    //Driver code
    @Test
     public  void getOccurance(

     ){
        String str = "Geeks taking to geeks as tell me who is best geeks in all Geeks";
        String word = "Geeks";

        int occuranceCount = cntOccurrences(str, word);

        System.out.println("Occurance Count: "+occuranceCount);

    }
}
