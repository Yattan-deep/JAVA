package Advance;
// a class which have only defination of a method or methods is worthy of abstract
/*
 * We can't create obj of abstract class
 * It is made to be INHERT
 * child class have to overide the only defined method 
 * If not it also become abstract class 
 */

abstract class car  // if we have abstract method class need to declare abstract 
{
    // we don't know its a electric or combustion car
    abstract public void drive(); // we don't know to start 
    abstract public void fillfuel(); // petrol , desil , electric

    public void run()
    {
        System.out.println("its running...");
    }

}

abstract class Tesla extends car // it has to be abstract as FUEL still not define 
{
    public void drive()
    {
        System.out.println("Preparing to run ...");
    }
}

class TeslaModelX extends Tesla
{
    public void fillfuel()
    {
        System.out.println("Plug to electriity 440 Volt");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        TeslaModelX t = new TeslaModelX();
        t.fillfuel();
        t.drive();
        t.run();
    }
    
}
