package Recap;

public class ConvertNum {
    public static void main(String[] args) {
        /*
        Write a java program that can convert numbers between 0 ~ 9 to words

            ex:
                number = 1

            output:
                One
         */
        int num=11;
        String inWords="";
        if (num>=0 && num<=9) {
            if (num == 0) {
                inWords = "Zero";
            } else if (num == 1) {
                inWords = "One";
            } else if (num == 2) {
                inWords = "two";
            } else if (num == 3) {
                inWords = "three";
            } else if (num == 4) {
                inWords = "four";
            } else if (num == 5) {
                inWords = "five";
            } else if (num == 6) {
                inWords = "six";
            } else if (num == 7) {
                inWords = "seven";
            } else if (num == 8) {
                inWords = "eight";
            } else if (num == 9) {
                inWords = "nine";
            }
        }else {
            inWords="not valid";
        }
        System.out.println(inWords);

    }
}

