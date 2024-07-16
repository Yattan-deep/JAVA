// ONLY one class can be public in JAVA 
// other classes can be default 

class calc
{

}

public class method_overloading
{
    // variable common for all instance
    public static int instance = 0;
    public static int  add ( int a , int b )  // static member 
    { 
        return a + b ;
    }
    public static int add ( int a , int b , int c ) // static member 
    {
        return a + b + c ;
    }
    public static void main(String[] args) 
    {
        

        System.out.println(add(1,2)); // static member 
        System.out.println(add(1,2,3)); // static member 

        // create object 
        
    } 
}