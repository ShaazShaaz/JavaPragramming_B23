package OfficeHours;

public class FirsttLastLetter {
    public static void main(String[] args) {
        /*
        : Write a program that accepts String array.Count how many names have the same first
        and last letter
                Input : "Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"

               Output : 4
               count=0;
               in a for loop----
               String first=names[i].substring(0,1)
               String last=names[i].substring(names[i].length-1)
               if 1st equalsignorecase last
         */
        String[] names={"Anna", "Mike", "Aliya", "Donald", "Muhtar", "Remus", "Mehmet","Asya"};
        int count=0;
        for (int i=0;i<names.length;i++){

            String first=names[i].substring(0,1);
            String last=names[i].substring(names[i].length()-1);
            if (first.equalsIgnoreCase(last)){
                count++;
            }



        }
        System.out.println(count);

    }
}
