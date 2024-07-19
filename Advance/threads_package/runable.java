package Advance.threads_package;

// why we need runnable 
/* 
 * If we extend our class with Thread class we can use OTher class to extends AS 
 * Mulpilte inheritance is No No to JAVA
 * if we check very carefull class Thread it IMPLEMENTS runnable interface which is a function interface 
 * Have RUN() defined init...
*/

class runnable_A implements Runnable
{
    public void run()
    {
        for( int i = 0 ; i< 100 ; i++ )
        System.out.println("runnable_A");
    }
}
class runnable_B implements Runnable
{
    public void run()
    {
        for( int i = 0 ; i< 100 ; i++ )
        System.out.println("runnable_B");
    }
}
public class runable 
{
    public static void main(String[] args)
    {
        runnable_A ra = new runnable_A();
        runnable_B rb = new runnable_B();

        // we can create reference variable of interface also 
        Runnable r1 = ra;

        
        Thread t1 = new Thread(ra);
        Thread t2 = new Thread(rb);
        Thread t3 = new Thread(r1);

        t1.start();
        t2.start();
        t3.start();
    }
}
