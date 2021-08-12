package Day23;

public class MyClassMates {
    public static void main(String[] args) {
        // if you know what are the elements of the data
        String[] friends={"Yulia","Victoria","Alexandria","Beryl"};  // size==5
        System.out.println("Size: "+friends.length);

        for (int i = 0; i <= friends.length-1; i++) { // i represents the index numbers in array
            System.out.println(friends[i]);
        }

        // if you don't know what the elements are but you know how many elements you want to store
        String[] friends2=new String[4];  // size==5
        System.out.println("Size: "+friends.length);

        friends2[0]="Kemal";  // replace the null with a new element
        friends2[3]="Mhmd";
        friends2[1]="Azra";
        for (int i=0;i<= friends2.length-1;i++){
            System.out.println(friends2[i]);
}

    }
}
