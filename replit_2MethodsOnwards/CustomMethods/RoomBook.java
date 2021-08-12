package CustomMethods;

public class RoomBook {
    /*
    To book a room first it needs to be available for rent and make sure its available at the date selected:
the room is already booked between 7/1/2018 - 7/8/2018 and not available
accepting bookings only for year of 2018
Example:
simpleRoomBook(false,2,1,2018)
return false
     */
    public static void main(String[] args) {
        boolean result=simpleRoomBook(true,2,1,2018);
        System.out.println("result = " + result);
    }


   public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year){
       return ((isAvailable==false || month==7 && (day>=1 && day<=8)) || year>2018)? false: true;

   }


}
