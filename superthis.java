// every class is inhert by Object class 
// every constructor call super() first

class super_A // extends Object
{
    int num;
    super_A() { 
        // super(); called by compiler
        System.out.println("calling A : ");
        num  = 0; 
    }
    super_A(int num) 
    {
        // super(); called by compiler
        System.out.println("calling A int : ");
        this.num = num; 
    }  
}

class super_B extends super_A 
{
    int num;
    super_B() { 
        // super(); called by compiler
        System.out.println("calling B : ");
        num  = 0; 
    }
    super_B(int num) { 
        // super(); called by compiler
        //super(num); // calling parametrize A(num) constructor

        // ? we can't use this and super in same constructor ...
        this(); // calling B() default constructor 
        System.out.println("calling B int : ");
        this.num = num;
    }  
}

public class superthis {
    // this() method consturctor of current class 
    // super() method call constructor of super class
    public static void main(String[] args) 
    {
        super_B obj0 = new super_B();
        super_B obj1 = new super_B(1);

    }
}
