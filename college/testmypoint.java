public class testmypoint {
    public static void main(String[] args) {
       mypoint point1=new mypoint();
       mypoint point2=new mypoint(3,4);
       point1.setXY(1,2);
       int[]coordinates=point1.getXY();
       System.out.println("point1 coordinates:("+coordinates[0]+","+coordinates[1]+")");
       System.out.println("point1 to (5,6) :"+point1.distance(5,6));
       System.out.println("point1 to point2:"+point1.distance(point2));
       System.out.println("point1 to origin:"+point1.distance());

       System.out.println("point1:"+point1);
       System.out.println("point2:"+point2);
        
    }
}
