package OfficeHours;

public class GoogleSearch {
    public static void main(String[] args) {
        /*
        Assume that you searched a word in Google  Search Engine.After that you took a result message
         like this
                         "About 640,000,000 results (0.78 seconds)"
                         According to this result print out search Time and number of Result
                         Input :  "About 640,000,000 results (0.78 seconds)"
                         Output:
                                     Result number is 640,000,000
                                     Response time is 0.78 seconds
         */
        String result="About 3,640,000,000 results (0.78 seconds)";
        int startIndex=result.indexOf(" ");
        int endIndex=result.indexOf(" r"); // will give index of first character" "

        System.out.println(startIndex);
        System.out.println(endIndex);

        String searchResult=result.substring(startIndex+1,endIndex);
        System.out.println(result);

        int firstIndex=result.indexOf("(");
        int lastIndex=result.indexOf(")");
       // String searchTime=searchResult.indexOf("");
       // System.out.println("search time= "+ searchTime);



    }
}
