package Day25;

public class ForEachLoopIntro {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5};
        for (int i = 0; i <=numbers.length ; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("-----------------------");

        for(int each:numbers){   // each represents each 'element' and not index number of array
            System.out.println(each);
        }
        System.out.println("---------------");
        String[] names={"Shazia","Beyza","Olcay","Azra"};
        for (String eachName:names){
            System.out.println(eachName);
        }




    }
}
