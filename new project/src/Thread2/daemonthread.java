package Thread2;

public class daemonthread 
{
    public static void main(String args[]) 
    {
        MyThread myThread = new MyThread();   
        myThread.setDaemon(true);
        myThread.start();
        
        // Sleep for five seconds
        try 
        {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        System.out.println("Main thread finished");
    }
}
    
class MyThread extends Thread
{
    public void run() 
    {
        while (true) {
        System.out.println("Daemon thread is running");
        try {
               Thread.sleep(500);
             } 
        catch (InterruptedException ignored) {
                }
            }
    }
}