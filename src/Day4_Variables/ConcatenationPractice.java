package Day4_Variables;

public class ConcatenationPractice {
    public static void main(String[] args) {
       /*
       +: addition- when we have 2 numbers at each sides.
          10+10= 20
          concatenation-  when there is at least one string
          "10" + "10" = "1010"
          1 + "10" = "110"
          "2" + 3 = "23"
        */

        String word ="Java";
        System.out.println("My favourite language is " + word + " programming language");

        int dollar = 100000;
        double lira = dollar * 8.41;
        double euro = dollar * 0.88;

        System.out.println(dollar + " US dollars equal to " + lira + " Turkish Lira.");
        System.out.println(dollar + " US dollars equal to " + euro + " euros.");

        System.out.println("-------------------");

        int a = 10;
        int b = 20;
        int addition = a+b;
        int subtraction = a-b;
        int multiplication = a * b;


        // 10+20=30
        // 10-20= -10

        System.out.println(a + " + " + b + " = " + addition);
        System.out.println(a + " - " + b + " = " + subtraction);
        System.out.println(a + " * " + b + " = " + multiplication);
        String name = "John";
        String favMusic = "Rock Music";
        String favBook = "Harry Porter";
        String favSeries = "The Walking Dead";

        System.out.println("\tHello my name is " + name + ", my favourite music is \"" + favMusic
        + "\". My favourite book is \"" + favBook + "\", and my favourite series is \""
                + favSeries + "\"");

        System.out.println("___________________________________");

        String today = "Monday";
        String todayClass = "Java";
        String tomorrow = "Tuesday";
        String tomorrowClass = "Selenium";

        System.out.println("Today is " + today + ", we have " + todayClass + " class. \nTomorrow is " + tomorrow
        + " and we have " + tomorrowClass + " class.");


    }



}
