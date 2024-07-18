package Advance;

// learn how we can run thread
// object can run 
// ONly classes which are extended with thread class
// use function start() and this will call run()

class A extends Thread 
{
    public void run() // run is the method class by START() in when called 
    {
        for( int i = 0 ; i< 100 ; i++ ) System.out.println("hello");
    }
}

class B  extends Thread
{
    public void run()
    {
        for( int i = 0 ; i< 100 ; i++ ) System.out.println("hii");
    }
}
public class thread_intro {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // to start 
        a.start();
        b.start();
    }
    
}
