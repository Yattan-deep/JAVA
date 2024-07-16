public class print {

    public static void main(String[] args) { 
        String str = "Hello\0World";  // "\0" is converted to Unicode == ``  
        System.out.println(str); // prints "HelloWorld"
    }
    
}
