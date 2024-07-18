package Advance;


// to fix value for a constant == 

/* 
 * Why Enums are Immutable:
Type Safety: Ensures that enum constants maintain their defined values throughout the program execution.

Thread Safety: Since enums are immutable, they can be safely shared in concurrent programming scenarios without synchronization issues.

Predictability: Code relying on enums can safely assume that the set of constants will not change unexpectedly.
 */

enum Day
{
    Monday("Mon") , Tuesday("Tues") , Wednesday("Wed") , 
    Thusday("Thus") , Friday("Friday") , Saturday("Sat") , Sunday("Sun") ;// these are objects

    public final String Abre ;

    // constructor for object
    Day( String Abre ) { this.Abre = Abre; }

    public String getAbre() {  return Abre; }
}
public class Enum 
{
    public static void main(String args[ ])
    {
        // Enum is a special type of class which have const object which are static , final , public 
        // create an object 

        Day today = Day.Monday;
        System.out.println( today.getAbre() );

    }    
}
