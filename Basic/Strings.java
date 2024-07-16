public class Strings 
{
    public static void main(String[] args) {
        String s1 = "Hello";
        StringBuffer str1 = new StringBuffer();
        
        System.out.println(str1.capacity()); // default (16 bit 16 char)

        StringBuffer str2 = new StringBuffer("Hello");
        System.out.println(str2.capacity()); // 5 + 16 = 21 
        
    }    
}
