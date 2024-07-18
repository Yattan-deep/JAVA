package Advance;

class OuterClassA{
    private int a ;
    private static int b = 30;

    static public void show()
    {
        System.out.println("Welcome");
    }
    private void showOuter() 
    {
        System.out.println("This is Outer Class show method "); return ;
    }
    class InnerClassA // inner class have private access too ... 
    {
        InnerClassA() { a = 10; System.out.println("calling inner class constructor"); } 

        public void showInner()
        {
            a = 20;
            show(); // acess to static member als0
            showOuter(); // acess to outer class method 
            System.out.println("Setting value of a :" + a );
        }
    }

    // static inner class it has only acess to static data member and static methods 

    static class StaticInnerClassA
    {
        StaticInnerClassA() { b = 50; System.out.println("calling static inner class"); }

        public void StaticInnerClassAShow()
        {
           //  showOuter(); not acess to instance method...
           show(); // acess to static method only...
        }

    }
}

public class inner_class {

    public static void main(String[] args) {
        OuterClassA obj = new OuterClassA();
        //obj.showInner(); -------> not possible 
        //create object of inner class TOo use showInner() ;
        OuterClassA.InnerClassA obj1 = obj.new InnerClassA();
        obj1.showInner();
    }
    
}
