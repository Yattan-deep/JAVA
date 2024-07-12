public class loops {

    // Which loop should we use 
    // When we know count of iteration THEN -> FOR LOOP
    // when we don't know but condition is known then -- WHILE loop (DATABASE , end of file (reading a file))
    // DO while --> when we want to do something atleast once
    public static void main(String[] args) {
        
        //(SAME AS CPP)
        // for loop 
        for( int i =  1 ; i < 8 ; i++ )
            System.out.println(i + " value of i");
        // single line code in loop no need of { }

        System.out.println("\nwhile loop");

        int n = 1;
        while( n < 8 )
        {
            System.out.println(n + " value of i");
            n++;
        }

        System.out.println("\nDO WHILE");
        // Do while
        int x = 0;
        do 
        {
            System.out.println(x + " Do it atleast onces");
        }while(x > 0);

    }
}
