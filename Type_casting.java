public class Type_casting {
    public static void main(String[] args) 
    {
        // Type casting vs Type convesion 
        // WHEN Compiler do its TYPE CONVERSION other TYPE CASTING
        
        // Smaller to Biger ( Type Conversion )
        byte a = 127 ; 
        int b = a;

        float fnum1 = 8.9f;
        double dnum = fnum1;

        System.out.println(a + " " + b  + " " + fnum1 + " " + dnum );  

        // Bigger to smaller TYPE CASTING ( USER DEFINE )

        //  new_number = old_number % ( smaller_range )
        int bigger_num = 256 ;
        byte smaller_number = (byte)bigger_num; 


        System.out.println(smaller_number); 


        // type permotion 

        byte a2 = 10;
        byte b2 = 100;

        int type_permotion = a2 * b2 ;

        // when range of result if bigger than used operators 
    }
}
