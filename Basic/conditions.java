public class conditions {
    public static void main(String[] args) {
        // if else if (SAME AS CPP)

        // check legal to drive if 18 - 59 only otherwise not otherwise give mesage acc.
        int age = 40;

        if( age > 17 && age < 60 ) System.out.println("legal to drive ");
        
        else if ( age < 18 ) System.out.println("Go to School KID ");

        else System.out.println("Tell me where u want to go ");


        // BUT BUT Be carefull

        // compiler error BOOLEAN need to be there in if -- JAVA 
        // if( 1 ) System.out.println("Output with 1 only ");

        // SWITCH 
        // TELL DAY acording to number 
        
        int n = 7; // default 

        switch ( n ) {
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUES");
                break;            
            case 3:
                System.out.println("WED");
                break;           
            case 4:
                System.out.println("THUS");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SATU");
                break;
            case 7:
                System.out.println("SUN");
                break;
            default:
                System.out.println("Give correct input");
                // NO NEED for break ... in ... default ...
        }
    }
}
