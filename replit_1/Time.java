public class Time {
    public static void main(String[] args) {
        /*In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

Declare variables: hour, minute, second that can hold int values.

Declare amOrPm variable that can hold a String ("AM" or "PM")

Instructor will set different values to your variables

Using the variables and concatenation, print values in the format mentioned above.
*/
        int hour=12;
        int minute=24;int second=34;
         String amOrPm="PM";

        System.out.println(hour+ ":" + minute +":" + second + " " + amOrPm);

    }
}
