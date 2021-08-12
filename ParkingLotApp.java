public class ParkingLotApp
{
   public static void main(String [] args)
   {
      ParkingLot p1 = new ParkingLot(4, 5);
      
      p1.fillSpot(0, 0);
      System.out.println(p1.numFull());
      p1.fillSpot(3, 1);
      System.out.println(p1.toString());
   }
}  