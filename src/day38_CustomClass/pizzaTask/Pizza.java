package day38_CustomClass.pizzaTask;

public class Pizza {
    /*
    Attributes:
    		size, numberOfCheeseTopping, numberOfPepperoniTopping
		Actions:
			customOrder(): sets all attributes of Pizza
			calcCost(): returns the totalCost of the pizza
			toString():returns a String containing the pizza size, quantity of each topping,
			and the pizza cost as calculated by calcCost()
		Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
     */

    public char size;
    public int cheeseToppings,pepperoniToppings;

    public void customOrder(char size, int cheeseToppings, int pepperoniToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
    }

    public double calcCost(){
        double startingPrice=(size=='S')?10:(size=='M')?12:14;
        double PriceOfToppings=2*(cheeseToppings+pepperoniToppings);
        return (startingPrice+PriceOfToppings)*1.08;

    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheeseToppings=" + cheeseToppings +
                ", pepperoniToppings=" + pepperoniToppings +
                ", total price= $"+calcCost()+
                '}';
    }
}
