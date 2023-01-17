package nus.iss;

public class MyRunnableImplementation implements Runnable {
    private String taskName; 

    public MyRunnableImplementation(){

    }

    public MyRunnableImplementation(String taskName){
        this.taskName = taskName; 
    }

    @Override
            public void run(){
                for (int i = 0; i < 20; i++){
                    System.out.println(Thread.currentThread().getName() + "\tRunnable ..." + i);
                }
            }

}
