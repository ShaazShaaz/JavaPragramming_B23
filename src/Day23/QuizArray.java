package Day23;

import java.util.Arrays;

public class QuizArray {
    public static void main(String[] args) {
        int[] num1=new int[3];
        int[] num2={1,2,3,4,5};
        num1=num2;
        System.out.println(Arrays.toString(num1));
    }
}
