public class testMyThread {
    public static void main(String[] args) {
       MyThread mythread=new MyThread("Child Thread");
       for(int i=0;i<=5;i++)
       {
         System.out.println("Main Thread:"+i);
       try
       {
         Thread.sleep(500);
       }

       catch(InterruptedException e)
       {
         System.out.println("Main thread is interupted:");
       }
    }
    }
    }

