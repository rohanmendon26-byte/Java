import java.util.Scanner;

public class stackemo {
    public static void main(String[] args) {
        int ch;
        stack stk=new stack();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("1.Push\n 2,Pop\n 3.Display\n 4.Exit\n");
            System.out.println("Enter your choice");
            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter the item\n");
                    int item=sc.nextInt();
                    stk.push(item);
                    break;

                case 2:
                    stk.pop();
                    break;

                case 3:
                    stk.display();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("invalid choice");

            }
        }


    }
}

 
