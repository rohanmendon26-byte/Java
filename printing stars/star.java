
public class star {
    // public static void main(String[] args) {
    //     int n=5;
    //     for(int i=1;i<=n;i++)
    //     {
    //         for(int j=i;j<=n;j++)
    //         {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    public static void main(String args[]) {
 int x; // known to all code within main
 x = 10;
 if(x == 10) { // start new scope
 int y = 20; // known only to this block
 // x and y both known here.
 System.out.println("x and y: " + x + " " + y);
 x = y * 2;
 }
 // y = 100; // Error! y not known here
 // x is still known here.
 System.out.println("x is " + x);
 }
}

