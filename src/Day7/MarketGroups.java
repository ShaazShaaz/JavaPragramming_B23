package Day7;

public class MarketGroups {
    public static void main(String[] args) {
        /*
        earlyBirds: 50~60
        group1: 40~49
        group2: 30~39
        angryBirds: <30
         */

        int score= 22;
        boolean earlyBird= score>=50 &&score<=60;// fasle
        boolean group1= score >=40 && score<=49;
                         // false &&    true
                           // false
        boolean group2= score >=30 && score<=39;
        //                   false && true
                         //  false
        boolean angryBirds= score<30;//true

        System.out.println("angryBirds = " + angryBirds);
        System.out.println("group2 = " + group2);
        System.out.println("group1 = " + group1);
        System.out.println("earlyBird = " + earlyBird);
    }
}
