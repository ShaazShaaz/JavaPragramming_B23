package Day23;

public class MaxScoreArray {
    public static void main(String[] args) {
        int[] scores={85,70,95,90,100};
        String[] names= {"Mike","Adam","Tonny","John","Ammy"};
        int maxScore=scores[0];
        String maxName=names[0];
        int minScore=scores[0];
        String minName=names[0];
        for (int i = 0; i <= names.length-1; i++) {
            String eachName=names[i];
            int eachScore=scores[i];
            // System.out.println(names[i]+": "+ scores[i]);

            if (eachScore>maxScore){
                maxScore=eachScore;
                maxName=eachName;
            }
            if (eachScore<minScore){
                minScore=eachScore;
                minName=eachName;
            }

        }
        System.out.println("maxScore:"+maxScore);
        System.out.println("maxName: "+maxName);
        System.out.println("minScore: "+minScore);
        System.out.println("minName: "+minName);
    }
}
