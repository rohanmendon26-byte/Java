public class MyRunnable implements Runnable {
  public void run()
   {
     try{
        Thread.sleep(500);
        System.out.println("Thread:"+Thread.currentThread().getId());
     }

     catch(InterruptedException e)
     { 
        e.printStackTrace();
     }
   }

}
