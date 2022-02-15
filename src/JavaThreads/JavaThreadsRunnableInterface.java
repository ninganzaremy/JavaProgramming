package JavaThreads;

//Another way to create a thread is to implement the Runnable interface:
public class JavaThreadsRunnableInterface implements Runnable {

  public static void main(String[] args) {
    ///If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a
    // Thread object's constructor and then calling the thread's start() method:
    JavaThreadsRunnableInterface obj = new JavaThreadsRunnableInterface();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
