package Day10;

public class CampusHours {
    public static void main(String[] args) {
        /*
        int t
         */
        int time=7;
        String result="";   //local variable(needs to be initialized-give value before we use it)

        if (time>=8 && time<=23){
            //System.out.println("open");
            result="open";
        }else {
            //System.out.println("closed");
            result="closed";
        }
        System.out.println(result);


    }

}
