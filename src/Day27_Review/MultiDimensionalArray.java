package Day27_Review;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        String[] scrum1={"Komil","Yuliang","Nadima"};
        String[] scrum2={"Sabir","Tamara"};
        String[] scrum3={"Tugba","Hilal"};
        String[][] scrumTeams={scrum1,scrum2,scrum3}; // length==3

        System.out.println(Arrays.deepToString((scrumTeams))); //
        System.out.println(Arrays.toString(scrumTeams[0]));  // 1st array
        System.out.println(scrumTeams[0][0]);// 1st element of 1st array

        System.out.println("--------------------------");

        for (String[] eachScrum:scrumTeams){  // for every array
            System.out.println(Arrays.toString(eachScrum));
        }
        for (String[] eachScrum:scrumTeams){
            for (String eachMember:eachScrum){  // to get each member of all arrays
                System.out.print(eachMember+" ");
            }
        }
        //SAME TASK CAN BE EXECUTED BY USING FOR LOOP INSTEAD OF FOR EACH
        System.out.println("\n----------------------------");

        for (int i = 0; i < scrumTeams.length; i++) {
            // i is now the index of each singleD array

            for (int j = 0; j < scrumTeams[i].length; j++) {
                // j is the index of elements of each array
                System.out.print(scrumTeams[i][j]+" ");

            }
        }
        System.out.println("----------------------------------------");
        // for switching elements

        int[] numbers={1,2,3,4,5};  // 5,4,3,2,1
       int temp=numbers[0];
       numbers[0]=numbers[4];
       numbers[4]=temp;

        System.out.println(Arrays.toString(numbers));



    }
}
