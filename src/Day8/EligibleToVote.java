package Day8;

public class EligibleToVote {
    public static void main(String[] args) {
        /*
        1. person must be US citizen.
        2. must be 18 yrs old and above.
        3.Credit score must be above 700.
         */
        String name="Shazia";
        int age= 15;
        String citizen= "USA";
        boolean eligible= age>=21 && citizen=="USA";
        if (eligible){
            System.out.println(name + "is eligible");
        }

        if (!eligible){
            System.out.println(name + "is not eligible");
        }
    }



}
