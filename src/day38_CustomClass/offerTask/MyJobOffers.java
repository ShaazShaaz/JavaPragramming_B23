package day38_CustomClass.offerTask;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class MyJobOffers {
    public static void main(String[] args) {
        /*
     Attributes:
	        state, city, hasBenefit(boolean), salary, WFH(boolean), JobTitle
	    Actions:
	        SetInfo, toString
	    create a class named MyOffers
	        1. create 7 objects Offer Class and store them into an arraylist
	        2. write a program that can only keep the offers from your local area
	        3. write program that can remove all the offers that are not SDET or QA
	        4. write a program that can remove all the offers that are not WFH
	        5. write a program that can remove all the offers that do not have benefits
     */
        Offer offer1=new Offer();
        Offer offer2=new Offer();
        Offer offer3=new Offer();
        Offer offer4=new Offer();
        Offer offer5=new Offer();
        Offer offer6=new Offer();
        Offer offer7=new Offer();

        offer1.setInfo("CA","LosAngeles","SDET",140000,true,true,true, false);
        offer2.setInfo("PA","Pittsburgh","SDET",120000,true,true,true, true);
        offer3.setInfo("VA","McLean","QA",110000,true,true,true, true);
        offer4.setInfo("TX","Dallas","Scrum Master",125000,false,false,true, false);
        offer5.setInfo("NA","Las Vegas","SDET",120000,false,true,true, false);
        offer6.setInfo("NC","Charlotte","BA",135000,true,true,true, false);
        offer7.setInfo("CO","Denver","QE",850000,true,true,true, true);
        Offer[] arr={offer1,offer2,offer3,offer4,offer5,offer6,offer7};
        System.out.println("===================================");

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(arr)); // adding all offers from arr
       // localOffers.removeIf(offer-> !offer.state.equals("CA"));
        System.out.println(localOffers.size());
        System.out.println(localOffers);

        ArrayList<Offer> fullTimeOffers=new ArrayList<>(Arrays.asList(arr)); // adding all offers from arr
        localOffers.removeIf(offer-> !offer.isFullTime);
        System.out.println(localOffers.size());
        System.out.println(localOffers);

        ArrayList<Offer> isWorkFromHome=new ArrayList<>(Arrays.asList(arr)); // adding all offers from arr
      for (Offer offer:arr){
          if (offer.workFromHome && offer.hasPTO){
              isWorkFromHome.add(offer);
          }
      }
       // localOffers.removeIf(offer-> (!offer.workFromHome) && (!offer.hasPTO));
        System.out.println(localOffers.size());
        System.out.println(localOffers);

        ArrayList<Offer> highSalary=new ArrayList<>(Arrays.asList(arr)); // adding all offers from arr
        highSalary.removeIf(p-> p.salary<120000);
        System.out.println(highSalary.size());
        System.out.println(highSalary);






    }
}
