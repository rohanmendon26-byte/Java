public class mypoint {
   private int x;
   private int y;

   mypoint()
   {
     this.x=0;
     this.y=0;
   }

   mypoint(int x,int y)
   {
     this.x=x;
     this.y=y;
   }

   void setXY(int x,int y)
   {
     this.x=x;
     this.y=y;
   }

   public int[]getXY()
   {
     int []coordinates={x,y};
     return coordinates;
   }

   double distance(int x,int y)
   {
     int xDiff=this.x-x;
     int yDiff=this.y-y;
     return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
   }

   double distance(mypoint another)
   {
     int xDiff=this.x-another.x;
     int yDiff=this.y-another.y;
     return Math.sqrt(xDiff*xDiff+yDiff*yDiff);
   }

   double distance()
   {
     return Math.sqrt(x*x+y*y);
   }

   public String toString()
   {
     return "("+x+","+y+")";
   }
}
