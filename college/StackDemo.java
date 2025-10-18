import java.util.Scanner;
public class StackDemo 
{
    public static void main(String [] args)
    {
       int ch;
        stack stk = new stack(); // Notice capital S
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Stack Operation Demo ---");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display items");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");
            ch = in.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter the item to be pushed: ");
                    int item = in.nextInt();
                    stk.push(item);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}
