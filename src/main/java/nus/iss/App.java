package nus.iss;

public class App 
{
    public static void main( String[] args )
    {
        Thread thread1 = new Thread(new Runnable() {
            @Override 
            public void run(){
                for (int i = 0; i < 20; i++){
                    System.out.println(Thread.currentThread().getName() + "\tRunnable ..." + i);
                }
            }

        }); 
        thread1.start(); 

        MyRunnableImplementation mRI = new MyRunnableImplementation(); 
        Thread thread2 = new Thread(mRI); 
        thread2.start(); 

        Thread thread3 = new Thread(mRI); 
        thread3.start(); 
    }
}
