
public class stack {
    int top;
    int[]s=new int[5];

    stack()
    {
        top=-1;
    }

    void push(int item)
    {
        if(top==s.length-1)
        {
            System.out.println("stack overflow");
        }
        else
        {
            top++;
            s[top]=item;
        }
    }

    void pop()
    {
        if(top==-1)
        {
            System.out.println("stack underflow");
        }
        else
        {
            int item=s[top];
            System.out.println("item deleted is "+item);
            top--;
            
        }
    }

    void display()
    {
        if(top==-1)
        {
            System.out.println("stack is empty there is no item to display");
        }
        System.out.println("stack contents are:\n");
        for(int i=top;i>=0;i--)
        {
            System.out.println(s[i]);
        }
    }
}


