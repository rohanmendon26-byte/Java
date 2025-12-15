public class shapes {
    public static void main(String[] args) {
       shape[] s=new shape[5];
       s[0]=new circle();
       s[1]=new triangle();
       s[2]=new square();
       for(int i=0;i<s.length;i++)
       {
         s[i].draw();
         s[i].erase();
         System.out.println("------------");
       }
    }
}
