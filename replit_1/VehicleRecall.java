public class VehicleRecall {
    public static void main(String[] args) {
        /*
        SDET Motors Inc. is recalling all vehicles from model years 1995-1998, 2001-2002, 2004-2006 and 2015-2017.
In this assignment you will write a program that will find vehicle for recall.
If the year is in the provided range print: Your vehicle needs to be recalled!
If the year is fine print: Your vehicle is fine, enjoy!
         */
        int year=2008;
        String msg="";
        if (year>=1995 && year<=1998){
            msg="Your vehicle needs to be recalled!";
        } else if (year>=2001 && year<=2002){
            msg="Your vehicle needs to be recalled!";
        } else if (year>=2004 && year<=2006){
            msg="Your vehicle needs to be recalled!";
        } else if (year>=2015 && year<=2017){
            msg="Your vehicle needs to be recalled!";
        }else {
            msg="Your vehicle is fine, enjoy!";
        }
        System.out.println(msg);




    }
}
