import java.util.Scanner;
import java.util.Random;

public class rndomnumgen {
    public static void main(String[] args) {
        int num,value;
        Random ran=new Random();
        Scanner user_input=new Scanner(System.in);
        System.out.println("How many number do you want to be generated ?");
        num=user_input.nextInt(); 

        System.out.println("Random number is between 0-500");

        for(int i=0;i<num;i++)
        {
            value=ran.nextInt(500);
            System.out.println("\t"+value);
        }
      
    }
}
