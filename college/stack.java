
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
        System.out.println("item is deleted is"+item);
    }
   }

   void display()
   {
     if(top==-1)
     {
        System.out.println("stack overflow");
     }
     else
     {
        System.out.println("Stack contents are:");
        for(int i=top;i>=0;i--)
        {
            System.out.println(s[i]);
        }
     }
   }
}


