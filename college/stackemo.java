import java.util.Scanner;

public class stackemo {
    public static void main(String[] args) {
        int ch;
        stack stk=new stack();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("stack operation demo");
            System.out.println("1.push\n2.pop\n3.display\n4.exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the item:");
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
                    break;

                default:
                    System.out.println("Invalid choice:");
            }

        }
      
        }


    }


 
