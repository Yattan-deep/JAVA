// every class is inhert by Object class 
// every constructor call super() first

class A // extends Object
{
    int num;
    A() { 
        // super(); called by compiler
        System.out.println("calling A : ");
        num  = 0; 
    }
    A(int num) 
    {
        // super(); called by compiler
        System.out.println("calling A int : ");
        this.num = num; 
    }  
}

class B extends A 
{
    int num;
    B() { 
        // super(); called by compiler
        System.out.println("calling B : ");
        num  = 0; 
    }
    B(int num) { 
        // super(); called by compiler
        System.out.println("calling B int : ");
        this.num = num;
    }  
}

public class superthis {
    // this() method consturctor of current class 
    // super() method call constructor of super class
    public static void main(String[] args) 
    {
        B obj0 = new B();
        B obj1 = new B(1);
    }
}
