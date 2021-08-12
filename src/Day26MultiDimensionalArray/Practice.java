package Day26MultiDimensionalArray;

public class Practice {
    public static void main(String[] args) {
        String[] group1={"Ahmet","Tanya","Nicholas"},
                group2,
                group3,
                group4,
                group5;
        String[][] cybertekGroups={
                {"Ahmet","Tanya","Nicholas"},  // 0

        };
        int count=0;  // how many Ahmed are there
        for (String[] eachGroup : cybertekGroups) {
            for (String eachName:eachGroup){
                if (eachName.equals("Ahmed")){
                    count++;
                }
            }

        }
        System.out.println("count of 'Ahmed': "+count);
        System.out.println("---------------------------------");
        String[][][][][] names={{{{{"Shazia","Yulia"},{"Alex","Chala"}},{{"Koray","Faluk"},{"Ozden"}}},
                {{{"Victoria","Robinson"},{"Alexandria","Chalafigen"}},{{"Korayoglu","Falukfaruk"},{"Ozstarkden"}}}},{{{{"Shazia","Yulia"},{"Alex","Chala"}},{{"Koray","Faluk"},{"Ozden"}}},
                {{{"Shaziasenol","YuliaMashkina"},{"Alexander","Chalaturkish"}},{{"Korayhusnband","Falukazeri"},{"Ozdenidk"}}}}};
         for(String[][][][] each4D:names){
             for (String[][][] each3D:each4D){
                 for (String[][] each2D:each3D){
                     for (String[] each1D:each2D){
                         for (String element:each1D){
                             System.out.println(element);
                         }
                     }
                 }
             }

        }

    }
}
