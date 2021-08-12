public class ParkingLot
{
   //data members
   private int [][] spots; //not an array a refference variable. going to refer to an array but there is no array.
   private int size;
   
   //constructor-is initializing the variables
   public ParkingLot(int r, int c)
   {
      spots = new int[r][c];
      this.size = r * c;
   }
   
   //auxiliary methods
   public void fillSpot(int r, int c)
   {
        this.spots[r][c] = 1;
   }
   
   public int numFull()
   {
      int count = 0;
      int row = 0;
      int col = 0;
      
      for(row = 0; row < this.spots.length; row++)
      {
         for(col = 0; col < this.spots[row].length; col++)
         {
            if(this.spots[row][col] == 1)
               count++;
         }
      }
      
      return(count);
   }
   
   @Override
   public String toString()
   {
      int full = this.numFull();
      int empty = this.size - full;
      
      String s = full + " full, " + empty + " left";
      return(s);
   }
   
   @Override 
   public boolean equals(Object obj)
   {
      if(obj == null)
         return(false);
      if(this.getClass() != obj.getClass())
         return(false);
         
      ParkingLot otherParkingLot = (ParkingLot) obj;
      
      if(this.size != otherParkingLot.size)
         return(false);
         
         return(true);
   }
}