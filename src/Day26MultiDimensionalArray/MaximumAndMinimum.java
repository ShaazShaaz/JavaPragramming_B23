package Day26MultiDimensionalArray;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        /*
        write a program that can find the maximum & minimum number from any two dimensional array
                {{10,20,30},{40,50,60,70,80}};
                max: 80
                min: 10
         */
        int[][] numbers={{10,20,30},{40,50,60,70,80}};
        int max=numbers[0][0];   // also can write= int max=-2147478965;
        int min=numbers[0][0];    // also can write= int min=2147478965;
        int sum=0;
        int count=0;
        int average=sum/count;
        for (int[] each1D:numbers){  // each1D is representing each single dimension array
            count++;
            for (int element:each1D){
                sum+=element;

                if (element>max){
                    max=element;
                }
                if (element<min){
                    min=element;
                }
            }
        }
        System.out.println(max+"=max");
        System.out.println(min+"=min");
        System.out.println(sum+"=sum");
        System.out.println((double) average+"=average");

    }
}
