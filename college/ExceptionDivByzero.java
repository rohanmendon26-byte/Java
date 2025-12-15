public class ExceptionDivByzero {
   public static void main(String[] args) {
       int denominator=0;
       int numerator=0;

       try{
        if(denominator==0)
        {
            throw new DivisionByzeroException("Division by zero is not allowed");
        }
        int remainder=10%0;
        System.out.println("Result of modulus:"+remainder);
        int Result=numerator/denominator;
        System.out.println("Result of division"+Result);
       }

       catch(DivisionByzeroException e)
       {
         System.out.println("Error:"+e.getMessage());
       }

       catch(ArithmeticException e)
       {
        System.out.println("Error:Divison by zero occured");
       }

       finally
       {
         System.out.println("Finally block executed");
       }
    
    }
}
