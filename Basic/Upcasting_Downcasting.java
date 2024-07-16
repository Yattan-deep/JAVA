class upcast_down_A {
    public void show()
    {
        System.out.println("Its A");
    }
    public void parent_eat()
    {
        System.out.println("parent eats");
    }
}
class upcast_down_B extends upcast_down_A {
    public void show()
    {
        System.out.println("Its B");
    }
    public void child_eat()
    {
        System.out.println("child eats");
    }
}

public class Upcasting_Downcasting {
    public static void main(String[] args) 
    {
        upcast_down_A obj0 =  new upcast_down_B();  // upcasting parent pointer -> child pointer 
        // dynamic dispatch reference variable call according to object 
        obj0.show();

        /* 
         * can't use child-eat even its a child object 
         * we need to solve this how ?
         */
        //obj0.child_eat();
        
        // downcasting objB
        upcast_down_B objB = (upcast_down_B) obj0 ;  // downcasting
        // changing parent pointer to child pointer 
        objB.child_eat();
    }
}
