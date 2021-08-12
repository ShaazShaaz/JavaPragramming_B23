package intterviewTasks;

public class Frequency1 {
    public static void main(String[] args) {
        String str = "aabccc";
        String result = "";  // a2b1c3
        String removeDup = "";  // abc

        for (int i = 0; i < str.length() ; i++) {
            if (!removeDup.contains(""+str.charAt(i))){
                removeDup+=str.charAt(i);
            }
        }
        for (int i = 0; i < removeDup.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (removeDup.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            result+=""+removeDup.charAt(i)+count;
        }
        System.out.println(result);
        }
    }
