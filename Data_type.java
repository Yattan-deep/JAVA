public class Data_type 
{
    public static void main(String[] agr )
    {
        byte num1 = 10;  // 8 bit
        short num2 = 20; // 16 bit
        int num3 = 10; // 32 bit
        long num4 = 10; // 64 bit 

        float fnum = 10.0f; // 32 bit  ------ NOT Default 
        double dnum = 10.0; // 64 bit -------Default 

        char c = 'J'; // 16 bits ----- UNICODE (2 BYTES)

        boolean b = true; // not specified defends upon JVM

        // Literal format 

        // easy to read zeros 

        int easy_read = 10_00_000_00;
        System.out.println(easy_read +  " <-- this is easy to read we can put _ between zeros,");

        // we can increment CHAR values also
        char a = 'a';
        a++;
        System.out.println(a + " <-- it should show a in out a++ == b,");
    }
}
