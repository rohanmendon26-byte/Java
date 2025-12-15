public class mainclass_java {
    public static void main(String[] args) {
        MyRunnable myrunnable=new MyRunnable();
        Thread thread1=new Thread(myrunnable);
        Thread thread2=new Thread(myrunnable);
        Thread thread3=new Thread(myrunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
