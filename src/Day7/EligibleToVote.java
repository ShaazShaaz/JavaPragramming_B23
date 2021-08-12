package Day7;

public class EligibleToVote {
    public static void main(String[] args) {

        /*
        1. person must be US citizen.
        2. must be 18 yrs old and above.
        3.Credit score must be above 700.
         */
        String name="Conner";
        int age= 35;
        String citizen = "Ireland";
        int creditScore = 630;

        boolean isEligibleToVote = age >=18 && citizen=="USA" && creditScore>=700;
                      //             35> 18   &&    Ireland==USA &&
                              //      true    &&      false
        System.out.println(name + " is eligible to vote for Biden: " + isEligibleToVote);

    }
}
