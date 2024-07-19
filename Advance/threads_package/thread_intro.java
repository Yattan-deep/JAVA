package Advance.threads_package;

// learn how we can run thread
// object can run 
// ONly classes which are extended with thread class
// use function start() and this will call run()

class ThreadA extends Thread 
{
    public void run() // run is the method class by START() in when called 
    {
        for( int i = 0 ; i< 100 ; i++ ) System.out.println("hello");
    }
}

class ThreadB  extends Thread
{
    public void run()
    {
        for( int i = 0 ; i< 100 ; i++ ) System.out.println("hii");
    }
}
public class thread_intro {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        // to start 
        a.start();
        b.start();
    }
    
}
