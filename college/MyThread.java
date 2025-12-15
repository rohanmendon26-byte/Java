public class MyThread extends Thread {
   MyThread(String name)
   {
     super(name);
     start();
   }

   public void run()
   {
     for(int i=0;i<=5;i++)
     {
        System.out.println("Child Thread:"+i);

     try
     {
        Thread.sleep(500);
     }

     catch(InterruptedException e)
     {
        System.out.println("child thread is interupted");
     }
    }
   }

}
