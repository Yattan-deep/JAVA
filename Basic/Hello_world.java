public class Hello_world {
    public static void main(String[] arg)
    {
        System.out.println("Hello_world");

        String str = "Hello\0World";  // "\0" is converted to Unicode == ``  
        System.out.println(str); // prints "HelloWorld"
    }
}
