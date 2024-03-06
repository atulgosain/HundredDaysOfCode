import java.util.Arrays;

class OccuranceCountWithChanges {

    static int cntOccurances(String source, String word)
    {
        String cleanedUpString= source.replace("\\.", "");
        return (int)Arrays.stream(cleanedUpString.split(" ")).filter(w -> w.equalsIgnoreCase(word)).count();


    }
    //Driver code
     public static void main(String Args[]){
        String str = "Geeks taking to geeks as tell geeks me who is best geeks in all Geeks";
        String word = "Geeks";

        System.out.println(cntOccurances(str, word));

    }
}
