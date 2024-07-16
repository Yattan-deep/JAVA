class A 
{
    private int age; // set to 0 
    private String name; // set to null

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}

public class Encapsulation_getter_setter {
    public static void main(String[] args) 
    {
        A a = new A();
        System.out.println(a.getName() +" : "+ a.getAge());
        a.setName("Rahul");
        a.setAge(10);
        System.out.println(a.getName() + " : " + a.getAge());
    }
}
