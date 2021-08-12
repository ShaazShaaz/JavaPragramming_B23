package CustomMethods;

public class ProfitLoss {
    /*
    Finish the profits method which accepts the buyPrice(int) and sellPrice(int) and determines if
    there was a profit or loss.
It returns a string value that can be "profit","loss","no loss"
Example
profits(100,1500)
returns: "profit"
profits(20,5)
returns: "loss"
profits(100,100)
returns: "no loss"
     */
    public static void main(String[] args) {
        System.out.println(profits(1500,1500));
    }



    public static String profits(int buyPrice, int sellPrice){
        String result="";
        if (buyPrice>sellPrice){
            result="loss";
        }else if (sellPrice>buyPrice){
            result="profit";
        }else {
            result="no loss";
        }
        return result;
    }
}
