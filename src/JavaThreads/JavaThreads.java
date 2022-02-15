package JavaThreads;
//Creating a Thread
//There are two ways to create a thread.
//It can be created by extending the Thread class and overriding its run() method:
public class JavaThreads extends Thread {

    public static void main(String[] args) {
        //If the class extends the Thread class, the thread can be run by creating an instance of the class and call
        // its start() method:
        JavaThreads thread = new JavaThreads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

