package main.java.org.practice;

class countOccurances {

    static int cntOccurances(String str, String word)
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
     public static void main(String Args[]){
        String str = "Geeks taking to geeks as tell me who is best geeks in all Geeks";
        String word = "Geeks";

        System.out.println(cntOccurances(str, word));

    }
}
