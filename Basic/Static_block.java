// A static block is use to intialize static variable and do this which are needed to do at first 
// Static block is call even before the constructor 

// ************ Static block can be used only ************** after a obj is created ...
// TO load class without object we can use forName method in Class class which load class in memory 
// and then we can use static block to initialize static variable 

class Static_A
{
    static int a;
    static
    {
        System.out.println("Welcome");
        a = 10;
    }

    Static_A(int x)
    {
        System.out.println("Constructor");
        a += x ;
    }
}

// loading class without using OBJ using Class class

class Static_B 
{
    static int a;

    static{ a = 10; System.out.println("value from class B : " + a); }

    public void show() 
    {
        System.out.println("Value of a : " + a);
    }
}

public class Static_block 
{

    public static void main(String[] args) {


        Static_A obj = new Static_A(200);
        System.out.println("Value of a : " + obj.a);
        
        // Load class without 
        try
        {
            //CLASS 
            Class.forName("B");
        }
        catch(Exception e)
        {
            System.out.println("Class not found : " + e);
        }

 
    }
}
