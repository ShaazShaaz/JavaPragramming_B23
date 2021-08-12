package Day27_Review;

public class Shopping {
    public static void main(String[] args) {
        /*
         String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
           THE SIZE OF ALL 3 ARRAYS ARE SAME SO WE CAN USE JUST 1 FOR LOOP FOR ALL
        1. find out the first index of "Gloves"- (for loop)
        2. find out if "iPad" is contained in the item list- (for each, get element and check is ==)
        3. Print a report of each shopping item - (1 for loop/ all array have same length)
            name - price -#ID
         */
        String[] items  = {"Shoes", "Jacket",  "Gloves", "Airpods", "iPad", "iphone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        //1.
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")){
                System.out.println(i);
                break;
            }

        }
        //2.
        boolean hasIPad=false;
        for (String each:items){
            if (each.contains("iPad")){
                hasIPad=true;
            }
        }
        System.out.println("has ipad: "+hasIPad);

        //3
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]+" - $"+prices[i]+" - # "+itemIDs[i]);

        }

    }
}
