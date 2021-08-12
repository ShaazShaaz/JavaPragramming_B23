package Day25;

public class UniqueCharacterArray {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'a', 'c'};
        for (char each : chars) {
            int count = 0;
            for (char ch : chars) {
                if (ch == each) {
                    count++;
                }
                }
                if (count==1){
                    System.out.println(each);
            }

        }
    }
}
