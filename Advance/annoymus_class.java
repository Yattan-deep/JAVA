package Advance;


// class without name , Single implementation
class ACA
{
    private int a ;
    public int x ;
    public void show()
    {
        System.out.println("Welcome to ACA " + a);
    }

    public void non_driven()
    {
        System.out.println("Non_overrided function ");
    }

}

public class annoymus_class {
    public static void main(String[] args) 
    {
        ACA obj = new ACA(); // simple class

        ACA obj2 = new ACA() {

            // can't create new methods here
            public void show() 
            {
                x = 10;
                System.out.println("Welcome to Anomus_class acess to a is forbiden PRIVATE but x : " + x);
            }
        };

        obj2.show();
        obj2.non_driven(); // both overloaded and normal function can be used...
        obj.show();

        
    }
}
