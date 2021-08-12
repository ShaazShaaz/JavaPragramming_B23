public class Sandwich {
    public static void main(String[] args) {
        /*
        A sandwich is two pieces of bread with something in between. Print the string that
        is between the first and last appearance of "bread" in the given string, or return string
        "nothing" if there are not two pieces of bread.
Example:input: breadjambread
output: jam
         */
        String str="breadtarabread";
        String inBetween="";
        if (str.indexOf("bread") !=str.lastIndexOf("bread")){
            System.out.println(str.substring(5,str.length()-5));

        }else {
            System.out.println("nothing");
        }


    }
}
