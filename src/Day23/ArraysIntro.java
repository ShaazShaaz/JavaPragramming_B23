package Day23;

public class ArraysIntro {
    public static void main(String[] args) {
        String[] group12={"Chala","Yulia","Victoria","Shazia","Alexandria","Koray"};
        // index            0        1       2          3          4          5
        // to retrieve specific data,
        System.out.println(group12[0]);  // Chala
        System.out.println(group12[1]);   // Yulia
        System.out.println(group12[2]);
        System.out.println(group12[3]);
        System.out.println(group12[4]);
        System.out.println(group12[5]);
        System.out.println("-------------------------");

        for (int i=0;i<=5;i++){
            System.out.println(group12[i]);
        }


    }
}
