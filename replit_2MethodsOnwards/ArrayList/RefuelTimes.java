package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RefuelTimes {
    /*
    A pizza delivery men has a scooter an a lot of deliveries to make, he will have to refuel
    a few times.
refuel_times gets an arraylist deliveries of the amount of fuel it will take to get to
destinations like:
[1,3,5], first place will take 1 fuel unit to get to second 3 fuel units etc...
the max_fuel is the max fuel units in the vehicle fuel tank.
you will need to returns how meany refuels it will take to do all deliveries
 (if the units are bigger then the tank he will refuel along the way in a gas station).
Example:
refuel_times([7,7,7],7)
returns: 3 (3 fuel stops 7 units each delivery)
     */
    public static void main(String[] args) {
        ArrayList<Integer> del=new ArrayList<>(Arrays.asList(9,3,6));
        System.out.println(refuel_times(del,3));
    }


    public static int refuel_times(ArrayList<Integer> deliveries,int max_fuel){
        int refuelTimes=0;
        for (int i = 0; i < deliveries.size(); i++) {
            if (deliveries.get(i)<=max_fuel){
                refuelTimes++;
            }
            if (deliveries.get(i)>max_fuel){
                refuelTimes+=deliveries.get(i)/max_fuel;
            }
        }
        return refuelTimes;
    }


}
